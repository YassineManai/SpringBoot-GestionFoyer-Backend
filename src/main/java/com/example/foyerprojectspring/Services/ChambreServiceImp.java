package com.example.foyerprojectspring.Services;

import com.example.foyerprojectspring.Entities.Chambre;
import com.example.foyerprojectspring.Repository.ChambreRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class ChambreServiceImp implements IChambreService{

    ChambreRepository chambreRepository;


    @Override
    public Chambre addChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public Chambre getChambreById(long idChambre) {
        return chambreRepository.findById(idChambre).get();
    }

    @Override
    public Chambre updateChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public void deleteChambre(Chambre chambre) {
        chambreRepository.delete(chambre);
    }

    @Override
    public List<Chambre> getAllChambre() {
        return chambreRepository.findAll();
    }

    public void deleteChambreById(long idChambre) {
        if (!chambreRepository.existsById(idChambre)) {
            throw new EntityNotFoundException("Chambre not found with id: " + idChambre);
        }
        chambreRepository.deleteById(idChambre);
    }


}
