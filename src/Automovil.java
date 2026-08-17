public class Automovil extends Vehiculo{
    private int NumeroPuertas;
    private String  TipoConbustible;

    public Automovil() {
    }

    public Automovil(String placa, String modelo, String marca, int anualidad, double precioBase, String tipoConbustible, int numeroPuertas) {
        super(placa, modelo, marca, anualidad, precioBase);
        TipoConbustible = tipoConbustible;
        NumeroPuertas = numeroPuertas;
    }


    //Metodos

    @Override
    public double Calcular_precio() {
        return 1+super.Calcular_precio();
    }
}
