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
public class Fornecedor {
    
    private String nome;
    private String email;
    private Telefone telefone;
    private Endereco endereco;
    
    //construtor

    public Fornecedor() {
        telefone = new Telefone();
        endereco = new Endereco();
    }
    
    //

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public String toString(){
        
        return (nome + "\n" + email + "\n" + telefone + "\n" + endereco + "\n");
        
        
    }
    
    public void preenche(){
        
        this.nome = JOptionPane.showInputDialog("Nome: ");
        
        this.email = JOptionPane.showInputDialog("Email: ");
        
        this.endereco.preenche();
        
        this.telefone.preenche();
        
    }
    
}
