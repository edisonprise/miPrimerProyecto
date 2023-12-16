public class Main {
    public static void main(String[] args) {
        Automovil autoFamiliar = new AutoFamiliar();
        Automovil autoDeportivo = new AutoDeportivo( "Ford",  "Fiesta", 2022, true);
        Automovil autoDeportivo2 = new AutoDeportivo("Fiat");

        autoDeportivo.setMarca("Chevrolet");
        autoDeportivo.setModelo("Chevette");

        AutoDeportivo autoDeportivo1 = new AutoDeportivo();
        autoDeportivo1.setEsConvertible(true);

        System.out.println("Auto 1, año de fabricacion: " + autoFamiliar.getAnioFabricacion());
        System.out.println("Auto 2, marca: " + autoDeportivo.getMarca());

    }
}