/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import DAO.MovieDAO;
import Model.Movie;
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
public class MovieDAOTest {
    
    public MovieDAOTest() throws ClassNotFoundException {
        
    }
    @Test
    public void getMoviebyID_movieID1() throws ClassNotFoundException{
        Movie m=new Movie();
        m.setAct("Tom Hollan, Zandaya");
        m.setDirect("Anthony Russo");
        m.setDuration("2h30m");
        m.setGenre("Action, Scifi");
        m.setId(1);
        m.setImage("image/spiderman.jpg");
        m.setLanguage("English");
        m.setName("Spider Man Far From Home");
        m.setPremiere("3/23/2017");
        m.setRated("PG13");
        m.setTrailer("https://www.youtube.com/watch?v=Nt9L1jCKGnE");
        MovieDAO md=new MovieDAO();
        final Movie actual=md.getMoviebyID("1");
        Assert.assertEquals(m.getAct(), actual.getAct());
        Assert.assertEquals(m.getDirect(), actual.getDirect());
        Assert.assertEquals(m.getDuration(), actual.getDuration());
        Assert.assertEquals(m.getGenre(), actual.getGenre());
        Assert.assertEquals(m.getId(), actual.getId());
        Assert.assertEquals(m.getImage(), actual.getImage());
        Assert.assertEquals(m.getLanguage(), actual.getLanguage());
        Assert.assertEquals(m.getName(), actual.getName());
        Assert.assertEquals(m.getPremiere(), actual.getPremiere());
        Assert.assertEquals(m.getRated(), actual.getRated());
        Assert.assertEquals(m.getTrailer(), actual.getTrailer());
        
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
