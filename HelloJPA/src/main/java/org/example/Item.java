package org.example;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "items")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    private String itemName;
    private Integer demintionsW;
    private Integer demintionsH;
    private String author;
    private String manufacturer;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getDemintionsW() {
        return demintionsW;
    }

    public void setDemintionsW(Integer demintionsW) {
        this.demintionsW = demintionsW;
    }

    public Integer getDemintionsH() {
        return demintionsH;
    }

    public void setDemintionsH(Integer demintionsH) {
        this.demintionsH = demintionsH;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }






}
