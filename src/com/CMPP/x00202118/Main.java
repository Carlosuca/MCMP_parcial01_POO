package com.CMPP.x00202118;

import java.util.*;

public class Main {
    Empresa empresa = new Empresa("Delsur", "Electricista", "2172123-0", 350.5);

    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        boolean exit = true;
        while (exit) {
            System.out.println("\n1. Agregar empleado");
            System.out.println("2. Despedir el empleado");
            System.out.println("3. Ver lista de empleados");
            System.out.println("4. Calcular sueldo");
            System.out.println("5. Mostrar totales");
            System.out.println("0. Salir");
            System.out.print("Digite una opcion: ");
            int op = in.nextInt();
            in.nextLine();
            switch (op) {
                case 1:
                    String nombre, puesto, docu;
                    double salario;

                    System.out.print("Nombre: ");
                    nombre = in.nextLine();
                    System.out.print("Puesto: ");
                    puesto = in.nextLine();
                    System.out.print("Salario: ");
                    salario = Double.parseDouble(in.nextLine());
                    System.out.print("Documento de identidad: ");
                    docu = in.nextLine();

                    empleados.add(new Empleado(nombre, puesto, salario, docu));
                    break;

                case 2:
                    String eliminarA;

                    System.out.print("Nombre del Empleado que va a despedir :(: ");
                    eliminarA = in.nextLine();
                    empleados.removeIf(s -> s.getNombre().equalsIgnoreCase(eliminarA));
                    break;
                case 3:
                    if (empleados.isEmpty())
                        System.out.println("No hay datos que mostrar!");
                    else
                        empleados.forEach(obj -> System.out.println(obj.toString()));

                    break;
                case 4:
                    MiHelper h = new MiHelper();
                    String CalcularSalario = "";
                    CalculadoraImpuestos CI = new CalculadoraImpuestos();
                    double totalPagar = 0;
                    System.out.print("Digite el nombre de el empleado a calcular el salario: ");
                    CalcularSalario = in.nextLine();
                    for (int i = 0; i <= empleados.size() - 1; i++) {
                        if (empleados.get(i).getNombre().equalsIgnoreCase(CalcularSalario)) {
                            totalPagar = CI.calcularPago(empleados.get(i));
                        }
                    }
                    System.out.print("El salario total del empleado " + CalcularSalario + " con los descuentos del AFP, ISSS, renta es:  $" + totalPagar);
                    try{
                        h.validarTipo(empleados, CalcularSalario);

                    }catch(CustomException a){

                    }

                    break;
                case 5:
                    CalculadoraImpuestos DI = new CalculadoraImpuestos();
                    String Totales = "";
                    String CalcularTotales;
                    System.out.print("Digite el nombre de el empleado a calcular los totales: ");
                    CalcularTotales = in.nextLine();
                    for (int i = 0; i <= empleados.size() - 1; i++) {
                        if (empleados.get(i).getNombre().equalsIgnoreCase(CalcularTotales)) {
                            Totales = DI.mostrarTotales(empleados, empleados.get(i));

                        }
                        System.out.print("Los totales del empleado son: " + Totales);
                    }
                    break;
                case 0:
                    exit = false;
                    break;
            }
        }
    }
}