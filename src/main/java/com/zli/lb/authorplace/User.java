package com.zli.lb.authorplace;

import javax.validation.constraints.NotEmpty;

public class User {
    private int Userid;
    @NotEmpty (message = "name must not be empty.")
    private String name;
    @NotEmpty (message = "lastname must not be empty.")
    private String lastname;
    @NotEmpty (message = "password cannot be empty.")
    private String password;


    public int getUserid() {
        return Userid;
    }

    public void setUserid(int userid) {
        Userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "Userid=" + Userid +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}