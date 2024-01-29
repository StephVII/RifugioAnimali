package org.generation.italy.rifugioanimali.repository;

import org.generation.italy.rifugioanimali.model.Sede;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SediRepository extends JpaRepository<Sede, String> {

}
