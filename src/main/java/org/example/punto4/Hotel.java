package org.example.punto4;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
       private String nameHotel;
       private List<Habitacion> habitaciones;

    public Hotel() {
        this.nameHotel = nameHotel;
        this.habitaciones = new ArrayList<>();
    }

    public void setNameHotel(String nameHotel) {
        this.nameHotel = nameHotel;
    }

    public String getNameHotel() {
        return nameHotel;
    }

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void addHabitacion (Habitacion habitacion){
        habitaciones.add(habitacion);
    }
}
