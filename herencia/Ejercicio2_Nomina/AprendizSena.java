package herencia.Ejercicio2_Nomina;

// RETO: el aprendiz recibe el 50% del salario base como apoyo de sostenimiento
public class AprendizSena extends Empleado {

    public AprendizSena(String nombre, String documento, double salarioBase) {
        super(nombre, documento, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase * 0.5;
    }
}
