/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

/**
 *
 * @author davia
 */
public class Cliente {
    
    private String nome;
    private String cpf;
    private int idade;
    private char ativo;
    private int telefone;
    private String email;
    
    
    public Cliente(){
        this.excluirClienteSeisMeses();
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getAtivo() {
        return ativo;
    }
    public void setAtivo(char ativo) {
        this.ativo = ativo;
    }

    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void cadastrarCliente(String nome,String cpf,int idade,int Telefone,String email){
    }
    public void alterarCliente(){
        
    }
    public String exibirCliente(int id){
        return "";
    }
    private void excluirClienteSeisMeses(){
        
    }
    

    

    

    
    
    
    
    
}
