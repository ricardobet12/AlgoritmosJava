/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurassecuenciales;

import javax.swing.JOptionPane;

/**
 *
 * @author richy
 */
public class EstructurasSecuenciales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaracion de variables
        int nota1,nota2;
        double promedio;
        //Entrada de datos
        nota1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese nota1"));
        nota2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese segunda nota"));
        //Proceso
        promedio=(nota1+nota2)/2;
        //Salida
        System.out.println("El promedio es: " + promedio);
        JOptionPane.showMessageDialog(null, "El promedio es: "+ promedio);
    }
    
}
