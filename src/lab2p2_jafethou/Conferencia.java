
package lab2p2_jafethou;


public class Conferencia {
    String titulo;
    String conferensista;
    String fecha;
    String duracion;
    String enlace;

    public Conferencia(String titulo, String conferensista, String fecha, String duracion, String enlace) {
        this.titulo = titulo;
        this.conferensista = conferensista;
        this.fecha = fecha;
        this.duracion = duracion;
        this.enlace = enlace;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getConferensista() {
        return conferensista;
    }

    public String getFecha() {
        return fecha;
    }

    public String getDuracion() {
        return duracion;
    }

    public String getEnlace() {
        return enlace;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setConferensista(String conferensista) {
        this.conferensista = conferensista;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }

    @Override
    public String toString() {
        return "Conferencia { " + "titulo: " + titulo + ", conferensista: " + conferensista + ", fecha: " + fecha + ", duracion: " + duracion + ", enlace de accesso: " + enlace + '}';
    }
    
    
}
