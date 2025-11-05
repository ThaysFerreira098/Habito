package com.info.habito.repository;
import com.info.habito.model.Habito;
import com.info.habito.model.HabitoDiario;
import org.springframework.data.jpa.repository.JpaRepository;
public interface  HabitoRepository extends JpaRepository<Habito, Integer> {
public interface HabitoDiarioRepository extends JpaRepository<HabitoDiario ,Integer >
}