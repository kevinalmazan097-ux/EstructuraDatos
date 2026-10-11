package mx.edu.uttt.tda;

public class Empleado {
    private String nombre;
    private String numeroNomina;
    private String sexo;
    private double sueldo;
    private boolean activo;
    private static int contarObjetos;

    public Empleado(){
        contarObjetos++;
    }

    public Empleado(String nombre, String numeroNomina, String sexo, double sueldo, boolean activo) {
        this.nombre = nombre;
        this.numeroNomina = numeroNomina;
        this.sexo = sexo;
        this.sueldo = sueldo;
        this.activo = activo;
        contarObjetos++;
    }

    public String getNumeroNomina() {
        return numeroNomina;
    }

    public void setNumeroNomina(String numeroNomina) {
        this.numeroNomina = numeroNomina;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getContarObjetos (){
        return Empleado.contarObjetos;
    }

    @Override
    public String toString() {
        return "Empleado [nombre=" + nombre + 
                ", numeroNomina=" + numeroNomina 
                + ", sexo=" + sexo 
                + ", sueldo=" + sueldo
                + ", activo=" + (activo?"Activo":"Inactivo") + "]";
    }

}
