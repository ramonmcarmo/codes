/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao9;

import javax.swing.JOptionPane;

/**
 *
 * @author ramonmachado
 */
public class Questao9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Arvore ab = new Arvore();
        Integer qntd = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de nós?"));
        Integer cont = 0;
        while(qntd > cont){
            cont++;
            ab.inserir(Integer.parseInt(JOptionPane.showInputDialog("Digite número do Nó")));
        }
        
        System.out.println(ab.soma());
        
        
    }
    
}
