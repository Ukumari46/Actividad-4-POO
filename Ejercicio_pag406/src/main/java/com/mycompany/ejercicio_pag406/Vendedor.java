
package com.mycompany.ejercicio_pag406;
import javax.swing.JOptionPane;

public class Vendedor {
    public static void verificarEdad (int edad) {
        if (edad < 0 || 120 <= edad) {      
            JOptionPane.showMessageDialog(null,"La edad no puede ser negativa ni mayor a 120");
            throw new IllegalArgumentException("La edad no puede ser negativa ni mayor a 120");
        } 
        else if (edad >= 0 && edad < 18) {
            JOptionPane.showMessageDialog(null,"El vendedor debe ser mayor de 18 años");
            throw new IllegalArgumentException("El vendedor debe ser mayor de 18 años");
        }
        else {
            JOptionPane.showMessageDialog(null,"El vendedor cumple con los requisitos de edad");
        }
    }
    

    
    
}
