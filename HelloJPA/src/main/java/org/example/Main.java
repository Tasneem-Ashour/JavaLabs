package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        Item item = new Item();
        item.setItemName("new from JPA");
        item.setDemintionsH(1);
        item.setDemintionsW(1);
        item.setAuthor("Author from JPA");
        item.setManufacturer("Main from JPA");

        entityManager.persist(item);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}