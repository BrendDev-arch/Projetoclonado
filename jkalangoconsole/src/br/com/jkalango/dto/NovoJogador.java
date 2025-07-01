package br.com.jkalango.dto;

import javax.swing.JOptionPane;

public class NovoJogador {

    private String nome;


    public NovoJogador(String nome) {      
        this.nome = nome; 

    }

    public void setNome(String nome){
        this.nome = nome;

    }

    public String getNome() {
        return nome;
    }

   
    public String Verificar(String nome) {  
        if(nome.contains("java")){
            JOptionPane.showMessageDialog(null, "Pode ser cadastrado");
        }else{
            JOptionPane.showMessageDialog(null, "Não pode ser cadastrado");
        }
        return nome;
        
    }
}
       
    




