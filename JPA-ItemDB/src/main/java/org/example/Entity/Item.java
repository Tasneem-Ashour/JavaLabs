package org.example.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "items")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    private String itemName;

    @Override
    public String toString() {
        return "Item{" +
                "Id=" + Id +
                ", itemName='" + itemName + '\'' +
                ", demintionsW=" + demintionsW +
                ", demintionsH=" + demintionsH +
                ", author='" + author + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }

    private Integer demintionsW;
    private Integer demintionsH;
    private String author;

    public Item(String itemName, Integer demintionsW, Integer demintionsH, String author, String manufacturer) {
        this.itemName = itemName;
        this.demintionsW = demintionsW;
        this.demintionsH = demintionsH;
        this.author = author;
        this.manufacturer = manufacturer;
    }

    private String manufacturer;

    public Item() {

    }

    public Integer getId() {
        return Id;
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



