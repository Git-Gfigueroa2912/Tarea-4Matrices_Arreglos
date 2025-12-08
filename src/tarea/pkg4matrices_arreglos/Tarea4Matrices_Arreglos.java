/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea.pkg4matrices_arreglos;

import java.util.Scanner;
import java.security.SecureRandom;

/**
 *
 * @author gafm2
 */
public class Tarea4Matrices_Arreglos {
    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = 0;
        do{
            System.out.println("ELIJA UNO DE LOS JUEGOS"); 
            System.out.println("1. Battleship");
            System.out.println("2. Busca Minas");
            System.out.println("Ingrese una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            
            switch (opcion){
                
                case 1:
                    System.out.println("Battleship");
                    
                    int filas = 5;
                    int columnas = 5;
                    char[][] tablero = new char[filas][columnas];
                    
                    for(int i = 0; i < filas; i++){
                        for(int j = 0; j < columnas; j++){
                            tablero[i][j] = '*';
                        }
                    }
            }
        }while (opcion != 0);
    }
}

