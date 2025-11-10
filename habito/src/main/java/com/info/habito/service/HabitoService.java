package com.info.habito.service;
import com.info.habito.model.Habito;
import com.info.habito.repository.HabitoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabitoService {
    @Autowired
 HabitoRepository habitoRepository;

 public Habito localizar(int id){
 Optional<Habito> habitoBusca = habitoRepository.findById(id);
 if (habitoBusca.isPresent()) {
 return habitoBusca.get();
 } else {
 return null;
 }
 }

 public Habito salvar(Habito habito) {
 return habitoRepository.save(habito);
 }

 
}
