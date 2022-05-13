/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

/**
 *
 * @author davia
 */
public class Estoque extends Produto {
    private double tamanhoMinimo;
    private double tamanhoMaximo;

    public Estoque() {
        this.verificarLimiteEstoque();
    }

    public double getTamanhoMinimo() {
        return tamanhoMinimo;
    }
    public void setTamanhoMinimo(double tamanhoMinimo) {
        this.tamanhoMinimo = tamanhoMinimo;
    }
    public double getTamanhoMaximo() {
        return tamanhoMaximo;
    } 
    public void setTamanhoMaximo(double tamanhoMaximo) {
        this.tamanhoMaximo = tamanhoMaximo;
    }
    
    public void verificarLimiteEstoque(){
        
    }
    
    public void cadastrarProdEstoque(){
        
    }

    public void alterarProdEstoque(){
        
    }
    
    public String trazerProdEstoque(){
        return "";
    }
    public String trazerProdEstoque(int Id){
        return "";
    }
    public void subtrarEstoque(){
        
    }
}
