/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import static DAO.DAO.con;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Admin
 */
public class PersonDAO extends DAO {
    public PersonDAO() throws ClassNotFoundException{
        super();
    }
    public int checkLogin(String un,String pw){
        int result=0;
        String sql="Select * from client where username=? and password =?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,un);
            ps.setString(2,pw);
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {                
                result = rs.getInt("id");
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
