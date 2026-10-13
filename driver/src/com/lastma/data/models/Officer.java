package com.lastma.data.models;

public class Officer {
    public String getFullName;
    private String email;
    private int id;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGetFullName() {
        return getFullName;
    }

    public void setGetFullName(String getFullName) {
        this.getFullName = getFullName;
    }
}
