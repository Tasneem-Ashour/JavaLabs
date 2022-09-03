package org.example.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "stores")
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    private String storeName;

    public Store() {
    }

    public Store(String storeName) {
        this.storeName = storeName;
    }

    public int getId() {
        return Id;
    }


    public String getStoreName() {
        return storeName;
    }

    @Override
    public String toString() {
        return "Store{" +
                "Id=" + Id +
                ", storeName='" + storeName + '\'' +
                '}';
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }
}
