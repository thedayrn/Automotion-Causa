public class CamionCarga extends Vehiculo{
    private int capacidadTonelada;

    public CamionCarga() {
    }

    public CamionCarga(String placa, String modelo, String marca, int anualidad, double precioBase, int capacidadTonelada) {
        super(placa, modelo, marca, anualidad, precioBase);
        this.capacidadTonelada = capacidadTonelada;
    }

    //Metodos:

    @Override
    public double Calcular_precio() {
        return 5+super.Calcular_precio();
    }
}
