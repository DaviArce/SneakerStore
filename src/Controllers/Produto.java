/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

/**
 *
 * @author davia
 */
public class Produto {
    private int codProduto;
    private String nomeProduto;
    private char tipo;
    private String cor;
    private int tamanho;
    private int qtdProduto;

    public Produto() {

    }

    public int getCodProduto() {
        return codProduto;
    }
    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }
    public char getTipo() {
        return tipo;
    }
    public void setTipo(char tipo) {
        this.tipo = tipo;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getCor() {
        return cor;
    }
    public int getTamanho() {
        return tamanho;
    }
    public void setTamanho(int tamano) {
        this.tamanho = tamano;
    }
    public void setQtdProduto(int qtdProduto) {
        this.qtdProduto = qtdProduto;
    }
    public int getQtdProduto() {
        return qtdProduto;
    }
    public String getNomeProduto() {
        return nomeProduto;
    }
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    
    
    public void cadastrarProduto(String nomeProduto,char tipo, String cor, int tamanho, int qtdeProduto){
        
    }
    public String trazerProduto(int codProduto){
        return "";
    }
    public String trazerProduto(){
        return "";
    }
    public void alterarProduto(String nomeProduto,char tipo, String cor, int tamanho, int qtdeProduto){
        
    }
    public void excluirProduto(int codProduto){
        
    }
    

    
    
    
    
}
