/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol10_2;
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
        numeroCorrecto = (int) (Math.random() * (51 - 0));
        intentos = Integer.parseInt(JOptionPane.showInputDialog("Escribe la cantidad de intentos"));
        System.out.println(numeroCorrecto);
        for (int i = 0; i < intentos; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Escribe un numero"));
            int diferencia = Math.abs(numeroCorrecto - numero);
            
            if (numeroCorrecto == numero){
                win = true;
                break;
            }
            
            if (diferencia > 20) {
                JOptionPane.showMessageDialog(null, "Muy lejos");
            }
            else if (diferencia <= 20 && diferencia >= 10){
                JOptionPane.showMessageDialog(null, "Lejos");
            }
            else if (diferencia < 10 && diferencia > 5){
                JOptionPane.showMessageDialog(null, "Cerca");
            }
            else if (diferencia < 5){
                JOptionPane.showMessageDialog(null, "Muy cerca");
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
