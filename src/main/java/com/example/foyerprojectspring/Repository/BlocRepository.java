package com.example.foyerprojectspring.Repository;

import com.example.foyerprojectspring.Entities.Bloc;
import com.example.foyerprojectspring.Entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlocRepository extends JpaRepository<Bloc,Long> {
}
