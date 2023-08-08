package org.example.punto1;

import java.util.ArrayList;
import java.util.List;

public class SistemaAlumnos {
    private List<Alumnos> alumnos;

    public SistemaAlumnos() {
        this.alumnos = new ArrayList<>();
    }

    public void addAlumn(String name, int age, Double score) {
        Alumnos alumno = new Alumnos();

        alumno.setNombre(name);
        alumno.setEdad(age);
        alumno.setCalificaciones(score);

        this.alumnos.add(alumno);

    }

    public List<Alumnos> showAlumnInfo() {
        return this.alumnos;
    }

    public Double promPon() {
        ArrayList<Double> promedios = new ArrayList<>();
        Double prome = 0.0;
        for (Alumnos alumn : this.alumnos) {
            promedios.add(alumn.getCalificaciones());
        }
        for (int i = 0; i < promedios.size(); i++) {
            prome += promedios.get(i);
        }
        prome = prome / this.alumnos.size();
        return prome;
    }

}
