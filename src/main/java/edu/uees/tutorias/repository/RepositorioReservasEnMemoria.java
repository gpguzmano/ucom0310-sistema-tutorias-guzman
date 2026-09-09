package edu.uees.tutorias.repository;

import edu.uees.tutorias.domain.Reserva;

import java.util.Optional;

public class RepositorioReservasEnMemoria implements RepositorioReservas {

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