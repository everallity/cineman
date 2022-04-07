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
public class MovieDAO extends DAO {
    //private DAO d;
    //private Connection con;
    public MovieDAO()throws ClassNotFoundException{
        super();
    }
    private PreparedStatement ps;
    private ResultSet rs;
    public Movie getMoviebyID(String movieid){
        Movie m= new Movie();
        try{
            String query="select * from movie where id=?";
            ps=con.prepareStatement(query);
            ps.setString(1, movieid);
            rs=ps.executeQuery();
            while(rs.next()){
                m.setId(rs.getInt("id"));
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
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return m;
    }
    public List<Movie> getMovieList(){
        List<Movie> list=new ArrayList<Movie>();
        try{
            //b1:query
         /*   
            //b2:
          //  con=dao.getConnection();
            String dbUrl="jdbc:mysql://localhost:3306/cineman";
            String dbClass="com.mysql.cj.jdbc.Driver";
        try{
            Class.forName(dbClass);
            con=DriverManager.getConnection (dbUrl,"root","Abcd1234");
        }catch(Exception e){
            e.printStackTrace();
        }*/
            String query="select * from movie";
            ps=con.prepareStatement(query);
            rs=ps.executeQuery();
            while(rs.next()){
                Movie m=new Movie();
                m.setId(rs.getInt("id"));
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
    public static void main(String[] args) throws ClassNotFoundException{
        List<Movie> list=new ArrayList<Movie>();
        MovieDAO md=new MovieDAO();
        list=md.getMovieList();
        for(Movie i:list){
            System.out.println(i.getName()+i.getTrailer()+i.getImage());
        }
    }
}
