/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol10_1;
import javax.swing.JOptionPane;
/**
 *
 * @author clagosuarez
 */
public class Numero {
    private int numeroCorrecto;
    private int intentos;
    private int numero;

    public Numero() {
    }

    public Numero(int numeroCorrecto, int intentos, int numero) {
        this.numeroCorrecto = numeroCorrecto;
        this.intentos = intentos;
        this.numero = numero;
    }

    public void game(){
        boolean win = false;
        while(numeroCorrecto > 50 || numeroCorrecto < 1){
            numeroCorrecto = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número entre 1 y 50"));
        }
        intentos = Integer.parseInt(JOptionPane.showInputDialog("Escribe la cantidad de intentos"));
        
        for (int i = 0; i < intentos; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Escribe un numero"));
            if (numeroCorrecto > numero) {
                JOptionPane.showMessageDialog(null, "Tu número es menor que el correcto");
            }
            else if (numeroCorrecto < numero){
                JOptionPane.showMessageDialog(null, "Tu número es mayor que el correcto");
            }
            else{
                win = true;
            }
        }
        
        if (win == true) {
            JOptionPane.showMessageDialog(null, "ACERTASTE!");
        }
        else{
            JOptionPane.showMessageDialog(null, "Te quedaste sin intentos, has perdido");
        }
    }
    
    
}
