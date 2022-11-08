package org.example.models.repositories;

import org.example.models.entities.Capacitacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICapacitacionRepository extends JpaRepository<Capacitacion, Long> {
}
