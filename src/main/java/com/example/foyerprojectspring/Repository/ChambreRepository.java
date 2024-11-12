package com.example.foyerprojectspring.Repository;

import com.example.foyerprojectspring.Entities.Chambre;
import com.example.foyerprojectspring.Entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChambreRepository extends JpaRepository<Chambre,Long> {
}
