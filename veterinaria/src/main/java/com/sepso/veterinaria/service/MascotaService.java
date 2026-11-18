package com.sepso.veterinaria.service;

import com.sepso.veterinaria.model.Mascota;
import com.sepso.veterinaria.repository.MascotaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MascotaService {

    private final MascotaRepository mascotaRepository;

    public MascotaService(MascotaRepository mascotaRepository) {
        this.mascotaRepository = mascotaRepository;
    }

    // Traer todos
    public List<Mascota> traerTodos() {
        return mascotaRepository.findAll();
    }

    // TRAER UNO
    public Optional<Mascota> traerUno(int id) {
        return mascotaRepository.findById(id);
    }

    //GUARDAR
    public Mascota  guardar (Mascota mascota){
        return mascotaRepository.save(mascota);
    }
}