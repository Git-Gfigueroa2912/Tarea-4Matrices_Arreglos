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
                
                case 1->{
                    System.out.println("Battleship");
                    
                    System.out.println("MODO DEL JUEGO");
                    System.out.println("1. Un jugador");
                    System.out.println("2. Dos jugadores");
                    System.out.println("Ingrese el modo del juego");
                    int modo = entrada.nextInt();
                    System.out.println("Desea modo silencioso [1/2]");
                    int silencioso = entrada.nextInt();
                    
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
                        
                        if(fila < 0 || fila >= 6 || columna < 0 || columna >= 5){
                            System.out.println("La posicion esta fuera de rango");
                            continue;
                        }
                        intentos++;
                        
                        if(fila == barcoFila && columna == barcoColumna){
                            System.out.println(" El barco se hundio");
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
                            System.out.println();
                        }
                    }
                }
                if (modo == 2){
                    char[][] A = new char[6][5];
                    char[][] B = new char[6][5];
                    
                    for(int i = 0; i < 6; i++){
                        for(int j = 0; j < 5; j++){
                            A[i][j] = '*';
                            B[i][j] = '*';
                        }
                    }
                    
                    A[0][0] = '*';
                    A[1][0] = '*'; A[1][1] = '*'; A[1][2] = '*';
                    A[2][0] = '*';
                    A[3][0] = '*';
                    A[4][0] = '*';
                    A[5][0] = '*';
                    
                    B[1][1] = '*';
                    B[2][1] = '*';
                    B[3][0] = '*';
                    B[4][1] = '*';
                    B[5][0] = '*'; B[5][1] = '*'; B[5][2] = '*';
                    
                    int daño1 = 0;
                    int daño2 = 0;
                    int turno = 1;
                    boolean fin = false;
                    
                    while(!fin){
                        if(turno == 1){
                            System.out.println("Jugador 1 ataca");
                            mostrar(B);
                            
                            if(silencioso == 2){
                                mostrar(B);
                                
                            }
                            System.out.println("Ingrese la fila: ");
                            int fila = entrada.nextInt();
                            System.out.println("Ingrese la columna: ");
                            int columna = entrada.nextInt();
                            
                            if(fila < 0 || fila >= 6 || columna < 0 || columna >= 6){
                                System.out.println("La posicion esta fuera de rango");
                                continue;
                                
                            }
                            if(B[fila][columna] == '*'){
                                System.out.println("Daña al barco");
                                daño1++;
                            }else{
                                System.out.println("Bomba al agua");
                            }
                            B[fila][columna] = 'X';
                            
                            if(daño1 >= 3){
                                System.out.println("Jugador 1 gana");
                                fin = true;
                            }
                            turno = 2;
                        }
                        else{
                            System.out.println("Jugador 2 ataca");
                            
                            if(silencioso == 2){
                                mostrar(A);
                            }
                            
                            System.out.println("Ingrese la fila: ");
                            int fila = entrada.nextInt();
                            System.out.println("Ingrese la columna: ");
                            int columna = entrada.nextInt();
                            
                            if(fila < 0 || fila >= 6 || columna < 0 || columna >= 6){
                                System.out.println("La posicion esta fuera de rango");
                                continue;
                            }
                            
                            if(A[fila][columna] == '*'){
                                System.out.println("Daña al barco");
                                daño2++;
                            }else{
                                System.out.println("Bomba al agua");
                                
                            }
                            A[fila][columna] = 'X';
                            
                            if(daño2 >= 3){
                                System.out.println("Jugador 2 gana");
                                fin = true;
                            }
                            turno = 1;
                        }
                    }
                 }    
                        
            }
                
            case 2->{
                 System.out.println("Busca Minas");
                 
                 System.out.println("Desea el modo silencioso");
                 System.out.println("1. Si");
                 System.out.println("2. No");
                 int silencioso = entrada.nextInt();
                 
                 System.out.println("MODO DEL JUEGO");
                 System.out.println("1. Modo Dinamico");
                 System.out.println("2. Modo Estatico");
                 int modo = entrada.nextInt();
                 
                 int numero = 6;
                 char[][] minas = new char[numero][numero];
                 boolean[][] visto = new boolean[numero][numero];
                 
                 for(int i = 0; i < numero; i++){
                     for(int j = 0; j < numero; j++){
                         minas[i][j] = '0';
                         visto[i][j] = false;
                     }
                 }
                 
                 if(modo == 1){
                     int bombas_colocadas = 0;
                     while(bombas_colocadas < 5){
                         int fila = (int)(Math.random()*numero);
                         int columna = (int)(Math.random()*numero);
                         if(minas[fila][columna] != '*'){
                             minas[fila][columna] = '*';
                             bombas_colocadas++;
                         } 
                     }
                 }
                 
                 if(modo == 2){
                     minas[0][0] = '*';
                     minas[1][0] = '*';
                     minas[3][0] = '*';
                     minas[5][0] = '*';
                     minas[5][1] = '*';
                 }
                 
                 boolean boom = false;
                 
                 while(!boom){
                     System.out.println("Ingrese la fila: ");
                     int fila = entrada.nextInt();
                     System.out.println("Ingrese la columna: ");
                     int columna = entrada.nextInt();
                     
                     if(fila < 0 || fila >= numero || columna < 0 || columna >= numero){
                         System.out.println("La posicion esta fuera de rango");
                         continue;
                     }
                     
                     visto[fila][columna] = true;
                     
                     if(minas[fila][columna] == '*'){
                         System.out.println("BOOM !!!");
                         boom = true;
                     }else{
                         System.out.println("Sin bomba");
                     }
                     
                     if(silencioso == 2){
                         for(int i = 0; i < numero; i++){
                             for(int j = 0; j < numero; j++){
                                if(visto[i][j]){
                                    System.out.print(minas[i][j] + " "); 
                                }else{
                                    System.out.print("#");
                                } 
                             }
                             System.out.println();
                         }
                     }
                 }
            }
    
        }
     }while (opcion != 0);
    }    
    public static void mostrar(char[][] tablero){
        
    }
    
}

