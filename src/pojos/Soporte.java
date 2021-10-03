package pojos;

public class Soporte {
    private Empresa empresa;
    private Tecnologico producto;
    private double precio;

    public Soporte(Empresa empresa, Tecnologico producto, double precio) {
        this.setEmpresa(empresa);
        this.setProducto(producto);
        this.setPrecio(precio);
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Tecnologico getProducto() {
        return producto;
    }

    public void setProducto(Tecnologico producto) {
        this.producto = producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
