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
public class Cliente {
    
    private String nome;
    private Endereco endereco;
    private Telefone telefone;
    private String email;
    
    public Cliente(){
        
        endereco = new Endereco();
        telefone = new Telefone();
                
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
   public void preenche(){
        
        this.nome = JOptionPane.showInputDialog("Nome: ");
        
        this.email = JOptionPane.showInputDialog("Email: ");
        
        this.endereco.preenche();
        
        this.telefone.preenche();
        
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + ", email=" + email + '}';
    }
    
    
    
}
