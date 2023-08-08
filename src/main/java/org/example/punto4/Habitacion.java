package org.example.punto4;

public class Habitacion {
    private Integer idHabitacion;
    private Cliente cliente;

    public Habitacion(Integer idHabitacion) {
        this.idHabitacion = idHabitacion;
        this.cliente = cliente;
    }

    public Integer getIdHabitacion() {
        return idHabitacion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void desocuparHabitacion (){
        this.cliente = null;
    }
}
