package com.MEMCx00220618;

import java.util.ArrayList;

public class MiHelper {


    public void validarTipo(ArrayList empleado, String name) throws CustomException {
        for(int i= 0; i<= empleado.size()-1; i++) {
            if (empleado.get(i).equals(name)) {
               return;
            }else {
                throw new CustomException(" Empleado no encontrado en la lista. ");
            }
        }
        }
    }

