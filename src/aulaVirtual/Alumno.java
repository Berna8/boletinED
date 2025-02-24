package aulaVirtual;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Alumno del aula virtual con calificaciones en asignaturas.
 */
public class Alumno extends Usuario {

    /**
     * Notas del alumno por asignatura.
     */
    private Map<Asignatura, Integer> notas;

    /**
     * Constructor.
     *
     * @param nombre Nombre del alumno.
     * @param email  Correo del alumno.
     */
    public Alumno(String nombre, String email) {
        super(nombre, email);
        this.notas = new HashMap<>();
    }

    /**
     * Retorna las notas del alumno.
     *
     * @return Mapa de asignaturas y notas.
     */
    public Map<Asignatura, Integer> getNotas() {
        return new HashMap<>(notas);
    }

    /**
     * Asigna una nota si el alumno está inscrito.
     *
     * @param asignatura Asignatura.
     * @param nota       Nota a asignar.
     */
    protected void asignarNota(Asignatura asignatura, int nota) {
        if (getAsignaturas().contains(asignatura)) {
            notas.put(asignatura, nota);
        } else {
            System.out.println("El alumno no está inscrito en esta asignatura.");
        }
    }

    /**
     * Muestra las notas del alumno.
     */
    public void mostrarNotas() {
        System.out.println("Notas del alumno " + nombre + ":");
        for (Map.Entry<Asignatura, Integer> entry : notas.entrySet()) {
            System.out.println(entry.getKey().getNombre() + ": " + entry.getValue());
        }
    }

    /**
     * Obtiene la nota de una asignatura.
     *
     * @param asignatura Asignatura.
     * @return Nota o -1 si no hay registro.
     */
    public int obtenerNota(Asignatura asignatura) {
        return notas.getOrDefault(asignatura, -1);
    }
}