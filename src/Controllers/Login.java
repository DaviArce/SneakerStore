package Controllers;
import View.Atendente;
import View.Gerente;
import View.Main;
import javax.swing.JOptionPane;
import Models.Usuarios;

public class Login {
          
    private String usuario;
    private String senha;

    public Login(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public String getSenha() {
        return senha;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }
    
    public void login(){
        Usuarios users = new Usuarios();
        if(this.senha.equals(users.info[1][0]) && this.usuario.equals(users.info[0][0])){
            
            if(users.info[2][0] == "true"){
                
                Gerente ger = new Gerente();
                ger.setVisible(true);
                
                System.out.println("você é admin");
            }
            else{
                
                Atendente atd = new Atendente();
                atd.setVisible(true);
                
                System.out.println("você não é admin");
            }
        }
        else{
            
            Main main = new Main();
            main.setVisible(true);
            
            JOptionPane.showMessageDialog(null, "Verique se o usuário ou senha está correto");
   
        }
    }
    public void logoff(){
        
    }
    public String criptografarSenha(String senha){
        return "";
    }
    public String descriptografarSenha(String senha){
        return "";
    }
    
}
