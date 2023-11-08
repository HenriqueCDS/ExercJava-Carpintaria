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
public class Endereco {
    
    private String logradouro;
    private String bairro;
    private String cidade;
    private int numero;

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Endereco{" + "logradouro=" + logradouro + ", bairro=" + bairro + ", cidade=" + cidade + ", numero=" + numero + '}';
    }
    
    //metodo para preencher os dados do endereco
    
    public void preenche(){
        
        this.logradouro = JOptionPane.showInputDialog("Logradouro: ");
        
        this.bairro = JOptionPane.showInputDialog("Bairro: ");
        
        this.cidade = JOptionPane.showInputDialog("Cidade: ");
        
        this.numero = Integer.parseInt(JOptionPane.showInputDialog("Numero: "));
        
        
    }
    
    
}
