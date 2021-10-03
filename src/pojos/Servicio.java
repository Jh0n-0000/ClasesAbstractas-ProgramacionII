package pojos;

public class Servicio {
    private Cliente cliente;
    private Impresora imppresora;
    private String detalle;
    private double totalFacturado;

    public Servicio(Cliente cliente, Impresora imppresora, String detalle, double totalFacturado) {
        this.setCliente(cliente);
        this.setImppresora(imppresora);
        this.setDetalle(detalle);
        this.setTotalFacturado(totalFacturado);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Impresora getImppresora() {
        return imppresora;
    }

    public void setImppresora(Impresora imppresora) {
        this.imppresora = imppresora;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public double getTotalFacturado() {
        return totalFacturado;
    }

    public void setTotalFacturado(double totalFacturado) {
        this.totalFacturado = totalFacturado;
    }
}
