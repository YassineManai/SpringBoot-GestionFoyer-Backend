package com.example.foyerprojectspring.Services;

import com.example.foyerprojectspring.Entities.Bloc;
import com.example.foyerprojectspring.Repository.BlocRepository;
import com.example.foyerprojectspring.Repository.ChambreRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BlocServiceImp implements IBlocService{

    BlocRepository blocRepository;
ChambreRepository chambreRepository;

    @Override
    public Bloc addBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public Bloc getBlocById(long idBloc) {
        return blocRepository.findById(idBloc).get();
    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public void deleteBloc(Bloc bloc) {
        blocRepository.delete(bloc);
    }

    @Override
    public List<Bloc> getAllBloc() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc ajouterBlocEtChambresAssocie(Bloc bloc) {
        Bloc newBloc = blocRepository.save(bloc);

        newBloc.getChambreList().forEach(chambre ->
        {
            chambre.setBloc(newBloc);
            chambreRepository.save(chambre);
        });
        return newBloc;
    }
}
