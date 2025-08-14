package contenido;
public class Pelicula extends Contenido {
    public Pelicula(String titulo, Double costoBase) {
        super(titulo, costoBase);
        //TODO Auto-generated constructor stub
    }
    @Override
    protected Double doCosto() {
        return 0.0;
    }
}
