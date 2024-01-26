
package lab2p2_jafethou;


public class accesso {
    
    String user;
    String contra;
    int tipo;
    
    public accesso(String userN, String contraN, int tipoN){
        this.user = userN;
        this.contra = contraN;
        this.tipo = tipoN;
        
    }

    public String getUser() {
        return user;
    }

    public String getContra() {
        return contra;
    }

    public int getTipo() {
        return tipo;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    
}
