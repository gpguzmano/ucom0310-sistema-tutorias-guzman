package edu.uees.tutorias.observer;

import edu.uees.tutorias.domain.Reserva;

public interface ObservadorReserva {
    void actualizar(Reserva reserva, String evento);
}
