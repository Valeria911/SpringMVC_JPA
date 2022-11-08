package org.example.models.services;

import org.example.models.entities.Capacitacion;
import org.example.models.repositories.ICapacitacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CapacitacionService {

    @Autowired
    ICapacitacionRepository capacitacionRepository;

    public CapacitacionService(){}

    public void create(Capacitacion capacitacion){
        capacitacionRepository.save(capacitacion);
    }

    public List<Capacitacion> readAll(){
        return capacitacionRepository.findAll();
    }

    public Optional<Capacitacion> readOne(Long idCapacitacion){
        return capacitacionRepository.findById(idCapacitacion);
    }

    public void update(Capacitacion capacitacion){
        capacitacionRepository.save(capacitacion);
    }

    public void delete(Long idCapacitacion){
        capacitacionRepository.deleteById(idCapacitacion);
    }

/*    @Autowired
    CapacitacionDAOImpl capacitacionDAO;

    public void create(Capacitacion capacitacion){
        capacitacionDAO.create(capacitacion);
    }

    public List<Capacitacion> readAll(){
        return capacitacionDAO.readAll();
    }

    public Capacitacion readOne(Long idCapacitacion){
        return capacitacionDAO.readOne(idCapacitacion);
    }

    public void update(Capacitacion capacitacion){
        capacitacionDAO.update(capacitacion);
    }

    public void delete(Long idCapacitacion){
        capacitacionDAO.delete(idCapacitacion);
    }*/
}
