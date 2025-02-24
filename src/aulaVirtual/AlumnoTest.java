package aulaVirtual;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas para Alumno.
 */
class AlumnoTest {
    private Alumno alumno;
    private Asignatura geografia;
    private Asignatura filosofia;

    /**
     * Configuración previa.
     */
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        alumno = new Alumno("Javier", "javi@gmail.com");
        geografia = new Asignatura("Geografia");
        filosofia = new Asignatura("Filosofia");
        alumno.inscribirAsignatura(geografia);
    }

    /**
     * Prueba nota en asignatura inscrita.
     */
    @org.junit.jupiter.api.Test
    void obtenerNotaInscrita() {
        alumno.asignarNota(geografia, 60);
        assertEquals(60, alumno.obtenerNota(geografia));
    }

    /**
     * Prueba nota en asignatura no inscrita.
     */
    @org.junit.jupiter.api.Test
    void obtenerNotaNoInscrita() {
        assertEquals(-1, alumno.obtenerNota(geografia));
    }

    /**
     * Método de prueba vacío.
     */
    @org.junit.jupiter.api.Test
    public void obtenerNota() {}
}