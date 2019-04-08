package ec.edu.ups.clases;

public class Estudiante extends Persona {//extends herada de la clase persona a Estudiante
    private Carrera carrera;

        public Estudiante(){    //constructor        
       }
       
        public Estudiante (int codigo){
            super(codigo);
        }
        public Estudiante(int codigo, String nombre, String cedula){//constructor
         super(codigo, nombre, cedula);//instanciar al padre con los datos de entrada 
        }

    public Estudiante(int codigo, String nombre, String cedula, String telefono, String direccion, String correo) {
        super(codigo, nombre, cedula, telefono, direccion, correo);

    }

    public Estudiante(Carrera carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "carrera=" + carrera + '}';
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

}
