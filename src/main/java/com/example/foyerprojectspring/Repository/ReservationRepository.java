package com.example.foyerprojectspring.Repository;

import com.example.foyerprojectspring.Entities.Reservation;
import com.example.foyerprojectspring.Entities.Universite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {
}
