package encapsulamiento.Ejercicio2_Aprendiz;

public class Aprendiz {
    private String documento;
    private String nombre;
    private int edad;
    private double notaFinal;
    private String correoInstitucional; // RETO

    public Aprendiz(String documento, String nombre) {
        this.documento = documento;
        this.nombre = nombre;
        this.edad = 0;
        this.notaFinal = 0.0;
        this.correoInstitucional = "";
    }

    public String getDocumento() { return documento; }
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public double getNotaFinal() { return notaFinal; }
    public String getCorreoInstitucional() { return correoInstitucional; }

    public void setEdad(int edad) {
        if (edad >= 0 && edad <= 100) {
            this.edad = edad;
        } else {
            System.out.println("Edad invalida. Debe estar entre 0 y 100.");
        }
    }

    public void setNotaFinal(double nota) {
        if (nota >= 0.0 && nota <= 5.0) {
            this.notaFinal = nota;
        } else {
            System.out.println("Nota invalida. Debe estar entre 0.0 y 5.0.");
        }
    }

    // RETO: el setter solo acepta correos que contengan @
    public void setCorreoInstitucional(String correo) {
        if (correo != null && correo.contains("@")) {
            this.correoInstitucional = correo;
            System.out.println("Correo asignado: " + correo);
        } else {
            System.out.println("Correo invalido: debe contener el simbolo @.");
        }
    }

    public boolean aprobo() {
        return notaFinal >= 3.5;
    }
}
