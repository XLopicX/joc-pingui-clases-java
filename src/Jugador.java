public abstract class Jugador {
    private int posicion;
    private String nombre;
    private String color;

    public Jugador(int posicion, String nombre, String color) {
        this.posicion = posicion;
        this.nombre = nombre;
        this.color = color;
    }

    public int getPosicion() {
        return posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setColor(String color) {
        this.color = color;
    }

    void tirarDado(int maximoDado) {

    }

    void moverPosicion(int p) {

    }
}
