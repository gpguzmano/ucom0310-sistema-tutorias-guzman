package edu.uees.tutorias.observer;

import edu.uees.tutorias.domain.Reserva;

import java.util.ArrayList;
import java.util.List;

public class RegistroObservador implements ObservadorReserva{
    private final List<String> eventos = new ArrayList<>();

    @Override
    public void actualizar(Reserva reserva, String evento) {
        if (reserva == null) {
            throw new IllegalArgumentException("El reserva es obligatoria.");
        }

        if (evento == null || evento.isBlank()) {
            throw new IllegalArgumentException("El evento es obligatoria.");
        }

        eventos.add(evento);
    }

    public List<String> obtenerEventos() {
        return eventos;
    }
}
