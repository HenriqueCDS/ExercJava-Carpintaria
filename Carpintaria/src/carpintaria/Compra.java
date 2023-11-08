/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carpintaria;

import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class Compra {
    
    private int codigo;
    private Fornecedor fornecedor;
    private Produto produto;
    private int qtd;
    private ArrayList<Item> itens;
    private float preco_unitario;
    private float preco_total;
    private float total;
    
    
    public Compra(){
        fornecedor= new Fornecedor();
        produto = new Produto();
        itens = new ArrayList<Item>();
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Produto getItem() {
        return produto;
    }

    public void setItem(Produto produto) {
        this.produto = produto;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public float getPreco_unitario() {
        return preco_unitario;
    }

    public void setPreco_unitario(float preco_unitario) {
        this.preco_unitario = preco_unitario;
    }

    public float getPreco_total() {
        return preco_total;
    }

    public void setPreco_total(float preco_total) {
        this.preco_total = preco_total;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
    
 public String toString(){
     String aux
             
             = "";
     aux= aux + codigo + " - " + fornecedor + "\n";
     for(Item i : itens){
          aux = aux + i + "\n";
     }
     aux = aux + this.total;
     return aux;
     
 }
            
    
}
