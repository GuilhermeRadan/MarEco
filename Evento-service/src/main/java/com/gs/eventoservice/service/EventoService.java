package com.gs.eventoservice.service;

import com.gs.eventoservice.model.Evento;
import com.gs.eventoservice.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventoService {

    private EventoRepository eventoRepository;

    @Autowired
    public EventoService(EventoRepository eventoRepository){
        this.eventoRepository = eventoRepository;
    }

    public Evento cadastrar(Evento evento){
        return eventoRepository.save(evento);
    }

    public List<Evento> listar() {
        return eventoRepository.findAll();
    }
}
