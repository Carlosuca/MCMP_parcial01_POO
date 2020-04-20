package com.MEMCx00220618;

public class PlazaFija extends Empleado {
    private int extension;

    public PlazaFija(String nombre, String puesto,String docu, double salario, int extension) {
        super(nombre, puesto,docu, salario);
        this.extension = extension;
    }

    public int getExtension() {
        return extension;
    }

    public void setExtension(int extension) {
        this.extension = extension;
    }
}
