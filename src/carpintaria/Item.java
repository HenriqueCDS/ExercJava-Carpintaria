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
public class Item {
    
    private String descricao;
    private int qtd;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    @Override
    public String toString() {
        return "Item{" + "descricao=" + descricao + ", qtd=" + qtd + '}';
    }
        public void preenche(){
        
        this.descricao = JOptionPane.showInputDialog("Descrição do Item: ");
        this.qtd = Integer.parseInt(JOptionPane.showInputDialog("Quantidade do Item:"));
    
        
    }
    
    
    
    
}
