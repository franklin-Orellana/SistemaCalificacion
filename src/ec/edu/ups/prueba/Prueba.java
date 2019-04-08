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

        Sede sedeCuenca = new Sede(0, "Sede Cuenca", "El Vecino", "28386");
        System.out.println(sedeCuenca.toString());
        
        Carrera computacion = new Carrera(1, "Computacion", 10, 20, "Ing. en Ciencias de la Computacion");
        System.out.println(computacion.toString());
        Carrera mecatronica = new Carrera(2, "Mecatronica", 10, 20, "Ing. en Mecatronica");
        System.out.println(mecatronica.toString());
        Carrera telematica = new Carrera(3, "Telematica", 10, 15, "Ing. Telematica");
        System.out.println(telematica.toString());
        
        sedeCuenca.agregarCarrera(computacion);
        sedeCuenca.agregarCarrera(mecatronica);
        sedeCuenca.agregarCarrera(telematica);
        
        Materia matematicas = new Materia(1, "Matematicas Avanzadas", 3, 160, 1);
        System.out.println(matematicas.toString());
        Materia programacion = new Materia(2, "Programacion Aplicada", 3, 200, 1);
        System.out.println(programacion.toString());
        Materia calculo = new Materia(3, "Calculo de una Variable", 3, 200, 2);
        System.out.println(calculo.toString());
        Materia etica = new Materia(4, "etica", 2, 80, 4);
        System.out.println(etica.toString());
        Materia algebra = new Materia(5, "Algebra", 1, 160, 2);
        System.out.println(algebra.toString());
        Materia ecuaciones = new Materia(6, "Ecuaciones Diferenciales", 2, 180, 2);
        System.out.println(ecuaciones.toString());
               
        computacion.agregarMateria(matematicas);
        computacion.agregarMateria(programacion);
        mecatronica.agregarMateria(calculo);
        mecatronica.agregarMateria(etica);
        telematica.agregarMateria(algebra);
        telematica.agregarMateria(ecuaciones);

        Profesor gustavobravo = new Profesor("Ing.", 1.300, "Profesor", 1, "Gustavo Bravo", "012345678", "2868451", "Totoracocha", "gustavo@ups.edu.ec");
        System.out.println(gustavobravo.toString());
        Profesor berthatacuri = new Profesor("Ing.", 1.500, "Directora de Carrera", 2, "Bertha Tacuri", "0102569786", "28689321", "Las Orquideas", "bertha@ups.edu.ec");
        System.out.println(berthatacuri.toString());
        
        Estudiante franklin = new Estudiante(1, "Franklin Orellana", "0105599914", "2838601", "El Vecino", "forellanac1@est.ups.edu.ec");
        System.out.println(franklin.toString());
        Estudiante carlos = new Estudiante(2, "Carlos Condor", "0154238610", "0962725667", "Miraflores", "calos@est.ups.edu.ec");
        System.out.println(carlos.toString());
        Estudiante diego = new Estudiante(3, "Diego Pina", "0153496785", "099586785", "Miraflores", "pina@est.ups.edu.ec");
        System.out.println(diego.toString());
        Estudiante alexander = new Estudiante(4, "Alexander Quezada", "0103658935", "098763542", "Las Orquideas", "alexander@est.ups.edu.ec");
        System.out.println(alexander.toString());
        
        Grupo grupo1 = new Grupo(1, "", 20);
        System.out.println(grupo1.toString());
        Grupo grupo2 = new Grupo(2, "", 15);
        System.out.println(grupo2.toString());
        
        //agregar a la sede carreras
        //agregar a carrera materias
        //agregar a materia grupo
        
    }
}
