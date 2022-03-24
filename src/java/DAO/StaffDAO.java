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
public class StaffDAO extends DAO{
    public StaffDAO() throws ClassNotFoundException{
        super();
    }
    public boolean checkLogin(String un,String pw){
        boolean result = false;
        String sql = "SELECT * FROM staff WHERE username = ? AND password = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,un);
            ps.setString(2,pw);
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {                
                result = true;
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
