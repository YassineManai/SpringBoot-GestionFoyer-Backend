package com.example.foyerprojectspring.Services;

import com.example.foyerprojectspring.Entities.Foyer;

import java.util.List;

public interface IFoyerService {
    Foyer addFoyer(Foyer foyer);

    Foyer getFoyerById(long idFoyer);

    Foyer updateFoyer(Foyer foyer);

    void deleteFoyer(Foyer foyer);

    List<Foyer> getAllFoyer();
    void assignBlocToFoyer(Long idBloc, Long idFoyer);
}