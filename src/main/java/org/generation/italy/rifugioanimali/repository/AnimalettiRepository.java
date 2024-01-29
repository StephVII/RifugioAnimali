package org.generation.italy.rifugioanimali.repository;

import org.generation.italy.rifugioanimali.model.Animaletto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalettiRepository extends JpaRepository<Animaletto, Integer>{

}
