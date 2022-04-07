/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class Person {
    String name,un,pw,email,phone,sex,birth;
    int id;
    public Person() {
    }

    public Person(String name, String un, String pw, String email, String phone, String sex, String birth, int id) {
        this.name = name;
        this.un = un;
        this.pw = pw;
        this.email = email;
        this.phone = phone;
        this.sex = sex;
        this.birth = birth;
        this.id = id;
    }

    public Person(String name, String un, String pw, String email, String phone, String sex, String birth) {
        this.name = name;
        this.un = un;
        this.pw = pw;
        this.email = email;
        this.phone = phone;
        this.sex = sex;
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUn() {
        return un;
    }

    public void setUn(String un) {
        this.un = un;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }
    
}
