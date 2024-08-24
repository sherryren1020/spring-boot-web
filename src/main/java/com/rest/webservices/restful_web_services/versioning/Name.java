package com.rest.webservices.restful_web_services.versioning;

public class Name {
    private String lname;
    private String fname;

    public Name(String lname, String fname) {
        this.lname = lname;
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    @Override
    public String toString() {
        return "Name{" +
                "lname='" + lname + '\'' +
                ", fname='" + fname + '\'' +
                '}';
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }
}
