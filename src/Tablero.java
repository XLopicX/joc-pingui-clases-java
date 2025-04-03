import java.util.ArrayList;

public class Tablero {

  private ArrayList <Casilla> casillas ;
  private ArrayList <Jugador> jugadores;

  int turnos;

  Jugador jugadorActual;

  public ArrayList<Casilla> getCasillas() {
    return casillas;
  }

  public ArrayList<Jugador> getJugadores() {
    return jugadores;
  }

  public int getTurnos() {
    return turnos;
  }

  public Jugador getJugadorActual() {
    return jugadorActual;
  }

  public void setCasillas(ArrayList<Casilla> casillas) {
    this.casillas = casillas;
  }

  public void setJugadores(ArrayList<Jugador> jugadores) {
    this.jugadores = jugadores;
  }

  public void setTurnos(int turnos) {
    this.turnos = turnos;
  }

  public void setJugadorActual(Jugador jugadorActual) {
    this.jugadorActual = jugadorActual;
  }
  void actualizarTablero(){

  }
  void actualizarJugador(Jugador j){

  }
}
