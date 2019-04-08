package ec.edu.ups.clases;

public class Profesor extends Persona { // Extend hereda de la clase Persona a Profesor

    private String titulo;
    private double salario;
    private String cargo;

    public Profesor(){ 
    }
    public Profesor(int codigo){
        super(codigo);
    }

    public Profesor(int codigo, String nombre, String cedula) {
        super(codigo, nombre, cedula);
    }

    public Profesor(String titulo, double salario, String cargo, int codigo, String nombre, String cedula, String telefono, String direccion, String correo) {
        super(codigo, nombre, cedula, telefono, direccion, correo);
        this.titulo = titulo;
        this.salario = salario;
        this.cargo = cargo;
    }
    
    @Override
    public String toString() {
        return "Profesor{" + "\ntitulo:" + titulo + "\nsalario:" + salario + "\ncargo:" + cargo + '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getSalario() {
        return salario;
    }
     
    public double gettSalario(int horasTrabajadas, double valorporHora){//sobrecarga de datos
        return salario + (horasTrabajadas * valorporHora);   
    }
    
    public double gettSalario(int comision){//sobregarga de datos
        return salario + comision;//retorna
    }
    

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
