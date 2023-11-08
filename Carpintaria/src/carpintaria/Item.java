/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carpintaria;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Item {
    
    private int quantidade;
    private float preco;
    private float precototal;
    private Produto produto;
    
    public Item(){
        produto= new Produto();
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getPrecototal() {
        return precototal;
    }

    public void setPrecototal(float precototal) {
        this.precototal = precototal;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    
    
    public void preenche(ArrayList<Produto> produtos){
        this.quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de itens:"));
        this.preco = Float.parseFloat(JOptionPane.showInputDialog("Preço do Produto:"));
        this.precototal = this.quantidade * this.preco;

        String aux = "";
        for(Produto p : produtos){
            aux = aux + p + "\n";
        }
        int codBusca = Integer.parseInt(JOptionPane.showInputDialog("Codigo do Produto:"));
        
        Produto p = new Produto();
        p.setCodigo(codBusca);
        
        int indiceDoProduto = produtos.indexOf(p);
        if(indiceDoProduto == 1){
            JOptionPane.showInputDialog(null,"codigo invalido");
        }else{
            this.produto = produtos.get(indiceDoProduto);
            this.produto.setQuantidade(this.produto.getQtd()+this.quantidade);
        }
    
    
    
}
    

}