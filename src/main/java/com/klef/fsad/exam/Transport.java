package com.klef.fsad.exam;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "transports")
public class Transport {

    @Id
    private Integer id;   

    private String name;
    private String date;
    private boolean status;

    
    public Transport() {}

    
    public Transport(Integer id, String name, String date, boolean status) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.status = status;
    }

    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}