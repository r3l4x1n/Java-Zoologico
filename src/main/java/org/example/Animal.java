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


// PRUEBAS CON EL METODO tenerHijo():
/*
package org.example;

public class Animal {

    String nombre;
    String genero;
    Double peso;
    Animal pareja;

    public Animal() {
    }

    public Animal(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Animal getPareja() {
        return pareja;
    }

    public void encontrarPareja(Animal pareja) {
        this.pareja = pareja;
        pareja.pareja = this; // Establecer la pareja en ambos animales
    }

    public void imprimirFamilia() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Genero: " + genero);
        System.out.println("Peso: " + peso);
        if (pareja != null) {
            System.out.println("Pareja: " + pareja.nombre);
        } else {
            System.out.println("Sin pareja");
        }
        System.out.println("-------------------");
    }

    public void tenerHijo(String nombreHijo, double pesoHijo) {
        Animal hijo = new Animal(nombreHijo, pesoHijo);
        System.out.println("Felicitaciones, ha nacido un nuevo animal en la familia!");
        System.out.println("Nombre: " + nombreHijo);
        System.out.println("Peso: " + pesoHijo);
        System.out.println("-------------------");
    }

    public static void main(String[] args) {
        Animal animal1 = new Animal("Animal1", 10.0);
        Animal animal2 = new Animal("Animal2", 12.0);

        animal1.setGenero("Macho");
        animal2.setGenero("Hembra");

        animal1.encontrarPareja(animal2);

        animal1.imprimirFamilia();
        animal2.imprimirFamilia();

        animal1.tenerHijo("Animal3", 5.0);
    }
}
 */

