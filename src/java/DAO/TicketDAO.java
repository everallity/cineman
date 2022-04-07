/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Admin
 */
public class TicketDAO extends DAO {
    public TicketDAO() throws ClassNotFoundException{
        super();
    }
    public int getLatestTicket(){
        int ticketid=0;
        String sql = "select * from ticket";
        try{
            PreparedStatement ps =con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                ticketid=rs.getInt("id");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return ticketid;
    }
    public void updateTicket(int movieid,String seat,String showtime){
        String sql = "insert into ticket (movieid,seat,showtime,showroom,price) values(?,?,?,1,200000)";
       
        try{
            PreparedStatement ps =con.prepareStatement(sql);
            ps.setInt(1, movieid);
            ps.setString(2, seat);
            ps.setString(3, showtime);
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
