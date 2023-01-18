package Booking;

import java.util.Scanner;

//Client будет содержать поля: имя, фамилию, номер телефона, почту, ссылку на В111
public class Client {



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    private  String name ;

    private String sureName;
    private String phone;
    private String mail;
    public Client (String n, String sn, String p, String m, Bill b){
        this.name = n;
        this.sureName = sn;
        this.phone = p;
        this.mail = m;
        this.bill=b;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    private  Bill bill;


}
