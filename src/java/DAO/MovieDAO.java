/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Movie;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class MovieDAO {
    private DAO d;
    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;
    public List<Movie> getMovieList(){
        List<Movie> list=new ArrayList<Movie>();
        try{
            //b1:query
            String query="select * from movie";
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
                Movie m=new Movie();
                m.setName(rs.getString(2));
                m.setDirect(rs.getString(3));
                m.setAct(rs.getString(4));
                m.setGenre(rs.getString(5));
                m.setLanguage(rs.getString(6));
                m.setRated(rs.getString(7));
                m.setDuration(rs.getString(8));
                m.setPremiere(rs.getString(9));
                m.setTrailer(rs.getString(10));
                m.setImage(rs.getString(11));
                list.add(m);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }
    public static void main(String[] args){
        List<Movie> list=new ArrayList<Movie>();
        MovieDAO dao=new MovieDAO();
        list=dao.getMovieList();
        for(Movie i:list){
            System.out.println(i.getName()+i.getTrailer());
        }
    }
}
