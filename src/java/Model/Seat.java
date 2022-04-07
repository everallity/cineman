/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class Seat {
    private int seatid,srid;
    private String seatcol,seatrow,showtime;
    private boolean status;

    public Seat() {
    }

    public Seat(int seatid, int srid, String seatcol, String seatrow, String showtime, boolean status) {
        this.seatid = seatid;
        this.srid = srid;
        this.seatcol = seatcol;
        this.seatrow = seatrow;
        this.showtime = showtime;
        this.status = status;
    }

    public int getSeatid() {
        return seatid;
    }

    public void setSeatid(int seatid) {
        this.seatid = seatid;
    }

    public int getSrid() {
        return srid;
    }

    public void setSrid(int srid) {
        this.srid = srid;
    }

    public String getSeatcol() {
        return seatcol;
    }

    public void setSeatcol(String seatcol) {
        this.seatcol = seatcol;
    }

    public String getSeatrow() {
        return seatrow;
    }

    public void setSeatrow(String seatrow) {
        this.seatrow = seatrow;
    }

    public String getShowtime() {
        return showtime;
    }

    public void setShowtime(String showtime) {
        this.showtime = showtime;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    
}
