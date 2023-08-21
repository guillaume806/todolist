package org.example.controller;

import org.example.entity.Todolist;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Controllertodolist {


    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa_demo_postgres");


    public static void main() {
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Todolist person = new Todolist("manger", true);

        em.persist(person);

        em.getTransaction().commit();
        em.close();
        emf.close();

    }
}
