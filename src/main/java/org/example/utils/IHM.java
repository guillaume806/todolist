package org.example.utils;

import java.util.Scanner;

import static org.example.controller.Controllertodolist.*;

public class IHM {

    private Scanner scanner;

    private String choix;



    public IHM(){
        scanner = new Scanner(System.in);

    }

    public void start(){
        System.out.println("Exercice : Programme todolist");
        do {
            menu();
            choix = scanner.nextLine();
            switch (choix){
                case "1":
                    addTodo();
                    break;
                case "2":
                    afficherTodo();
                    break;
                case "3":
                    updateTodo();
                    break;
                case "4":
                    remove();
                    break;
                case "0":
                    System.out.println("Aurevoir");
                    break;
                default:
                    System.out.println("choix invalide");

            }
        }while (!choix.equals("0"));

    }

    private void menu(){
        System.out.println("=== Menu TODOLIST ===");
        System.out.println("1 - Ajouter une todo a ma liste");
        System.out.println("2 - afficher toutes les todo");
        System.out.println("3 - marquer une todo comme faite");
        System.out.println("4 - supprimer une todo");
        System.out.println("0 - Quitter");
    }










}
