package com.example.flightbooking.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {

    @Id
    int userId;
    String userName;
    String password;
    String email;
    String mobileNumber;
    String Location;
    String from;
    String to;
    String firstClass;

    public User()
    {
        
    }
    
    public User(int userId, String userName, String password, String email, String mobileNumber, String location,
            String from, String to, String firstClass) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.mobileNumber = mobileNumber;
        Location = location;
        this.from = from;
        this.to = to;
        this.firstClass = firstClass;
    }
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getMobileNumber() {
        return mobileNumber;
    }
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    public String getLocation() {
        return Location;
    }
    public void setLocation(String location) {
        Location = location;
    }
    public String getFrom() {
        return from;
    }
    public void setFrom(String from) {
        this.from = from;
    }
    public String getTo() {
        return to;
    }
    public void setTo(String to) {
        this.to = to;
    }
    public String getFirstClass() {
        return firstClass;
    }
    public void setFirstClass(String firstClass) {
        this.firstClass = firstClass;
    }

}