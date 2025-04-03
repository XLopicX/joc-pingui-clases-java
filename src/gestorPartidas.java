public class gestorPartidas { // Controlador
    private String urlBBDD;
    private String username;
    private String password;

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public String getUrlBBDD() {
        return urlBBDD;
    }

    public void setUrlBBDD(String urlBBDD) {
        this.urlBBDD = urlBBDD;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    void guardarPartida(Tablero t) {

    }

    Tablero cargarPartida() {
        return null;
    }
}
