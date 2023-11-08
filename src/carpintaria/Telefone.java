/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carpintaria;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Telefone {
    
    private int ddd;
    private int numero;
    
    //construtor
 /*   
    public Telefone(){
        
        ddd = 19;
             
    }
 */   
    //

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "(" + "ddd=" + ddd + ")" + numero; 
    }
    
    public void preenche(){
        
    //preencher ddd
    
    this.ddd = Integer.parseInt(JOptionPane.showInputDialog("DDD do telefone: "));
        
    String aux = JOptionPane.showInputDialog("Qual o numero do telefone: ");
    this.numero = Integer.parseInt(aux);
    }
    
    
    
}
