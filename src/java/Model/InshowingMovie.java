/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class InshowingMovie {
    private Movie m;
    private ShowRoom s;
    private String starttime,endtime;

    public InshowingMovie(Movie m, ShowRoom s) {
        this.m = m;
        this.s = s;
    }

    public InshowingMovie(Movie m, ShowRoom s, String starttime, String endtime) {
        this.m = m;
        this.s = s;
        this.starttime = starttime;
        this.endtime = endtime;
    }

    public Movie getM() {
        return m;
    }

    public void setM(Movie m) {
        this.m = m;
    }

    public ShowRoom getS() {
        return s;
    }

    public void setS(ShowRoom s) {
        this.s = s;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }
    
}
