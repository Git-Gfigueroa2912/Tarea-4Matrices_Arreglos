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
    public static SecureRandom random = new SecureRandom();
    
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
                    
                    System.out.println("MODO DEL JUEGO");
                    System.out.println("1. Un jugador");
                    System.out.println("2. Dos jugadores");
                    System.out.println("Ingrese el modo del juego");
                    int modo = entrada.nextInt();
                       
                    if (modo == 1){
                        char[][] tablero = new char[6][5];
                        for(int i = 0; i < 6; i++){
                           for(int j = 0; j < 5; j++){
                               tablero[i][j] = '*';
                            }
                        }
                        int barcoFila = random.nextInt(6);
                    int barcoColumna = random.nextInt(5);
                    
                    boolean hundido = false;
                    int intentos = 0;
                    
                    while(!hundido){
                        System.out.println("Ingrese una fila: ");
                        int fila = entrada.nextInt();
                        System.out.println("Ingrese una columna: ");
                        int columna = entrada.nextInt();
                        
                        if(fila < 0 || fila >= fila || columna < 0 || columna >= columna){
                            System.out.println("La posicion esta fuera de rango");
                            continue;
                        }
                        intentos++;
                        
                        if(fila == barcoFila && columna == barcoColumna){
                            System.out.println(" El barco se hundio en " + intentos + " intentos! ");
                            tablero[fila][columna] = 'X';
                            hundido = true;
                        }else{
                            System.out.println("Bomba al agua");
                            tablero[fila][columna] = '0';
                        }
                        for(int i = 0; i < 6; i++){
                            for(int j = 0; j < 5; j++){
                                System.out.print(tablero[i][j] + " ");
                            }
                        }
                    }
                }
                    
                        
            }
        }while (opcion != 0);
    }
}

