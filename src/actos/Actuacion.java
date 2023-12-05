package actos;

import personas.Musico;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Actuacion {
    private LocalDate fecha;
    private List<Musico> participantes;

    public Actuacion(LocalDate fecha) {
        this.fecha = fecha;
        this.participantes = new ArrayList<>();
    }

    public void annadirParticipante(Musico participante) {
        this.participantes.add(participante);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Fecha de actuación: ").append(fecha).append("\n");

        for (Musico participante : participantes) {
            result.append(participante).append("\n");
        }

        return result.toString();
    }
}
