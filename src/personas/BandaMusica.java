package personas;

import java.util.ArrayList;
import java.util.List;

import actos.Actuacion;

public class BandaMusica {
    private String nombre;
    private List<Actuacion> actuaciones;

    public BandaMusica(String nombre) {
        this.nombre = nombre;
        this.actuaciones = new ArrayList<>();
    }

    public void annadirActuacion(Actuacion actuacion) {
        this.actuaciones.add(actuacion);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(nombre.toUpperCase()).append("\n");

        for (Actuacion actuacion : actuaciones) {
            result.append(actuacion).append("\n");
        }

        return result.toString();
    }
}