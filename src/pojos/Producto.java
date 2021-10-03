package pojos;

public abstract class Producto {
    protected String codigo;
    protected String modelo;

    public Producto(String codigo, String modelo) {
        this.setCodigo(codigo);
        this.setModelo(modelo);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo='" + codigo + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    public String modeloMayuscula(){ return modelo.toUpperCase(); }

    public abstract void estado();
}
