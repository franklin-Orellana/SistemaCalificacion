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
    private List<Profesor> profesor;

    public List<Profesor> getProfesor() {
        return profesor;
    }

    public void setProfesor(List<Profesor> profesor) {
        this.profesor = profesor;
    }
    
    public Materia() {
       
    }

    public List<Grupo> getGrupo() {
        return grupo;
    }

    public void setGrupo(List<Grupo> grupo) {
        this.grupo = grupo;
    }


    public Materia(int codigo, String nombre, int numeroCreditos, int numeroHoras, int nivel) {//constructor
        this.codigo = codigo;
        this.nombre = nombre;
        this.numeroCreditos = numeroCreditos;
        this.numeroHoras = numeroHoras;
        this.nivel = nivel;
        grupo = new ArrayList<>();
        profesor = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Materia{" + "\ncodigo:" + codigo + "\nnombre:" + nombre + "\nnumeroCreditos:" + numeroCreditos + "\nnumeroHoras:" + numeroHoras + "\nnivel:" + nivel + "\ngrupo:" + grupo + "\nprofesor:" + profesor + '}';
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

    
    public void agregarGrupo(Grupo grupo1) {
        this.grupo.add(grupo1);

    }
    public void agregarProfesor(Profesor profe){
        profesor.add(profe);
    }
            
}
