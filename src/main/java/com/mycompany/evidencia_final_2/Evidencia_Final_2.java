/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.evidencia_final_2;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author jakes
 */
public class Evidencia_Final_2 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Methods myMethods = new Methods();
        
        System.out.println("--BIENVENIDO AL PROGRAMA DE CITAS Y DIRECTORIO MEDICO--");
        System.out.println("1. Crear un paciente");
        System.out.println("2. Crear un medico");
        System.out.println("3. Crear una cita");
        System.out.println("4. Salir");
        System.out.println("Por favor digite el numero de la funcion deseada:");
        int funcion = scanner.nextInt();
        
        
        do{
        switch(funcion){
            case 1 -> myMethods.Paciente();
            case 2 -> myMethods.Doctor();
            case 3 -> myMethods.Citas();
            case 4 -> System.out.println("Tenga un buen dia.");
        }     
        }while (funcion !=4);
        
    }
}
