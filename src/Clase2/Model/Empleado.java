package Clase2.Model;

public class Empleado {
    private String nombre;
    private String apellido;
    private String numCuenta;
    private double importe;

    public Empleado(String nombre , String apellido , String numCuenta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numCuenta = numCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
}
