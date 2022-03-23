/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class Ticket {
    private String seat,showtime;
    private float price;
    private Movie m;

    public Ticket(Movie m) {
        this.m = m;
    }

    public Ticket(String seat, String showtime, float price, Movie m) {
        this.seat = seat;
        this.showtime = showtime;
        this.price = price;
        this.m = m;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getShowtime() {
        return showtime;
    }

    public void setShowtime(String showtime) {
        this.showtime = showtime;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Movie getM() {
        return m;
    }

    public void setM(Movie m) {
        this.m = m;
    }
    
}
