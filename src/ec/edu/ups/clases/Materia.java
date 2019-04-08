package ec.edu.ups.clases;

import java.util.ArrayList;
import java.util.List;

public class Materia {

    private int codigo;
    private String nombre;
    private int numeroCreditos;
    private int numeroHoras;
    private int nivel;
    private List<Grupo> grupo;

    public Materia() {
        grupo = new ArrayList<>();
    }

    public List<Grupo> getGrupo() {
        return grupo;
    }

    public void setGrupo(List<Grupo> grupo) {
        this.grupo = grupo;
    }
    private Profesor profesor;

    public Materia(int codigo, String nombre, int numeroCreditos, int numeroHoras, int nivel) {//constructor
        this.codigo = codigo;
        this.nombre = nombre;
        this.numeroCreditos = numeroCreditos;
        this.numeroHoras = numeroHoras;
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Materia{" + "codigo=" + codigo + ", nombre=" + nombre + ", numeroCreditos=" + numeroCreditos + ", numeroHoras=" + numeroHoras + ", nivel=" + nivel + ", grupo=" + grupo + ", profesor=" + profesor + '}';
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroCreditos() {
        return numeroCreditos;
    }

    public void setNumeroCreditos(int numeroCreditos) {
        this.numeroCreditos = numeroCreditos;
    }

    public int getNumeroHoras() {
        return numeroHoras;
    }

    public void setNumeroHoras(int numeroHoras) {
        this.numeroHoras = numeroHoras;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public void agregarGrupo(Grupo grupo1) {
        this.grupo.add(grupo1);

    }
}
