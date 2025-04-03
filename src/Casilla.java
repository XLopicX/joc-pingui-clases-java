import java.util.ArrayList;

public abstract class Casilla {
    private int posicion;
    private ArrayList<Jugador> jugadoresActuales;

    public Casilla(ArrayList<Jugador> jugadoresActuales, int posicion) {
        this.jugadoresActuales = jugadoresActuales;
        this.posicion = posicion;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public ArrayList<Jugador> getJugadoresActuales() {
        return jugadoresActuales;
    }

    public void setJugadoresActuales(ArrayList<Jugador> jugadoresActuales) {
        this.jugadoresActuales = jugadoresActuales;
    }
}
