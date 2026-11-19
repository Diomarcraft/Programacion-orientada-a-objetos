package encapsulamiento.RetoIntegrador_IPS;

public class Paciente {
    // ===== Atributos privados =====
    private String documento;
    private String nombre;
    private int edad;
    private String tipoSangre;
    private String diagnostico; // Confidencial: NO tiene getter publico (Ley 1581 de 2012)
    private String[] alergias;
    private int cantidadAlergias;

    // Constantes privadas: nadie fuera de la clase las ve ni las cambia
    private static final String CLAVE_MEDICO = "MED-2026";
    private static final int EDAD_MIN = 0;
    private static final int EDAD_MAX = 120;
    private static final int MAX_ALERGIAS = 10;
    private static final String[] TIPOS_SANGRE_VALIDOS =
            {"A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-"};

    public Paciente(String documento, String nombre, int edad, String tipoSangre) {
        this.documento = "Sin documento";
        this.nombre = "Sin nombre";
        this.tipoSangre = "Sin registrar";
        this.diagnostico = "Sin diagnostico";
        this.alergias = new String[MAX_ALERGIAS];
        this.cantidadAlergias = 0;
        // Usamos los setters para que tambien se valide al crear el objeto
        setDocumento(documento);
        setNombre(nombre);
        setEdad(edad);
        setTipoSangre(tipoSangre);
    }

    // ===== Getters (solo informacion publica) =====
    public String getDocumento() { return documento; }
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public String getTipoSangre() { return tipoSangre; }

    // Devuelve una COPIA de las alergias, asi nadie puede modificar el arreglo interno
    public String[] getAlergias() {
        String[] copia = new String[cantidadAlergias];
        for (int i = 0; i < cantidadAlergias; i++) {
            copia[i] = alergias[i];
        }
        return copia;
    }

    // ===== Setters con validacion =====
    public void setDocumento(String documento) {
        if (documento != null && !documento.trim().isEmpty()) {
            this.documento = documento.trim();
        } else {
            System.out.println("Documento invalido: no puede estar vacio.");
        }
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre.trim();
        } else {
            System.out.println("Nombre invalido: no puede estar vacio.");
        }
    }

    public void setEdad(int edad) {
        if (edad >= EDAD_MIN && edad <= EDAD_MAX) {
            this.edad = edad;
        } else {
            System.out.println("Edad invalida. Debe estar entre " + EDAD_MIN + " y " + EDAD_MAX + ".");
        }
    }

    public void setTipoSangre(String tipoSangre) {
        if (esTipoSangreValido(tipoSangre)) {
            this.tipoSangre = tipoSangre.trim().toUpperCase();
        } else {
            System.out.println("Tipo de sangre invalido. Valores permitidos: A+, A-, B+, B-, O+, O-, AB+, AB-.");
        }
    }

    // ===== Acceso controlado al diagnostico =====
    public String consultarDiagnostico(String claveMedico) {
        if (esClaveCorrecta(claveMedico)) {
            return diagnostico;
        }
        // Mensaje generico: nunca se muestra la clave correcta ni la ingresada
        System.out.println("Acceso denegado: clave de medico incorrecta.");
        return null;
    }

    public void actualizarDiagnostico(String claveMedico, String nuevoDiagnostico) {
        if (!esClaveCorrecta(claveMedico)) {
            System.out.println("Acceso denegado: no se puede actualizar el diagnostico.");
        } else if (nuevoDiagnostico == null || nuevoDiagnostico.trim().isEmpty()) {
            System.out.println("El diagnostico no puede estar vacio.");
        } else {
            this.diagnostico = nuevoDiagnostico.trim();
            System.out.println("Diagnostico actualizado correctamente.");
        }
    }

    // ===== Alergias =====
    public void agregarAlergia(String alergia) {
        if (alergia == null || alergia.trim().isEmpty()) {
            System.out.println("Alergia invalida: no puede estar vacia.");
            return;
        }
        String limpia = alergia.trim();
        for (int i = 0; i < cantidadAlergias; i++) {
            if (alergias[i].equalsIgnoreCase(limpia)) {
                System.out.println("La alergia '" + limpia + "' ya esta registrada.");
                return;
            }
        }
        if (cantidadAlergias >= MAX_ALERGIAS) {
            System.out.println("No se pueden registrar mas de " + MAX_ALERGIAS + " alergias.");
            return;
        }
        alergias[cantidadAlergias] = limpia;
        cantidadAlergias++;
        System.out.println("Alergia registrada: " + limpia);
    }

    public boolean tieneAlergias() {
        return cantidadAlergias > 0;
    }

    // Muestra SOLO la informacion publica (sin diagnostico)
    public void mostrarInformacionPublica() {
        System.out.println("===== INFORMACION DEL PACIENTE =====");
        System.out.println("Documento:      " + documento);
        System.out.println("Nombre:         " + nombre);
        System.out.println("Edad:           " + edad + " anios");
        System.out.println("Tipo de sangre: " + tipoSangre);
        if (tieneAlergias()) {
            System.out.println("Alergias:       " + String.join(", ", getAlergias()));
        } else {
            System.out.println("Alergias:       Ninguna registrada");
        }
        System.out.println("Diagnostico:    [CONFIDENCIAL]");
        System.out.println("====================================");
    }

    // ===== Metodos privados de apoyo =====
    private boolean esClaveCorrecta(String clave) {
        return CLAVE_MEDICO.equals(clave);
    }

    private boolean esTipoSangreValido(String tipo) {
        if (tipo == null) return false;
        String t = tipo.trim().toUpperCase();
        for (String valido : TIPOS_SANGRE_VALIDOS) {
            if (valido.equals(t)) return true;
        }
        return false;
    }
}
