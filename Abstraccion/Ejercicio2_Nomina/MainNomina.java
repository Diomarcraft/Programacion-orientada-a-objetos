public class MainNomina {
    public static void main(String[] args) {
        Empleado[] empleados = {
            new EmpleadoFijo("Ana Rios", "1111", 2200000),
            new EmpleadoPorHoras("Luis Mora", "2222", 80, 15000),
            new EmpleadoFreelance("Maria Leon", "3333", 3, 500000)
        };

        for (Empleado empleado : empleados) {
            empleado.mostrarRecibo();
            System.out.println("---");
        }
    }
}
