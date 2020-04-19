package com.CMPP.x00202118;

public class Documento extends Empleado {
    private String nombre;
    private String numero;

    public Documento(String nombre, String puesto, double salario,String docu, String nombre1, String numero) {
        super(nombre, puesto,docu, salario);
        this.nombre = nombre1;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumero() {
        return numero;
    }
}
