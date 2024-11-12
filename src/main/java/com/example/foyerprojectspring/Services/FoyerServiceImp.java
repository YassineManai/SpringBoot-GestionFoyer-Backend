package com.example.foyerprojectspring.Services;

import com.example.foyerprojectspring.Entities.Bloc;
import com.example.foyerprojectspring.Entities.Foyer;
import com.example.foyerprojectspring.Repository.BlocRepository;
import com.example.foyerprojectspring.Repository.FoyerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FoyerServiceImp implements IFoyerService {

    FoyerRepository foyerRepository;
BlocRepository blocRepository;

    @Override
    public Foyer addFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    @Override
    public Foyer getFoyerById(long idFoyer) {
        return foyerRepository.findById(idFoyer).get();
    }

    @Override
    public Foyer updateFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    @Override
    public void deleteFoyer(Foyer foyer) {
        foyerRepository.delete(foyer);
    }

    @Override
    public List<Foyer> getAllFoyer() {
        return foyerRepository.findAll();
    }

    @Override
    public void assignBlocToFoyer(Long idBloc, Long idFoyer) {
        Foyer foyer = foyerRepository.findById(idFoyer).get();
        Bloc bloc = blocRepository.findById(idBloc).get();

        bloc.setFoyer(foyer);
        blocRepository.save(bloc);
    }
}
