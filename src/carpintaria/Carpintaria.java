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
public class Carpintaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Fornecedor> listafornecedores = new ArrayList<>();
         
        ArrayList<Cliente> listacliente = new ArrayList<>();
        ArrayList<Item> listaitem = new ArrayList<>();
     
        // TODO code application logic here
        
        int opcao = 0;
        String aux = null;
        
        do{
            
           opcao = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastrar Fornecedor \n" + "2 - Cadastrar Cliente \n" + "3 - Cadastrar Item \n" + "4 - Listar Fornecedor \n" +"5 - Listar Clientes \n"+"6 - Listar items \n"+"7 - Buscar Fonecedor \n"+"8 - Buscar Cliente \n"+"9 - Buscar Item \n"+"0 - Sair \n "));
            
        switch(opcao){
            
            case 0:
                
                opcao = 6;
                
            break;
                case 1:
                Fornecedor f = new Fornecedor();
                f.preenche();
                listafornecedores.add(f);
                 break;
                 
            case 2:
                Cliente c = new Cliente();
                c.preenche();
                listacliente.add(c);
           
                 break;
            case 3:
                Item i = new Item();
                i.preenche();
                listaitem.add(i);
           
                 break; 
                 
            
            
            case 4: // Listar Fornecedores
                
            int q = listafornecedores.size();
            
                
            for(Fornecedor x: listafornecedores){
                
              
                JOptionPane.showMessageDialog(null, x);
            }
            break;
            case 5: // Listar Fornecedores
                
            int x = listacliente.size();
            aux ="";
            for(int j=0;  j<x;  j++){              
                aux = aux+listacliente.get(j)+"/n";
            }
            JOptionPane.showMessageDialog(null,aux);
            //segunda forma de fazer 
            /*
            for(Cliente ca: lsitacliente){
            aux = aux + ca +"/n"; 
            }
             JOptionPane.showMessageDialog(null,aux);       
            */            
            break;
            case 6: // Listar Fornecedores
                
            int a = listaitem.size();
            for(Item h: listaitem){
                JOptionPane.showMessageDialog(null, h);
            }      
            break;
            case 7:
                String buscarf = JOptionPane.showInputDialog("Qual é o Fonecedor que voçe quer buscar");
                aux = "";
                for(Fornecedor fi : listafornecedores){
                if(fi.getNome().equalsIgnoreCase(buscarf)){
                 aux = aux  + fi + "\n";
                    }
                }
                if(!aux.equals("")){
                 JOptionPane.showMessageDialog(null,aux);
                }
                else{
                JOptionPane.showMessageDialog(null,"Fornecedor não Cadastro");
                }
                
                break;
            case 8:
                aux = "";
                String buscarC = JOptionPane.showInputDialog("Qual é o Cliente que voçê quer buscar");
                for(Cliente ci :  listacliente){
                if(ci.getNome().equalsIgnoreCase(buscarC)){
                 aux = aux  + ci + "\n";
                    }
                }
                if(!aux.equals("")){
                 JOptionPane.showMessageDialog(null,aux);
                }
                else{
                JOptionPane.showMessageDialog(null,"Cliente não Cadastro");
                }
            
                break;
            case 9:
                aux = "";
                String buscarI = JOptionPane.showInputDialog("Qual é o item que voçê quer buscar");
                for(Item ii : listaitem){
                if(ii.getDescricao().contains(buscarI)){
                    aux = aux  + ii + "\n";
               }
                }
                if(!aux.equals("")){
                 JOptionPane.showMessageDialog(null,aux);
                }
                else{
                JOptionPane.showMessageDialog(null,"Item não Cadastro");
                }
            
                break;
            default:
                JOptionPane.showInputDialog("numero invalido");
                break;
        
        }  
        }while(opcao!=6);
        
    }
    
    
   
}
