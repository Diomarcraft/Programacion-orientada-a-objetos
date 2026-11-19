public class MainHogar {
    public static void main(String[] args) {
        Televisor televisor = new Televisor("LG");
        Nevera nevera = new Nevera("Samsung");
        Lavadora lavadora = new Lavadora("Whirlpool");

        televisor.encender();
        televisor.funcionPrincipal();

        System.out.println("---");
        nevera.funcionPrincipal();
        nevera.encender();
        nevera.funcionPrincipal();

        System.out.println("---");
        lavadora.encender();
        lavadora.funcionPrincipal();
        lavadora.centrifugar();
        lavadora.apagar();
    }
}
