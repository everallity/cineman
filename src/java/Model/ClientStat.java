/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class ClientStat implements Serializable{
    private int clientid;
    private String name;

    public ClientStat(int clientid, String name, int numoftrans, float totalsum) {
        this.clientid = clientid;
        this.name = name;
        this.numoftrans = numoftrans;
        this.totalsum = totalsum;
    }
    private int numoftrans;
    private float totalsum;

    public ClientStat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClientStat(int clientid, int numoftrans, float totalsum) {
        this.clientid = clientid;
        this.numoftrans = numoftrans;
        this.totalsum = totalsum;
    }
    public int getClientid() {
        return clientid;
    }

    public void setClientid(int clientid) {
        this.clientid = clientid;
    }

    public int getNumoftrans() {
        return numoftrans;
    }

    public void setNumoftrans(int numoftrans) {
        this.numoftrans = numoftrans;
    }

    public float getTotalsum() {
        return totalsum;
    }

    public void setTotalsum(float totalsum) {
        this.totalsum = totalsum;
    }

   public Object[] toObject(){
       return new Object[]{
           clientid,numoftrans,totalsum
       };
   }
}
