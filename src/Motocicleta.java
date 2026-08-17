public class Motocicleta extends Vehiculo{
    private int cilindraje;

    public Motocicleta() {
    }

    public Motocicleta(String placa, String modelo, String marca, int anualidad, double precioBase, int cilindraje) {
        super(placa, modelo, marca, anualidad, precioBase);
        this.cilindraje = cilindraje;
    }

    //Metodos:


    @Override
    public double Calcular_precio() {
        return 2+super.Calcular_precio();
    }

}
