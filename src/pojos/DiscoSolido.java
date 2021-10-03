package pojos;

import interfaces.IReseteable;

import java.util.Date;

public class DiscoSolido extends Tecnologico implements IReseteable {
    private int capacidad;

    public DiscoSolido(String codigo, String modelo, String paisOrigen, Date fechaFabricaion, Empresa fabricante, int capacidad){
        super(codigo, modelo, paisOrigen, fechaFabricaion, fabricante);

        this.setCapacidad(capacidad);
    }


    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public void reset() {
        System.out.println("Formateando Disco Solido...");
    }

    @Override
    public void estado() {
        System.out.println("Cantidad formateos:" + 50);

    }
}
