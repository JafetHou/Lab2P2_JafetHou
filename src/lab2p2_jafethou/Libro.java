
package lab2p2_jafethou;


public class Libro {
    String titulo;
    String autor;
    String genero;
    int anio;
    String disponibilidad;

    public Libro(String titulo, String autor, String genero, int anio, String disponibilidad) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.anio = anio;
        this.disponibilidad = disponibilidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public int getAnio() {
        return anio;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public String toString() {
        return "Libro{ " + "titulo: " + titulo + ", autor: " + autor + ", genero: " + genero + ", anio: " + anio + ", disponibilidad: " + disponibilidad + '}';
    }
    
    
         
}
