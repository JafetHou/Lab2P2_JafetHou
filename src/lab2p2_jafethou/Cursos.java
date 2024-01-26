
package lab2p2_jafethou;


public class Cursos {
    
    String titulo;
    String instructor;
    int semanas;
    String plataforma;

    public Cursos(String titulo, String instructor, int semanas, String plataforma) {
        this.titulo = titulo;
        this.instructor = instructor;
        this.semanas = semanas;
        this.plataforma = plataforma;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getInstructor() {
        return instructor;
    }

    public int getSemanas() {
        return semanas;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public void setSemanas(int semanas) {
        this.semanas = semanas;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public String toString() {
        return "Cursos{ " + "titulo: " + titulo + ", instructor: " + instructor + ", semanas de duracion:" + semanas + ", plataforma:" + plataforma + '}';
    }
    
    
    
}
