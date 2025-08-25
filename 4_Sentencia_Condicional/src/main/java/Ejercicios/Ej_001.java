/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author David Cano Escario
 */
public class Ej_001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escribe un programa que pida por teclado un día de la semana y que diga qué
            asignatura toca a primera hora ese día.*/
        Scanner s = new Scanner(System.in);

        boolean comprobador = false;

        while (!comprobador) {
            System.out.println("Escribe el día de la semana");
            String dia = s.next();
            String diaMinuscula = dia.toLowerCase();
            
            switch (diaMinuscula) {
                case "lunes":
                    System.out.println("Matemáticas");
                    comprobador = true;
                    break;
                case "martes":
                    System.out.println("Lenguaje");
                    comprobador = true;
                    break;
                case "miercoles":
                    System.out.println("Inglés");
                    comprobador = true;
                    break;
                case "jueves":
                    System.out.println("Educación Física");
                    comprobador = true;
                    break;
                case "viernes":
                    System.out.println("Música");
                    comprobador = true;
                    break;
                default:
                    System.out.println("Introduce un día de la semana correcto");
            }
        }
    }
}
