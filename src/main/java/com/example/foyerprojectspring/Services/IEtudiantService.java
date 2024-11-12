package com.example.foyerprojectspring.Services;


import com.example.foyerprojectspring.Entities.Etudiant;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IEtudiantService {
    Etudiant addEtudiant(Etudiant etudiant);

    Etudiant getEtudiantById(long idEtudiant);

    Etudiant updateEtudiant(Etudiant etudiant);

    void deleteEtudiant(Etudiant etudiant);

    List<Etudiant> getAllEtudiant();
}