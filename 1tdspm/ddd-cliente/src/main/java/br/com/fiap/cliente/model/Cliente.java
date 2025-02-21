package br.com.fiap.cliente.model;

import java.util.Scanner;

public class Cliente {
    Scanner leitor = new Scanner(System.in);

    //Atributos
    private String nome;
    private int idade;
    private int cpf;
    private String email;
    private int telefone;

    //Getters e Setters

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    //Metodos
    public Cliente CadastrarCliente(){
        System.out.println("Qual o nome do Cliente?");
        this.nome = leitor.next();

        System.out.println("Qual a idade do cliente?");
        this.idade = leitor.nextInt();

        System.out.println("Qual o cpf do cliente?");
        this.cpf = leitor.nextInt();

        System.out.println("Qual o email do Cliente?");
        this.email = leitor.next();

        System.out.println("Qual o telefone do Cliente?");
        this.telefone = leitor.nextInt();
        return this;
    }
}
