package com.inline.app.inline.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "DEFECT")
public class FactoryDefect implements Serializable {

    @GeneratedValue
    @Id
    private Long id;
    private String brand;
    private Integer value;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getBrand() {
        return brand;
    }

    public Integer getValue() {
        return value;
    }
}
