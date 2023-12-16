public class AutoDeportivo extends Automovil{

    private boolean esConvertible;

    public AutoDeportivo() {
    }

    public AutoDeportivo(String marca) {
        super(marca);
    }

    public AutoDeportivo(String marca, String modelo, int anioFabricacion, boolean esConvertible) {
        super(marca, modelo, anioFabricacion);
        this.esConvertible = esConvertible;
    }

    @Override
    public void acelerar(){
        System.out.println("Acelerar muy rapido");
    }

    public void setEsConvertible(boolean esConvertible){
        this.esConvertible = esConvertible;
    }
}
