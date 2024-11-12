package com.example.foyerprojectspring.Services;

import com.example.foyerprojectspring.Entities.Bloc;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IBlocService {
    Bloc addBloc(Bloc bloc);

    Bloc getBlocById(long idBloc);

    Bloc updateBloc(Bloc bloc);

    void deleteBloc(Bloc bloc);

    List<Bloc> getAllBloc();

    Bloc ajouterBlocEtChambresAssocie(Bloc bloc) ;
}
