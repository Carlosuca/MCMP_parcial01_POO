package com.CMPP.x00202118;

public class Empleado {
    private String nombre;
    private String puesto;
    private String docu;
    private double salario;

    public Empleado(String nombre, String puesto, String docu, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        this.docu = docu;

    }

    public Empleado(String nombre, String puesto, double salario, String docu) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        this.docu = docu;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public String getDocu() {
        return docu;
    }

    public void addDocumento(String Documento){
        return;

    }
    public  void removeDocuemento(String Documento){
        return;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", puesto='" + puesto + '\'' +
                ", documento=" + docu +
                ", salario=" + salario +
                '}';
    }
}
