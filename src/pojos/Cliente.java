package pojos;

public class Cliente {
    private String Dni;
    private String domicilio;
    private int telefono;

    public Cliente(String dni, int telefono, String domicilio){
        setDni(dni);
        this.setTelefono(telefono);
        this.setDomicilio(domicilio);
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String dni) {
        Dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
