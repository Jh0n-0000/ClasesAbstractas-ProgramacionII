package pojos;

import interfaces.IReseteable;

public class DiscoDuro extends Alquilable implements IReseteable {
    private int capacidad;

    public DiscoDuro(String codigo, String modelo, double precioHora, int capacidad){
        super(codigo, modelo, precioHora);

        this.capacidad = capacidad;
    }


    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public void reset() {
        System.out.println("Formateando disco duro");
    }

    @Override
    public void estado() {
        System.out.println("Sectores defectuosos:" + 1420 );
    }
}
