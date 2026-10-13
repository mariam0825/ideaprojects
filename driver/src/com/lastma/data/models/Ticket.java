package com.lastma.data.models;

import java.util.Date;

public class Ticket {
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String id;
    private ViolationType type;
    private int ViolationFee;
    private Date issusedDate;
    private Date dueDate;

    public ViolationType getType() {
        return type;
    }

    public void setType(ViolationType type) {
        this.type = type;
    }

    public int getViolationFee() {
        return ViolationFee;
    }

    public void setViolationFee(int violationFee) {
        ViolationFee = violationFee;
    }

    public Date getIssusedDate() {
        return issusedDate;
    }

    public void setIssusedDate(Date issusedDate) {
        this.issusedDate = issusedDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
}
