package com.example.dedok.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Calendar;

@Entity
public class DateWork {

    @Id
    Long id;
    Calendar dateOfWork;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Calendar getDateOfWork() {
        return dateOfWork;
    }

    public void setDateOfWork(Calendar dateOfWork) {
        this.dateOfWork = dateOfWork;
    }
}
