package com.CMPP.x00202118;

import java.util.List;

public class Empresa extends Empleado {

    private String nombre;
    private List<Empleado> planilla;


    public Empresa(String nombre, String puesto,String docu, double salario) {
        super(nombre, puesto,docu, salario);
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    public List<Empleado> getPlanilla() {
        return planilla;
    }
    //metodos
    public void addEmpleado(String Empleado){

        return;
    }
    public void quitEmpleado(String Empleado){
        return;

    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", planilla=" + planilla +
                '}';
    }
}
