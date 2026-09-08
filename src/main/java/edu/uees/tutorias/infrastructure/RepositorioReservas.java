package edu.uees.tutorias.infrastructure;

import edu.uees.tutorias.domain.Reserva;

import java.util.Optional;

public class RepositorioReservas implements edu.uees.tutorias.service.RepositorioReservas {

    @Override
    public void guardar(Reserva reserva) {
        throw new UnsupportedOperationException("No implementado aún (Esqueleto inicial del proyecto).");
    }

    @Override
    public Optional<Reserva> buscarPorId(String id) {
        throw new UnsupportedOperationException("No implementado aún (Esqueleto inicial del proyecto).");
    }

    @Override
    public void actualizar(Reserva reserva) {
        throw new UnsupportedOperationException("No implementado aún (Esqueleto inicial del proyecto).");
    }
}