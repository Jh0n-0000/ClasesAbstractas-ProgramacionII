package pojos;

public class Proveedor {
    private String nit;
    private String direccion;

    public Proveedor(String nit, String direccion) {
        this.setNit(nit);
        this.setDireccion(direccion);
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
