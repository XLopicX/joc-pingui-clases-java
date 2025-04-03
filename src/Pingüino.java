public class Pingüino extends Jugador { // Modelo
    private Inventario inv;

    public Pingüino(int posicion, String nombre, String color, Inventario inv) {
        super(posicion, nombre, color);
        this.inv = inv;
    }

    public Inventario getInv() {
        return inv;
    }

    public void setInv(Inventario inv) {
        this.inv = inv;
    }

    public void gestionarBatalla() {

    }

    public void usarObjeto() {

    }

    public void añadirItem() {

    }

    public void quitarItem() {

    }
}
