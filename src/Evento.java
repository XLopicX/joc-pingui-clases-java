import java.util.ArrayList;

public class Evento extends Casilla { // Modelo
    private String tipoEvento;

    public Evento(ArrayList<Jugador> jugadoresActuales, int posicion, String tipoEvento) {
        super(jugadoresActuales, posicion);
        this.tipoEvento = tipoEvento;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public void realizarAccion(){

    }
}
