/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import DAO.MovieDAO;
import Model.Movie;
import java.util.ArrayList;
import java.util.List;
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
    @Test
    public void getMovieListTest() throws ClassNotFoundException{
        Movie m1=new Movie("Spider Man Far From Home","Anthony Russo","Tom Hollan, Zandaya","Action, Scifi","English","PG13","2h30m","3/23/2017","https://www.youtube.com/watch?v=Nt9L1jCKGnE","image/spiderman.jpg",1);
        Movie m2=new Movie("Avenger Endgame","Anthony Russo","Chris Evans, Scarlet Johannson","Action, Scifi","English","PG13","2h30m","4/26/2019","https://www.youtube.com/watch?v=TcMBFSGVi1c","image/avenger.jpg",2);
        Movie m3=new  Movie("Harry Potter and the Deathly Hallows: Part 1","David Yates","Emma Watson, Daniel Radcliffe","Fantasy","English","PG13","2h30m","10/26/2010","https://www.youtube.com/watch?v=MxqsmsA8y5k","image/harrypotter.jpg",3);
        Movie m4=new Movie("Doraemon: Nobita's new dinosaur","Kazuaki Imai","Ryûnosuke Kamiki","Adventure","English","PG13","2h","12/18/2020","https://www.youtube.com/watch?v=XTkslNjdyy0","image/doraemon1.jpg",4);
        List<Movie> actual=new ArrayList<Movie>();
        MovieDAO md=new MovieDAO();
        actual=md.getMovieList();
        Assert.assertEquals(m1.getAct(), actual.get(0).getAct());
        Assert.assertEquals(m1.getDirect(), actual.get(0).getDirect());
        Assert.assertEquals(m1.getDuration(), actual.get(0).getDuration());
        Assert.assertEquals(m1.getGenre(), actual.get(0).getGenre());
        Assert.assertEquals(m1.getId(), actual.get(0).getId());
        Assert.assertEquals(m1.getImage(), actual.get(0).getImage());
        Assert.assertEquals(m1.getLanguage(), actual.get(0).getLanguage());
        Assert.assertEquals(m1.getName(), actual.get(0).getName());
        Assert.assertEquals(m1.getPremiere(), actual.get(0).getPremiere());
        Assert.assertEquals(m1.getRated(), actual.get(0).getRated());
        Assert.assertEquals(m1.getTrailer(), actual.get(0).getTrailer());
        
        Assert.assertEquals(m2.getAct(), actual.get(1).getAct());
        Assert.assertEquals(m2.getDirect(), actual.get(1).getDirect());
        Assert.assertEquals(m2.getDuration(), actual.get(1).getDuration());
        Assert.assertEquals(m2.getGenre(), actual.get(1).getGenre());
        Assert.assertEquals(m2.getId(), actual.get(1).getId());
        Assert.assertEquals(m2.getImage(), actual.get(1).getImage());
        Assert.assertEquals(m2.getLanguage(), actual.get(1).getLanguage());
        Assert.assertEquals(m2.getName(), actual.get(1).getName());
        Assert.assertEquals(m2.getPremiere(), actual.get(1).getPremiere());
        Assert.assertEquals(m2.getRated(), actual.get(1).getRated());
        Assert.assertEquals(m2.getTrailer(), actual.get(1).getTrailer());
        
        Assert.assertEquals(m3.getAct(), actual.get(2).getAct());
        Assert.assertEquals(m3.getDirect(), actual.get(2).getDirect());
        Assert.assertEquals(m3.getDuration(), actual.get(2).getDuration());
        Assert.assertEquals(m3.getGenre(), actual.get(2).getGenre());
        Assert.assertEquals(m3.getId(), actual.get(2).getId());
        Assert.assertEquals(m3.getImage(), actual.get(2).getImage());
        Assert.assertEquals(m3.getLanguage(), actual.get(2).getLanguage());
        Assert.assertEquals(m3.getName(), actual.get(2).getName());
        Assert.assertEquals(m3.getPremiere(), actual.get(2).getPremiere());
        Assert.assertEquals(m3.getRated(), actual.get(2).getRated());
        Assert.assertEquals(m3.getTrailer(), actual.get(2).getTrailer());
       
        Assert.assertEquals(m4.getAct(), actual.get(3).getAct());
        Assert.assertEquals(m4.getDirect(), actual.get(3).getDirect());
        Assert.assertEquals(m4.getDuration(), actual.get(3).getDuration());
        Assert.assertEquals(m4.getGenre(), actual.get(3).getGenre());
        Assert.assertEquals(m4.getId(), actual.get(3).getId());
        Assert.assertEquals(m4.getImage(), actual.get(3).getImage());
        Assert.assertEquals(m4.getLanguage(), actual.get(3).getLanguage());
        Assert.assertEquals(m4.getName(), actual.get(3).getName());
        Assert.assertEquals(m4.getPremiere(), actual.get(3).getPremiere());
        Assert.assertEquals(m4.getRated(), actual.get(3).getRated());
        Assert.assertEquals(m4.getTrailer(), actual.get(3).getTrailer());
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
