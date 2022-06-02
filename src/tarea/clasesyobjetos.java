/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;

import java.util.Scanner;

public class clasesyobjetos {

    private String Marca;
    private String Modelo;
    private int Capacidad;
    private int Generacion;
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        clasesyobjetos equipo = new clasesyobjetos();

    }

    public clasesyobjetos() {
        System.out.println("Por favor ingrese los datos de equipo en este orden Marca Modelo Capacidad y Generacion del equipo");
        Marca = entrada.nextLine();
        Modelo = entrada.nextLine();
        Capacidad = entrada.nextInt();
        Generacion = entrada.nextInt();
        System.out.println("La marca del equipo es " + Marca + " el modelo es " + Modelo + " la capacidad es " + Capacidad + " y la generación es " + Generacion);
    }
}
