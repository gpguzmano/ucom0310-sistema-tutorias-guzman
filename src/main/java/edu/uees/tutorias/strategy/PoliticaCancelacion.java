package edu.uees.tutorias.strategy;

import edu.uees.tutorias.domain.Reserva;

public interface PoliticaCancelacion {
    boolean puedeCancelar(Reserva reserva);
}
