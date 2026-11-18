package com.sepso.veterinaria.repository;

import com.sepso.veterinaria.model.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MascotaRepository  extends JpaRepository <Mascota, Integer> {
}
