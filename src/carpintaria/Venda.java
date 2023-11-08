/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carpintaria;

/**
 *
 * @author Aluno
 */
public class Venda {
    
    private Cliente cliente;
    private Item item;
    private int qtd_utilizado;
    private float valor_venda;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getQtd_utilizado() {
        return qtd_utilizado;
    }

    public void setQtd_utilizado(int qtd_utilizado) {
        this.qtd_utilizado = qtd_utilizado;
    }

    public float getValor_venda() {
        return valor_venda;
    }

    public void setValor_venda(float valor_venda) {
        this.valor_venda = valor_venda;
    }
    
    
    
}
