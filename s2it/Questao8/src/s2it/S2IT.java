/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s2it;

import javax.swing.JOptionPane;

/**
 *
 * @author ramonmachado
 */
public class S2IT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Integer a;
        Integer b;
        String digitado =  JOptionPane.showInputDialog(null, "Digite o número inteiro A");
        
        Metodo metodo = new Metodo();
        if(metodo.eNumero(digitado)){
            a = Integer.parseInt(digitado);
            digitado = JOptionPane.showInputDialog(null,"Digite o número inteiro B");
            if(metodo.eNumero(digitado)){
                b = Integer.parseInt(digitado);
                System.out.println(metodo.calculaNum(a, b));
            }
        }
    }
    
}
