/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class MovieStat {
    private Movie m;
    private float revenue;
    private String rating;

    public MovieStat(Movie m) {
        this.m = m;
    }

    public MovieStat(Movie m, float revenue, String rating) {
        this.m = m;
        this.revenue = revenue;
        this.rating = rating;
    }

    public Movie getM() {
        return m;
    }

    public void setM(Movie m) {
        this.m = m;
    }

    public float getRevenue() {
        return revenue;
    }

    public void setRevenue(float revenue) {
        this.revenue = revenue;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
    
    
    
}
