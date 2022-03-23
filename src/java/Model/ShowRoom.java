/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class ShowRoom {
    private String type,note,id;
    private int numofseat;
    public ShowRoom() {
    }

    public ShowRoom(String type, String note, String id, int numofseat) {
        this.type = type;
        this.note = note;
        this.id = id;
        this.numofseat = numofseat;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNumofseat() {
        return numofseat;
    }

    public void setNumofseat(int numofseat) {
        this.numofseat = numofseat;
    }
    
}
