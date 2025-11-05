package com.info.habito.controller;
import com.info.habito.model.Habito;
import com.info.habito.service.HabitoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/habito")
public class HabitoController {
    
    @Autowired
    HabitoService HabitoService;
  @GetMapping("/{id}")
   public ResponseEntity<Habito> localizar (@PathVariable int id) {
        return ResponseEntity.ok (HabitoService.localizar(id));
}
@GetMapping()
public ResponseEntity<List<Habito>> pesquisar() {
    return ResponseEntity.ok(HabitoService.pesquisar());
}
@PostMapping()
  public ResponseEntity<Habito> salvar (@RequestBody Habito habito) {
      return ResponseEntity.ok(HabitoService.salvar (habito));
}
@DeleteMapping("/{id}")
public ResponseEntity<String> excluir (@PathVariable int id) {
try {
    HabitoService.excluir(id);
    return ResponseEntity.ok("Habito " + id + " excluido!");
} catch (Exception e) {
    return ResponseEntity.ok("Erro ao excluir o Habito " + id +
                ": " + e.getMessage());
        }
    }
}
