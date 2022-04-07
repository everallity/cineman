/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Bill;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class BillDAO extends DAO{
    public BillDAO() throws ClassNotFoundException{
        super();
    }
    public void updateBill(int clientid,int ticketid){
        String sql = "insert into bill (ticketid,clientid,amount,date) value(?,?,200000,curdate())";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, ticketid);
            ps.setInt(2, clientid);
            ps.executeUpdate();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public ArrayList<Bill> getOrderByCusID(String clientid){
        ArrayList<Bill> list = new ArrayList<>();
        int id=Integer.parseInt(clientid);
        String sql = "select * from bill where clientid = ?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Bill b = new Bill();
                b.setTicketid(Integer.toString(rs.getInt("ticketid")));
                b.setClientid(Integer.toString(rs.getInt("clientid")));
                b.setAmount(rs.getFloat("amount"));
                b.setDate(rs.getDate("date"));
                list.add(b);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return list;
    }
    public ArrayList<Bill> getOrderByMovieID(String movieid){
        ArrayList<Bill> list = new ArrayList<>();
        int id=Integer.parseInt(movieid);
        String sql = "select * from bill b\n"
                + "left join ticket t on b.ticketid=t.id\n"
                + "left join movie m on t.movieid=m.id\n"
                + "where m.id=?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Bill b = new Bill();
                b.setTicketid(Integer.toString(rs.getInt("ticketid")));
                b.setClientid(Integer.toString(rs.getInt("clientid")));
                b.setAmount(rs.getFloat("amount"));
                b.setDate(rs.getDate("date"));
                list.add(b);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return list;
    }
}
