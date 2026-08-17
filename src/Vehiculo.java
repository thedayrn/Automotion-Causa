public abstract class Vehiculo {
    protected String placa;
    protected String modelo;
    protected String marca;
    protected int anualidad;
    protected double precioBase;

    public Vehiculo() {
    }
    public Vehiculo(String placa, String modelo, String marca, int anualidad, double precioBase) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.anualidad = anualidad;
        this.precioBase = precioBase;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnualidad() {
        return anualidad;
    }

    public void setAnualidad(int anualidad) {
        this.anualidad = anualidad;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", anualidad=" + anualidad +
                ", precioBase=" + precioBase +
                '}';
    }
    //metodos aqui:
    public String mostrarMensaje (){
        return ("Este es el vehiculo");
    }
    public double Calcular_precio(){
        System.out.println("Este es el metodo calular precio");
        return 0;
    }
}

