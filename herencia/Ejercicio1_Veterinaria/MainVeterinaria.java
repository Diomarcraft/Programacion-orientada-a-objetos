public class MainVeterinaria {
    public static void main(String[] args) {
        Perro firulais = new Perro("Firulais", 4);
        Gato michi = new Gato("Michi", 2);
        Pajaro piolin = new Pajaro("Piolin", 1);

        firulais.presentarse();   // Heredado del padre (reto extra)
        firulais.comer();         // Heredado del padre
        firulais.hacerSonido();   // Sobrescrito
        firulais.perseguirCola(); // Propio de Perro

        System.out.println("---");

        michi.presentarse();
        michi.dormir();           // Heredado del padre
        michi.hacerSonido();      // Sobrescrito
        michi.ronronear();        // Propio de Gato

        System.out.println("---");

        // ===== RETO: Pajaro =====
        piolin.presentarse();
        piolin.comer();
        piolin.hacerSonido();     // Sobrescrito
        piolin.volar();           // Propio de Pajaro
    }
}
