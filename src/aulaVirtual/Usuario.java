package aulaVirtual;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa un usuario genérico en el aula virtual.
 * Puede ser un Alumno o un Profesor.
 *
 * @author Berna
 * @version 0.1
 */
public class Usuario {
    protected String nombre; // Nombre del usuario
    protected String email;  // Correo electrónico del usuario
    private List<Asignatura> asignaturas; // Lista de asignaturas en las que está inscrito el usuario

    /**
     * Constructor para crear un nuevo usuario.
     *
     * @param nombre El nombre del usuario.
     * @param email  El correo electrónico del usuario.
     */
    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
        this.asignaturas = new ArrayList<>();
    }

    /**
     * Obtiene una copia de la lista de asignaturas en las que está inscrito el usuario.
     *
     * @return Una lista de asignaturas.
     */
    public List<Asignatura> getAsignaturas() {
        return new ArrayList<>(asignaturas);
    }

    /**
     * Inscribe al usuario en una asignatura.
     *
     * @param asignatura La asignatura a inscribir.
     */
    public void inscribirAsignatura(Asignatura asignatura) {
        asignaturas.add(asignatura);
    }

    /**
     * Obtiene el nombre del usuario.
     *
     * @return El nombre del usuario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el correo electrónico del usuario.
     *
     * @return El correo electrónico del usuario.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Simula el inicio de sesión del usuario.
     *
     * @param password La contraseña proporcionada por el usuario.
     * @return Siempre devuelve true (simulación de autenticación exitosa).
     */
    public boolean iniciarSesión(String password) {
        // Simula la consulta a la base de datos de las credenciales del usuario
        int hash = password.hashCode();
        return true;
    }
}