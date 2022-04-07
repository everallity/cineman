/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import static DAO.DAO.con;
import Model.MovieStat;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class MovieStatDAO extends DAO {
    public MovieStatDAO() throws ClassNotFoundException{
        super();              
    }
    private PreparedStatement ps;
    private ResultSet rs;
    public ArrayList<MovieStat> getMovieStatList(String start,String end) throws ParseException{
        ArrayList<MovieStat> list=new ArrayList<MovieStat>();
        SimpleDateFormat format=new SimpleDateFormat("yyyyMMdd");
        Date startdate=format.parse(start);
        Date enddate=format.parse(end);
        java.sql.Date sqlstart=new java.sql.Date(startdate.getTime());
        java.sql.Date sqlend= new java.sql.Date(enddate.getTime());
        String query="select m.id,m.name,SUM(b.amount)\n"
                    +"from movie m\n"
                    +"left join ticket t on m.id=t.movieid\n"
                    +"left join bill b on t.id=b.ticketid\n"
                    +"Where b.date between ? and ?\n"
                    +"group by m.name\n"
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
                MovieStat m=new MovieStat();
                m.setMovieid(rs.getInt("id"));
                m.setName(rs.getString("name"));
                m.setRevenue(rs.getFloat("Sum(b.amount)"));
                list.add(m);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }
    public static void main(String[] args) throws ClassNotFoundException, ParseException {
        ArrayList<MovieStat> list=new ArrayList<MovieStat>();
        MovieStatDAO mvd=new MovieStatDAO();
        list=mvd.getMovieStatList("20220403", "20220406");
        for(MovieStat m:list){
            System.out.println(m.getName()+" "+m.getRevenue());
        }
    }
}
