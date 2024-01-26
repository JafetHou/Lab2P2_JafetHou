
package lab2p2_jafethou;

public class Articulo {
    
    String titulo;
    String autor;
    String tema;
    String fecha;
    String accesso;

    public Articulo(String titulo, String autor, String tema, String fecha, String accesso) {
        this.titulo = titulo;
        this.autor = autor;
        this.tema = tema;
        this.fecha = fecha;
        this.accesso = accesso;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getTema() {
        return tema;
    }

    public String getFecha() {
        return fecha;
    }

    public String getAccesso() {
        return accesso;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setAccesso(String accesso) {
        this.accesso = accesso;
    }

    @Override
    public String toString() {
        return "Articulo{ " + "titulo: " + titulo + ", autor: " + autor + ", tema: " + tema + ", fecha: " + fecha + ", accesso en linea: " + accesso + '}';
    }
    
    
    
}
