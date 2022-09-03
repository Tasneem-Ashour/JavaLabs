package org.example.Controller;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import org.example.Entity.Store;

import java.util.List;

public class StoreController {
    public static void insertRecord( Store store) {


        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA-Item");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

//        new Store("new store form jpa ");

        entityManager.persist(store);
        entityManager.getTransaction().commit();

        System.out.println(String.format("Store '%S' added to the record",store.getStoreName()));

        entityManager.close();
        entityManagerFactory.close();


    }

    public static void updateRecord() {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA-Item");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Integer key = Integer.valueOf(52);
        Store store = entityManager.find(Store.class, key);
        System.out.println("item name :: " + store.getStoreName());



        store.setStoreName("update store name ");



        entityManager.persist(store);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }

    public static void removeRecord() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA-Item");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Integer key = Integer.valueOf(52);
        Store store = entityManager.find(Store.class, key);
        System.out.println("item name :: " + store.getStoreName());


        entityManager.remove(store);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }


    public static void getAllRecords() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA-Item");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();


        Query query = entityManager.createQuery("select i from Store i");
        List<Store> list = query.getResultList();

        for (Store e : list) {
            System.out.println(e.toString());
        }
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

    }
}
