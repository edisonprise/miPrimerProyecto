public abstract class Automovil {// abstracta no se puede instanciar
    private String marca;
    private String modelo;
    private int anioFabricacion;

    public Automovil() { // constructor vacio solo la firma
    }

    public Automovil(String marca) { // sobrecarga; override
        this.marca = marca;
    }

    public Automovil(String marca, String modelo, int anioFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
    }

    public abstract void acelerar();//metodo abstracto; solo la firma; cada clase le da la implementacion que quiera;

    public String frenar() {
        return "Frenando";
    }

    public String getMarca(){
        return this.marca;
    }

    void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }
}
