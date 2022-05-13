/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.ClientStat;
import Model.Movie;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 *
 * @author Admin
 */
public class ClientStatDAO extends DAO {
    //private DAO d;
    //private Connection con;
    public ClientStatDAO() throws ClassNotFoundException{
        super();
    }
    private PreparedStatement ps;
    private ResultSet rs;
    public ArrayList<ClientStat> getClientStatList(String start,String end)throws ParseException{
        ArrayList<ClientStat> list=new ArrayList<ClientStat>();
        java.sql.Date sqlend;
        java.sql.Date sqlstart;
        try{
            SimpleDateFormat format=new SimpleDateFormat("yyyyMMdd");
            Date startdate=format.parse(start);
            Date enddate=format.parse(end);
            sqlstart=new java.sql.Date(startdate.getTime());
            sqlend= new java.sql.Date(enddate.getTime());
        }catch(ParseException e){
            e.printStackTrace();
            return null;
        }
        
        
        String query="select c.id,c.name,SUM(b.amount)\n"
                    +"from client c\n"
                    +"left join bill b on c.id=b.clientid\n"
                    +"Where date between ? and ?\n"
                    +"group by c.name\n"
                    +"order by b.amount desc";
        try{
            //b1:query
            
            //b2:
          //  con=dao.getConnection();
            //String dbUrl="jdbc:mysql://localhost:3306/cineman";
           // String dbClass="com.mysql.cj.jdbc.Driver";
           
       /* try{
            Class.forName(dbClass);
            con=DriverManager.getConnection (dbUrl,"root","Abcd1234");
        }catch(Exception e){
            e.printStackTrace();
        }*/
            
            ps=con.prepareStatement(query);
            ps.setDate(1, sqlstart);
            ps.setDate(2, sqlend);
            rs=ps.executeQuery();
            while(rs.next()){
                ClientStat s=new ClientStat();
                s.setClientid(rs.getInt("id"));
                s.setName(rs.getString("name"));
                s.setNumoftrans(rs.getInt("id"));
                s.setTotalsum(rs.getFloat("Sum(b.amount)"));
                list.add(s);
            }
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
        return list;
    }
    public static void main(String[] args) throws ClassNotFoundException, ParseException {
        ArrayList<ClientStat> list=new ArrayList<ClientStat>();
        ClientStatDAO csd=new ClientStatDAO();
        list=csd.getClientStatList("20220403", "20220406");
        for(ClientStat c:list){
            System.out.println(c.getClientid()+" "+c.getTotalsum());
        }
    }
  
}
