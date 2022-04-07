/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import static DAO.DAO.con;
import Model.Bill;
import Model.Seat;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class SeatDAO extends DAO{
    public SeatDAO() throws ClassNotFoundException{
        super();
    }
    public void updateSeat(int seatid){
      String sql="update seat set status=0 where id=?";
      try{
          PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, seatid);
            ps.executeUpdate();
      }catch(Exception e){
          e.printStackTrace();
      }
    }
    public ArrayList<Seat> getAvailSeatByTime(String time){
        ArrayList<Seat> list=new ArrayList<Seat>();
        String showtime=time;
        String sql = "select * from seat where showtime = ? AND status=1";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, showtime);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Seat s = new Seat();
                s.setSeatid(rs.getInt("id"));
                s.setSeatcol(rs.getString("seatcol"));
                s.setSeatrow(rs.getString("seatrow"));
                s.setShowtime(rs.getString("showtime"));
                s.setSrid(rs.getInt("srid"));
                s.setStatus(rs.getBoolean("status"));
                s.setShowtime(showtime);
                list.add(s);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return list;
    }
}
