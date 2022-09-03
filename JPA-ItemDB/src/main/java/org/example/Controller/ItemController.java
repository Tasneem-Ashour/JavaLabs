package org.example.Controller;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import org.example.Entity.Item;

import java.util.List;

public class ItemController {

    public static void insertRecord() {


        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA-Item");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        Item item = new Item("new from JPA", 1, 1, "Author from JPA", "Main from JPA");

        entityManager.persist(item);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();


    }

    public static void updateRecord() {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA-Item");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Integer key = Integer.valueOf(2);
        Item item = entityManager.find(Item.class, key);
        System.out.println("item name :: " + item.getItemName());
        System.out.println("item width :: " + item.getDemintionsW());
        System.out.println("item height :: " + item.getDemintionsH());
        System.out.println("author name  :: " + item.getAuthor());
        System.out.println("manufacturer name :: " + item.getManufacturer());


        item.setItemName("new for update");
        item.setDemintionsW(1);
        item.setDemintionsH(2);
        item.setAuthor("mm");
        item.setManufacturer("dd");


        entityManager.persist(item);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }

    public static void removeRecord() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA-Item");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Integer key = Integer.valueOf(202);
        Item item = entityManager.find(Item.class, key);
        System.out.println("item name :: " + item.getItemName());
        System.out.println("item width :: " + item.getDemintionsW());
        System.out.println("item height :: " + item.getDemintionsH());
        System.out.println("author name  :: " + item.getAuthor());
        System.out.println("manufacturer name :: " + item.getManufacturer());

        entityManager.remove(item);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }


    public static void getAllRecords() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA-Item");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();


        Query query = entityManager.createQuery("select i from Item i");
        List<Item> list = query.getResultList();

        for (Item e : list) {
            System.out.println(e.toString());
        }
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

    }
}
