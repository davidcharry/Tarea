/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;

/**
 *
 * @author mono-
 */
public class equiposCaracteristicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EquiposCaracteristicas Comp1 = new EquiposCaracteristicas();
        EquiposCaracteristicas Comp2= new EquiposCaracteristicas();
        EquiposCaracteristicas Comp3= new EquiposCaracteristicas();
        EquiposCaracteristicas Comp4= new EquiposCaracteristicas();
        
       Comp1.Marca="HP";
       Comp1.Modelo="430";
       Comp1.Generacion=5;
       Comp1.Capacidad=4;
       
       
       Comp2.Marca="LENOVO";
       Comp2.Modelo="80SX";
       Comp2.Generacion=7;
       Comp2.Capacidad=8;
       
       
       Comp3.Marca="ASUS";
       Comp3.Modelo="A7N8X-VM";
       Comp3.Generacion=9;
       Comp3.Capacidad=12;
       
       
       Comp4.Marca="ACER";
       Comp4.Modelo="15 CB315.";
       Comp4.Generacion=3;
       Comp4.Capacidad=6;
       
       System.out.println("El Equipo de marca " + Comp1.Marca + " modelo " + Comp1.Modelo + " es de " + Comp1.Generacion + " generacion y tiene " + Comp1.Capacidad + " GB de RAM");
       System.out.println("El Equipo de marca " + Comp2.Marca + " modelo " + Comp2.Modelo + " es de " + Comp2.Generacion + " generacion y tiene " + Comp2.Capacidad + " GB de RAM");
       System.out.println("El Equipo de marca " + Comp3.Marca + " modelo " + Comp3.Modelo + " es de " + Comp3.Generacion + " generacion y tiene " + Comp3.Capacidad + " GB de RAM");
       System.out.println("El Equipo de marca " + Comp4.Marca + " modelo " + Comp4.Modelo + " es de " + Comp4.Generacion + " generacion y tiene " + Comp4.Capacidad + " GB de RAM");

    }

    private static class EquiposCaracteristicas {

        private String Marca;
        private String Modelo;
        private int Generacion;
        private int Capacidad;

        public EquiposCaracteristicas() {
        }
    }
    
}
