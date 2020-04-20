package com.CMPP.x00202118;

import java.util.ArrayList;

public class CalculadoraImpuestos extends Empleado {
    private double totalRenta;
    private double totalISSS;
    private double totalAFP;

    public CalculadoraImpuestos(String nombre, String puesto,String docu, double salario) {
        super(nombre, puesto,docu, salario);

    }

    public CalculadoraImpuestos() {
        super();
    }

    public double calcularPago(Empleado Emp){
        double total = 0;
        totalRenta = Emp.getSalario() * 0.10;
        totalISSS = Emp.getSalario() * 0.075;
        totalAFP = Emp.getSalario() * 0.072;
        total = Emp.getSalario() - totalISSS - totalRenta - totalAFP;
        return total;
    }
    public String mostrarTotales(ArrayList empleado, Empleado Emp){
        totalRenta = Emp.getSalario() * 0.10;
        totalISSS = Emp.getSalario() * 0.075;
        totalAFP = Emp.getSalario() * 0.072;
        String totales = "Renta = $" + totalRenta + " ISSS =  $" + totalISSS + " AFP = $" + totalAFP;
        return totales;

    }
}