/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tarea1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author jose
 */
public class Tarea1 {
    String nombre;
    public static void main(String[] args) throws IOException{
        Double  x, y,z;
        float a, b, c;
        
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
            
        System.out.println("Escribe el valor de x: ");
        entrada = bufer.readLine();
        x= Double.parseInt(entrada);
        System.out.println("Escribe el valor de y: ");
        entrada = bufer.readLine();
        y = Double.parseDouble(entrada);
        z = y / x;
        System.out.println("El residuo de dividir y ( + y + ") entre x ( " +x + ) es: " + z);
            
        System.out.println("Escribe el valor de a: ");
        entrada = b.readLine();
        a = entrada;
        System.out.println("Escribe el valor de b: ");
        in = bufer.readLine();
        b = Float.parseFloat(entrada);
        c = a * b ;
        System.out.println("El resultado de multiplicar a por b es: " + c);
            
            
            
    }
    System.out.println("Escribe una letra: ");
    entrada = bufer.readLine();
    nombre = Entrada.ChartAt(12);
    System.out.println("El  nombre que escribiste es: " + Nombre);
}

