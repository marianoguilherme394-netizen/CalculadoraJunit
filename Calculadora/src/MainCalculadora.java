
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class MainCalculadora {

public static void main (String [] args){
    int x,y;
    String sX, sY;
 
    sX = JOptionPane.showInputDialog( null, "Digite o primeiro numero: ",
            "Primeiro numero", JOptionPane.QUESTION_MESSAGE);
    
    x = Integer.parseInt(sX);
    
    sY = JOptionPane.showInputDialog( null, "Digite o segundo numero: ",
            "Segundo numero", JOptionPane.QUESTION_MESSAGE);
    
    y = Integer.parseInt(sY);
    
    Calculadora calc = new Calculadora();
    
    JOptionPane.showMessageDialog(null, "somar: " + calc.somar(x,y));
    JOptionPane.showMessageDialog(null, "subtrair: " + calc.subtrair(x,y));
    JOptionPane.showMessageDialog(null, "multiplicar: " + calc.multiplicar(x,y));
    JOptionPane.showMessageDialog(null, "dividir: " + calc.dividir(x,y));
    
    System.exit(0);
    
}    
}
