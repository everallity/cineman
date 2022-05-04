/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import DAO.StaffDAO;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class StaffDAOTest {
    
    public StaffDAOTest() {
    }
    @Test
    public void checkLogin_duc_123() throws ClassNotFoundException{
        final boolean expected=true;
        final boolean actual;
        StaffDAO sd=new StaffDAO();
        actual=sd.checkLogin("duc","123");
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void checkLogin_trong_123() throws ClassNotFoundException{
        final boolean expected=false;
        final boolean actual;
        StaffDAO sd=new StaffDAO();
        actual=sd.checkLogin("trong","123");
        Assert.assertEquals(expected, actual);
    }
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
