import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        System.out.printf("Hola causas");
        ArrayList<Vehiculo> inventario = new ArrayList<>();
        mostrarLista (inventario);
    }
    public static void mostrarLista (ArrayList<Vehiculo>inventario) {
        System.out.println ("Esta es la array del inventario");
    }
}