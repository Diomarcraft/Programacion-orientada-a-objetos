package herencia.Ejercicio1_Veterinaria;

public class Animal {
    // Atributos protected: las clases hijas pueden usarlos directamente
    protected String nombre;
    protected int edad;
    protected String especie; // Reto extra

    public Animal(String nombre, int edad, String especie) {
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
    }

    public void comer() {
        System.out.println(nombre + " esta comiendo.");
    }

    public void dormir() {
        System.out.println(nombre + " esta durmiendo.");
    }

    public void hacerSonido() {
        System.out.println(nombre + " emite un sonido.");
    }

    // Reto extra: metodo comun que muestra la especie
    public void presentarse() {
        System.out.println("Hola, soy " + nombre + ", un " + especie + " de " + edad + " anios.");
    }
}
