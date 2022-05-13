/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import DAO.MovieStatDAO;
import Model.MovieStat;
import java.text.ParseException;
import java.util.ArrayList;
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
public class MovieStatDAOTest {
    
    public MovieStatDAOTest() {
    }
    @Test
    public void MovieStatDAOTest_20220403_20220407() throws ClassNotFoundException, ParseException{
        ArrayList<MovieStat> actual=new ArrayList<MovieStat>();
        MovieStat ms1=new MovieStat("Spider Man Far From Home",600000,1);
        MovieStat ms2=new MovieStat("Doraemon: Nobita's new dinosaur",200000,4);
        MovieStat ms3=new MovieStat("Avenger Endgame",350000,2);
        MovieStatDAO msd=new MovieStatDAO();
        actual=msd.getMovieStatList("20220403", "20220407");
        Assert.assertEquals(ms1.getName(),actual.get(0).getName());
        Assert.assertEquals(ms1.getMovieid(), actual.get(0).getMovieid());
        Assert.assertEquals(ms1.getRevenue(), actual.get(0).getRevenue(),0.0f);
        Assert.assertEquals(ms2.getName(),actual.get(1).getName());
        Assert.assertEquals(ms2.getMovieid(), actual.get(1).getMovieid());
        Assert.assertEquals(ms2.getRevenue(), actual.get(1).getRevenue(),0.0f);
        Assert.assertEquals(ms3.getName(),actual.get(2).getName());
        Assert.assertEquals(ms3.getMovieid(), actual.get(2).getMovieid());
        Assert.assertEquals(ms3.getRevenue(), actual.get(2).getRevenue(),0.0f);
        
    }
    @Test
    public void MovieStatDAOTest_20220402_20200404() throws ClassNotFoundException, ParseException{
        ArrayList<MovieStat> actual=new ArrayList<MovieStat>();
       
        MovieStatDAO msd=new MovieStatDAO();
        actual=msd.getMovieStatList("20220402", "20220404");
        Assert.assertTrue(actual.isEmpty());
    }
    @Test
    public void MovieStatDAOTest_20220102_20220105() throws ClassNotFoundException, ParseException{
        ArrayList<MovieStat> actual=new ArrayList<MovieStat>();
       
        MovieStatDAO msd=new MovieStatDAO();
        actual=msd.getMovieStatList("20220102", "20220105");
        Assert.assertTrue(actual.isEmpty());
    }
    @Test
    public void MovieStatDAOTest_wrongformat() throws ClassNotFoundException, ParseException{
        ArrayList<MovieStat> actual=new ArrayList<MovieStat>();  
        MovieStatDAO msd=new MovieStatDAO();
        actual=msd.getMovieStatList("03/04/2022", "07/04/2022");
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
