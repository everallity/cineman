/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Admin
 */
public class DAO {
    private Connection con;
    public DAO() throws ClassNotFoundException{
        if(con==null){
            String dbUrl ="jdbc:mysql://localhost:3306/cineman";
            String dbClass = "com.mysql.cj.jdbc.Driver";
            try{
                Class.forName(dbClass);
                con = DriverManager.getConnection (dbUrl, "root", "Abcd1234");
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    public Connection getConnection()throws Exception{
            String dbUrl="jdbc:mysql://localhost:3306/cineman";
            String dbClass="com.mysql.cj.jdbc.Driver";
            
                Class.forName(dbClass);
                return DriverManager.getConnection(dbUrl,"root","Abcd1234");

            
    }
}
