package edu.uees.tutorias.repository;

import edu.uees.tutorias.domain.Reserva;

import java.util.Optional;

public interface RepositorioReservas {
    void guardar(Reserva reserva);
    Optional<Reserva> buscarPorId(String id);
    void actualizar(Reserva reserva);
}