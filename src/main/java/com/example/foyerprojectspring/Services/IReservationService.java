package com.example.foyerprojectspring.Services;

import com.example.foyerprojectspring.Entities.Reservation;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IReservationService {
    Reservation addReservation(Reservation reservation);

    Reservation getReservationById(long idReservation);

    Reservation updateReservation(Reservation reservation);

    void deleteReservation(Reservation reservation);

    List<Reservation> getAllReservation();

    Reservation affecterEtudiantToReservation(String idREservation, Long idEtudiant) ;
}