package Model;

public class Administrador extends Usuario {

    private int claveSeguridad;

    private String emailAdministrador;

    public Administrador() {
    }

    public Administrador(int claveSeguridad, String emailAdministrador) {
        this.claveSeguridad = claveSeguridad;
        this.emailAdministrador = emailAdministrador;
    }

    public int getClaveSeguridad() {
        return claveSeguridad;
    }

    public void setClaveSeguridad(int claveSeguridad) {
        this.claveSeguridad = claveSeguridad;
    }

    public String getEmailAdministrador() {
        return emailAdministrador;
    }

    public void setEmailAdministrador(String emailAdministrador) {
        this.emailAdministrador = emailAdministrador;
    }
}
