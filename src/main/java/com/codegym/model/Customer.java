package com.codegym.model;

public class Customer {
    private int id;
    private String name;
    private String gmail;
    private String address;
    //Contructor k doi so

    public Customer(){

    }
    //Contructor co doi so
    public Customer(int id, String name, String gmail, String address) {
        this.id = id;
        this.name = name;
        this.gmail = gmail;
        this.address = address;
    }
    //Getter va Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
