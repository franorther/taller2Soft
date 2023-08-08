package org.example.punto4;

import java.util.HashMap;
import java.util.Map;

public class Reservas {
    private Map<String, Hotel> hoteles;

    public Reservas() {
        this.hoteles = new HashMap<>();;
    }
    public void agregarHotel(Hotel hotel) {
        hoteles.put(hotel.getNameHotel(),hotel);
    }
    public void realizarReserva(String nombreEmpresa, Hotel hotel, int numeroHabitacion, Cliente cliente) {
        Habitacion habitacion = hotel.getHabitaciones().get(numeroHabitacion - 1);
        if (habitacion != null && habitacion.getCliente() == null) {
            habitacion.setCliente(cliente);
            System.out.println("Reserva realizada para " + nombreEmpresa + " en el hotel " +
                    hotel.getNameHotel() + ", habitación " + numeroHabitacion + " ocupada por " +
                    cliente.getNameCliente() + " (Cédula: " + cliente.getIdCliente() + ")");
        } else {
            System.out.println("La habitación " + numeroHabitacion + " del hotel " +
                    hotel.getNameHotel() + " no está disponible.");
        }

    }
    public void cancelarReserva(Hotel hotel, int numeroHabitacion) {
        Habitacion habitacion = hotel.getHabitaciones().get(numeroHabitacion - 1);
        if (habitacion != null) {
            Cliente cliente = habitacion.getCliente();
            if (cliente != null) {
                habitacion.desocuparHabitacion();
                System.out.println("Reserva cancelada en el hotel " + hotel.getNameHotel() +
                        ", habitación " + numeroHabitacion + " liberada, ocupante: " +
                        cliente.getNameCliente() + " (Cédula: " + cliente.getIdCliente() + ")");
            } else {
                System.out.println("La habitación " + numeroHabitacion + " del hotel " +
                        hotel.getNameHotel() + " no tiene una reserva activa.");
            }
        } else {
            System.out.println("La habitación " + numeroHabitacion + " del hotel " +
                    hotel.getNameHotel() + " no está registrada en el sistema.");
        }
    }

}
