package com.mycompany.ejercicio_pag412;

import java.util.InputMismatchException;
import javax.swing.JOptionPane;

public class CálculosNuméricos {
    public static double calcularRaízCuadrada(double valor) throws ArithmeticException {
        if (valor < 0) {
            throw new ArithmeticException("El valor debe ser un número positivo para calcular la raíz cuadrada");
        }
        return Math.sqrt(valor);
        }
    
    public static double calcularLogaritmoNeperiano(double valor) throws ArithmeticException {
       if (valor <= 0) {
           throw new ArithmeticException("El valor debe ser un número positivo para calcular el logaritmo");
       }
       return Math.log(valor);
}
    }


    


    
