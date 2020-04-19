package com.CMPP.x00202118;

import java.util.*;

public class Main {
        Empresa empresa = new Empresa("Delsur", "Electricista", "2172123-0",350.5);

    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        boolean exit = true;
        while (exit){
            System.out.println("1. Agregar empleado");
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
                    String nombre, puesto,docu;
                    double salario;

                    System.out.print("Nombre: "); nombre = in.nextLine();
                    System.out.print("Puesto: "); puesto = in.nextLine();
                    System.out.print("Salario: "); salario = Double.parseDouble(in.nextLine());
                    System.out.print("Documento de identidad: "); docu = in.nextLine();

                    empleados.add(new Empleado(nombre, puesto, salario,docu));
                    break;

                case 2:
                    String eliminarA;

                    System.out.print("Nombre del Empleado que va a despedir :(: "); eliminarA = in.nextLine();
                    empleados.removeIf(s-> s.getNombre().equalsIgnoreCase(eliminarA));
                    break;
                case 3:
                    if(empleados.isEmpty())
                        System.out.println("No hay datos que mostrar!");
                    else
                        empleados.forEach(obj -> System.out.println(obj.toString()));

                    break;
                case 0:
                    exit=false;
                    break;
            }
        }
    }
}