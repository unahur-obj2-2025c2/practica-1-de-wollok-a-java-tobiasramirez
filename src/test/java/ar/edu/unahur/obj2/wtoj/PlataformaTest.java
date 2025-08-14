package ar.edu.unahur.obj2.wtoj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import contenido.Contenido;
import contenido.Documental;
import contenido.Pelicula;


public class PlataformaTest {
        @Test
        void dadaUnaPelicula_SeCalculaElCosto() {
                Contenido pelicula = new Pelicula("Madagascar", 10.5);
                assertEquals(10.5, pelicula.costo());
        }

        @Test
        void dadoUnDocumental_SeCalculaElCosto() {
                Contenido documental = new Documental("Docu1", 5.3);
                assertEquals(5.8, documental.costo());
        }
}
