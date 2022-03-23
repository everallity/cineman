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
public class ClientStatDAO {
    private DAO d;
    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;
    public List<ClientStat> getClientStatList(){
        List<ClientStat> list=new ArrayList<ClientStat>();
        try{
            //b1:query
            String query="select * from clientstat";
            //b2:
          //  con=dao.getConnection();
            String dbUrl="jdbc:mysql://localhost:3306/cineman";
        String dbClass="com.mysql.cj.jdbc.Driver";
        try{
            Class.forName(dbClass);
            con=DriverManager.getConnection (dbUrl,"root","Abcd1234");
        }catch(Exception e){
            e.printStackTrace();
        }
            
            ps=con.prepareStatement(query);
            rs=ps.executeQuery();
            while(rs.next()){
                ClientStat s=new ClientStat();
                s.setClientid(2);
                s.setNumoftrans(3);
                s.setTotalsum(3);
                list.add(s);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }
  
}
