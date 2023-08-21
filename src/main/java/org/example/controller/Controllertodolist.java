package org.example.controller;

import org.example.entity.Todolist;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;
import java.util.spi.ToolProvider;

public class Controllertodolist {


    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa_demo_postgres");


    public static void addTodo() {
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Todolist person = new Todolist("manger", true);

        em.persist(person);

        em.getTransaction().commit();
        em.close();
        emf.close();

    }

//    public static void main2(){
//        EntityManager em = emf.createEntityManager();
//
//        Todolist todolist = em.find(Todolist.class, 1L);
//        System.out.println(todolist.toString());
//        em.close();
//        emf.close();
//
//    }




    public static void afficherTodo(){
        EntityManager em = emf.createEntityManager();



        List<Todolist> todolistList = null;

        todolistList = em.createQuery("select * from todolist t", Todolist.class).getResultList();

        for (Todolist t:todolistList){
            System.out.println(t);
        }



    }

    public static void remove(){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Todolist todolist = em.find(Todolist.class, 1L);
        em.remove(todolist);

        em.getTransaction().commit();
        em.close();
        emf.close();
    }


}
