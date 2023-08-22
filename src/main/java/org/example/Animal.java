package org.example;

public class Animal {

    String nombre;
    String genero;
    Double peso;
   Animal pareja  ;

    public Animal() {
    }

    public Animal(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    void encontrarPareja(Animal pareja){
        this.pareja=pareja;
    }






}
