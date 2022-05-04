/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import DAO.BillDAO;
import Model.Bill;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class BillDAOTest {
    
    public BillDAOTest() {
    }
    @Test
    public void getOrderByMovieID_MovieID_4() throws ClassNotFoundException, ParseException{
        ArrayList<Bill> list=new ArrayList<Bill>();
        BillDAO bd=new BillDAO();
        Bill b=new Bill();
        b.setTicketid("9");
        b.setAmount(200000);
        b.setClientid("1");
        
        b.setDate(new SimpleDateFormat("yyyy-mm-dd").parse("2022-04-06"));
        list.add(b);
        ArrayList<Bill> actual=new ArrayList<Bill>();
        actual=bd.getOrderByMovieID("4");
        for(int i=0;i<list.size();i++){
            Assert.assertEquals(list.get(i).getAmount(), actual.get(i).getAmount(),0.0f);
            Assert.assertEquals(list.get(i).getClientid(), actual.get(i).getClientid());
            Assert.assertEquals(list.get(i).getDate(),actual.get(i).getDate());
            Assert.assertEquals(list.get(i).getTicketid(), actual.get(i).getTicketid());
        }
    }
    
    @Test
    public void getOrderByCusID_CustID1() throws ClassNotFoundException{
        ArrayList<Bill> list=new ArrayList<Bill>();
        BillDAO bd=new BillDAO();
        list=bd.getOrderByCusID("1");
        Assert.assertNotNull("Lay dc", list);
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
