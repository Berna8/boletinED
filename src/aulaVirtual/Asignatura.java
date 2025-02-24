package aulaVirtual;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa una asignatura en el aula virtual.
 */
public class Asignatura {
    private String nombre;
    private Profesor profesor;
    private List<Alumno> alumnos;

    /**
     * Constructor.
     *
     * @param nombre Nombre de la asignatura.
     */
    public Asignatura(String nombre) {
        this.nombre = nombre;
        this.profesor = null;
        this.alumnos = new ArrayList<>();
    }

    /**
     * Obtiene el nombre de la asignatura.
     *
     * @return Nombre de la asignatura.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el profesor de la asignatura.
     *
     * @return Profesor de la asignatura.
     */
    public Profesor getProfesor() {
        return profesor;
    }

    /**
     * Agrega un alumno a la asignatura.
     *
     * @param alumno Alumno a agregar.
     */
    public void agreagarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    /**
     * Elimina un alumno de la asignatura.
     *
     * @param alumno Alumno a eliminar.
     */
    public void eliminarAlumno(Alumno alumno) {
        for (Alumno a : this.alumnos) {
            if (a.getNombre().equals(alumno.nombre)) alumnos.remove(a);
        }
    }

    /**
     * Obtiene la lista de alumnos inscritos.
     *
     * @return Lista de alumnos.
     */
    public List<Alumno> getAlumnos() {
        for (Alumno a : this.alumnos) {
            System.out.println("Alumno: " + a.getNombre() + " email: " + a.getEmail());
        }
        return alumnos;
    }
}