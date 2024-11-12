package com.example.foyerprojectspring.Repository;

import com.example.foyerprojectspring.Entities.Etudiant;
import com.example.foyerprojectspring.Entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
}
