package planes;

public class PlanBasico implements Planeable {
    private Integer limite;

    public PlanBasico(Integer limite) {
        this.limite = limite;
    }

    @Override
    public Double costoPlan(Usuario usuario) {
        // TODO Auto-generated method stub
        return 0.0; //TODO falta implementar
    }
    
}
