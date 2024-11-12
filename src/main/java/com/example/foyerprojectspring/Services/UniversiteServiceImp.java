package com.example.foyerprojectspring.Services;

import com.example.foyerprojectspring.Entities.Foyer;
import com.example.foyerprojectspring.Entities.Universite;
import com.example.foyerprojectspring.Repository.FoyerRepository;
import com.example.foyerprojectspring.Repository.UniversiteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UniversiteServiceImp implements IUniversiteService {
    UniversiteRepository universiteRepository;
    FoyerRepository foyerRepository;

    @Override
    public Universite addUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public Universite getUniversiteById(long idUniversite) {
        return universiteRepository.findById(idUniversite).get();
    }

    @Override
    public Universite updateUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public void deleteUniversite(Universite universite) {
        universiteRepository.delete(universite);
    }

    @Override
    public List<Universite> getAllUniversite() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite affecterFoyerExistsToUniversite(long id, Foyer foyer) {
        Universite universite = universiteRepository.findById(id).get();


        universite.setFoyer(foyer);

        return universiteRepository.save(universite);
    }
}
