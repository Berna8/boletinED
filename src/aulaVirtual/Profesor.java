package aulaVirtual;

/**
 * Representa a un profesor del aula virtual.
 */
public class Profesor extends Usuario {

    /**
     * Constructor.
     *
     * @param nombre Nombre del profesor.
     * @param email  Correo del profesor.
     */
    public Profesor(String nombre, String email) {
        super(nombre, email);
    }

    /**
     * Califica a un alumno en una asignatura.
     *
     * @param alumno     Alumno a calificar.
     * @param asignatura Asignatura correspondiente.
     * @param nota       Nota a asignar.
     * @return true si se asignó la nota, false si el profesor no imparte la asignatura.
     */
    public boolean calificarAlumno(Alumno alumno, Asignatura asignatura, int nota) {
        if (getAsignaturas().contains(asignatura)) {
            alumno.asignarNota(asignatura, nota);
            System.out.println("Nota asignada a " + alumno.getNombre() + " en " + asignatura.getNombre() + ": " + nota);
            return true;
        } else {
            System.out.println("El profesor no imparte esta asignatura.");
            return false;
        }
    }
}