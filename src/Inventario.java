import java.util.ArrayList;

public class Inventario { // Modelo
    private ArrayList<Item> lista;

    public Inventario(ArrayList<Item> lista) {
        this.lista = lista;
    }

    public ArrayList<Item> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Item> lista) {
        this.lista = lista;
    }
}
