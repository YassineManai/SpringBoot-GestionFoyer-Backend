package com.example.foyerprojectspring.Services;

import com.example.foyerprojectspring.Entities.Etudiant;
import com.example.foyerprojectspring.Entities.Reservation;
import com.example.foyerprojectspring.Repository.EtudiantRepository;
import com.example.foyerprojectspring.Repository.ReservationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class ReservationServiceImp implements IReservationService {

    ReservationRepository reservationRepository;
EtudiantRepository etudiantRepository;


    @Override
    public Reservation addReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation getReservationById(long idReservation) {
        return reservationRepository.findById(idReservation).get();
    }

    @Override
    public Reservation updateReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public void deleteReservation(Reservation reservation) {
        reservationRepository.delete(reservation);
    }

    @Override
    public List<Reservation> getAllReservation() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation affecterEtudiantToReservation(String idREservation, Long idEtudiant) {
       Etudiant etudiant =etudiantRepository.findById(idEtudiant).get();
       Reservation reservation= reservationRepository.findById(Long.valueOf(idREservation)).get();

       List<Etudiant> etudiants = new ArrayList<>();


       if(reservation.getEtudiants()!=null) {
          etudiants = reservation.getEtudiants();
       }
       etudiants.add(etudiant);
       reservation.setEtudiants(etudiants);
       reservationRepository.save(reservation);
       return reservation;
    }


}
