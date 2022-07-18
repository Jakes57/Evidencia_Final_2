/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.evidencia_final_2;

/**
 *
 * @author jakes
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author jakes
 */
public class Methods {
    
    
    public void Paciente() throws IOException { 
    Scanner scanner = new Scanner(System.in); 
    HashMap<String,String> conjuntoPacientes = new HashMap<>(); 
    File pacienteFile = new File("pacientes.txt");
    FileWriter fw = new FileWriter(pacienteFile);
        try (PrintWriter pw = new PrintWriter(fw)) {
            System.out.println("Nombre del paciente:");
            String paciente = scanner.nextLine();
            System.out.println("Asigne un ID de 2 digitos al paciente:");
            String pacienteID = scanner.nextLine();
            
            conjuntoPacientes.put(pacienteID,paciente);
            
            pw.println(pacienteID+paciente);
        }
     
}
    public void Doctor() throws IOException {
    Scanner scanner = new Scanner(System.in);   
    HashMap<String,String> conjuntoDoctores = new HashMap<>(); 
    File doctorFile = new File("doctores.txt");
    FileWriter fw = new FileWriter(doctorFile);
        try (PrintWriter pw = new PrintWriter(fw)) {
            System.out.println("Nombre del doctor:");
            String doctor = scanner.nextLine();
            System.out.println("Asigne un ID de 2 digitos al doctor:");
            String doctorID = scanner.nextLine();
            
            conjuntoDoctores.put(doctorID,doctor);
            
            pw.println(doctorID+doctor);
        }
     
}
    public void Citas() throws IOException {
    Scanner scanner = new Scanner(System.in);   
    HashMap<String,String> listaCitas = new HashMap<>(); 
    File citasFile = new File("citas.txt");
    FileWriter fw = new FileWriter(citasFile);
        try (PrintWriter pw = new PrintWriter(fw)) {
            System.out.println("Coloque el dia de la cita en el siguiente formato DD/MM/Hora:");
            String cita = scanner.nextLine();
            System.out.println("Asigne un ID de 2 digitos a la cita:");
            String citaID = scanner.nextLine();
            
            listaCitas.put(citaID,cita);
            
            pw.println(citaID+cita);
        }
}

 
  
}
