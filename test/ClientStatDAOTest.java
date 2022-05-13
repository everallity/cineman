/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import DAO.ClientStatDAO;
import Model.ClientStat;
import java.text.ParseException;
import java.util.ArrayList;
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
public class ClientStatDAOTest {
    
    public ClientStatDAOTest() {
    }
    @Test
    public void getClientStatListTest_20220403_20220407() throws ClassNotFoundException, ParseException{
        ArrayList<ClientStat> actual=new ArrayList<ClientStat>();
        ClientStat cs1=new ClientStat(1,"trong",950000);
        ClientStat cs2=new ClientStat(2,"dat",200000);
        ClientStatDAO csd=new ClientStatDAO();
        actual=csd.getClientStatList("20220403", "20220407");
        Assert.assertEquals(cs1.getClientid(),actual.get(0).getClientid());
        Assert.assertEquals(cs1.getName(), actual.get(0).getName());
        Assert.assertEquals(cs1.getTotalsum(), actual.get(0).getTotalsum());
        Assert.assertEquals(cs2.getClientid(),actual.get(1).getClientid());
        Assert.assertEquals(cs2.getName(), actual.get(1).getName());
        Assert.assertEquals(cs2.getTotalsum(), actual.get(1).getTotalsum());
    }
    @Test
    public void getClientStatListTest_20220302_20200202() throws ClassNotFoundException, ParseException{
        ArrayList<ClientStat> actual=new ArrayList<ClientStat>();
        ClientStatDAO csd=new ClientStatDAO();
        actual=csd.getClientStatList("20220302", "20200202");
        Assert.assertTrue(actual.isEmpty());
    }
    @Test
    public void getClientStatListTest_20220102_20220105() throws ClassNotFoundException, ParseException{
        ArrayList<ClientStat> actual=new ArrayList<ClientStat>();
        ClientStatDAO csd=new ClientStatDAO();
        actual=csd.getClientStatList("20220102", "20220105");
        Assert.assertTrue(actual.isEmpty());
    }
    @Test
    public void getClientStatListTest_wrongformat() throws ClassNotFoundException, ParseException{
        ArrayList<ClientStat> actual=new ArrayList<ClientStat>();
        ClientStatDAO csd=new ClientStatDAO();
        actual=csd.getClientStatList("03/04/2022", "07/04/2022");
        Assert.assertEquals(null, actual);
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
