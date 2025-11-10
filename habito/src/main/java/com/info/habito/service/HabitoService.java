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

public List<Contato> pesquisar() {
 return contatoRepository.findAll();
 }

 public Habito salvar(Habito habito) {
 return habitoRepository.save(habito);
 }

 
}
