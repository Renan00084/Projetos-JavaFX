package org.example.tabela;

public class Usuario {
    private String nome, email;

    public Usuario(String nome, String email){
        this.nome = nome;
        this.email = email;

    }

    public String getNome(){
        return nome;

    }

    public String getEmail(){
        return email;

    }

}
