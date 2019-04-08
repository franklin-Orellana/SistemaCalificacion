package ec.edu.ups.prueba;

import ec.edu.ups.clases.Estudiante;
import ec.edu.ups.clases.Carrera;
import ec.edu.ups.clases.Grupo;
import ec.edu.ups.clases.HistorialCalificacion;
import ec.edu.ups.clases.Materia;
import ec.edu.ups.clases.Profesor;
import ec.edu.ups.clases.Sede;

public class Prueba {

    public static void main(String[] args) {

        Sede sedecuenca = new Sede(0, "Sede Cuenca", "El Vecino", "28386");
                
        Carrera computacion = new Carrera(1, "Computacion", 10, 20, "Ing. en Ciencias de la Computacion");
        Carrera mecatronica = new Carrera(2, "Mecatronica", 10, 20, "Ing. en Mecatronica");
        Carrera telematica = new Carrera(3, "Telematica", 10, 15, "Ing. Telematica");
                       
        Materia matematicas = new Materia(1, "Matematicas Avanzadas", 3, 160, 1);
        Materia programacion = new Materia(2, "Programacion Aplicada", 3, 200, 1);
        Materia calculo = new Materia(3, "Calculo de una Variable", 3, 200, 2);
        Materia etica = new Materia(4, "etica", 2, 80, 4);
        Materia algebra = new Materia(5, "Algebra", 1, 160, 2);
        Materia ecuaciones = new Materia(6, "Ecuaciones Diferenciales", 2, 180, 2);
     
        Profesor gustavobravo = new Profesor("Ing.", 1.300, "Profesor", 1, "Gustavo Bravo", "012345678", "2868451", "Totoracocha", "gustavo@ups.edu.ec");
        Profesor berthatacuri = new Profesor("Ing.", 1.500, "Directora de Carrera", 2, "Bertha Tacuri", "0102569786", "28689321", "Las Orquideas", "bertha@ups.edu.ec");
                
        Estudiante franklin = new Estudiante(1, "Franklin Orellana", "0105599914", "2838601", "El Vecino", "forellanac1@est.ups.edu.ec");
        Estudiante carlos = new Estudiante(2, "Carlos Condor", "0154238610", "0962725667", "Miraflores", "calos@est.ups.edu.ec");
        Estudiante diego = new Estudiante(3, "Diego Pina", "0153496785", "099586785", "Miraflores", "pina@est.ups.edu.ec");
        Estudiante alexander = new Estudiante(4, "Alexander Quezada", "0103658935", "098763542", "Las Orquideas", "alexander@est.ups.edu.ec");
        
        
        Grupo grupo1 = new Grupo(1, "", 20);
        Grupo grupo2 = new Grupo(2, "", 15);
        
        sedecuenca.agregarCarrera(computacion);
        sedecuenca.agregarCarrera(mecatronica);
        sedecuenca.agregarCarrera(telematica);
             
        computacion.agregarMateria(matematicas);
        computacion.agregarMateria(programacion);
        
        mecatronica.agregarMateria(calculo);
        mecatronica.agregarMateria(etica);
        
        telematica.agregarMateria(algebra);
        telematica.agregarMateria(ecuaciones);

        computacion.agregarMateria(matematicas);
        computacion.agregarMateria(programacion);
        
        mecatronica.agregarMateria(calculo);
        mecatronica.agregarMateria(etica);
        
        telematica.agregarMateria(algebra);
        telematica.agregarMateria(ecuaciones);
        
        matematicas.agregarGrupo(grupo1);
        matematicas.agregarProfesor(gustavobravo);
        
        programacion.agregarGrupo(grupo1);
        programacion.agregarProfesor(berthatacuri);
        
        calculo.agregarGrupo(grupo1);
        calculo.agregarProfesor(gustavobravo);
        
        etica.agregarGrupo(grupo2);
        etica.agregarProfesor(berthatacuri);

        algebra.agregarGrupo(grupo2);
        algebra.agregarProfesor(gustavobravo);
        
        ecuaciones.agregarGrupo(grupo2);
        ecuaciones.agregarProfesor(berthatacuri);
        
        franklin.setCarrera(mecatronica);
        carlos.setCarrera(computacion);
        
        System.out.println("sedeCuenca: "+ sedecuenca.toString());
        
        //agregar a la sede carreras
        //agregar a carrera materias
        //agregar a materia grupo
        
    }
}
