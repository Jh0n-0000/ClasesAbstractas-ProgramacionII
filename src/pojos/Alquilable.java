package pojos;

public abstract class Alquilable extends Producto{

    protected double precioHora;

    public Alquilable(String codigo, String modelo, double precioHora){
        super(codigo, modelo);

        this.setPrecioHora(precioHora);
    }


    public double getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }

    @Override
    public String toString() {
        return "Alquilable{" +
                "precioHora=" + precioHora +
                ", codigo='" + codigo + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
