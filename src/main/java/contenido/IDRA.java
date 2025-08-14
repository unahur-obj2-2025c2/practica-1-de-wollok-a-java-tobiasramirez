package contenido;

public class IDRA {
    
    // 2- Creamos una unica instancia del Singleton
    private static IDRA instance = new IDRA();
    private Double valor = 0.5;

    // 1 - Ocultar constructor
    private IDRA() {
    }

    // 3 - Definimos el getter 
    public static IDRA getInstance() {
        return instance;
    }
    // 4 - Definimos los metodos restantes
    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    
}
