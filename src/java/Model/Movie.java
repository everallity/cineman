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
public class Movie implements Serializable {
    String name,direct,act,genre,language,rated,duration,premiere,trailer,image;

    public Movie() {
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }



    

    public String getName() {
        return name;
    }

    public Movie(String name, String direct, String act, String genre, String language, String rated, String duration, String premiere, String trailer, String image) {
        this.name = name;
        this.direct = direct;
        this.act = act;
        this.genre = genre;
        this.language = language;
        this.rated = rated;
        this.duration = duration;
        this.premiere = premiere;
        this.trailer = trailer;
        this.image = image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirect() {
        return direct;
    }

    public void setDirect(String direct) {
        this.direct = direct;
    }

    public String getAct() {
        return act;
    }

    public void setAct(String act) {
        this.act = act;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getRated() {
        return rated;
    }

    public void setRated(String rated) {
        this.rated = rated;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getPremiere() {
        return premiere;
    }

    public void setPremiere(String premiere) {
        this.premiere = premiere;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }
    public Object[] toObject(){
        return new Object[]{
            name,direct,act,genre,language,rated,duration,premiere,trailer,image
        };
    }
}
