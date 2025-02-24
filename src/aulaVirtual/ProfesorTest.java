package aulaVirtual;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas para Profesor.
 */
class ProfesorTest {
    private Profesor profesor;
    private Alumno alumno;
    private Asignatura geografia;
    private Asignatura filosofia;

    /**
     * Configuración previa.
     */
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        profesor = new Profesor("Javier Barcelo", "javibarcelo@gmail.com");
        alumno = new Alumno("Bernabe", "berna@gmail.com");
        geografia = new Asignatura("Geografia");
        filosofia = new Asignatura("Filosofia");
    }

    /**
     * Prueba calificación de un alumno.
     */
    @org.junit.jupiter.api.Test
    void calificarAlumno() {
        boolean resultado = profesor.calificarAlumno(alumno, geografia, 60);
        assertTrue(resultado);
        assertEquals(60, alumno.obtenerNota(geografia));
    }
}