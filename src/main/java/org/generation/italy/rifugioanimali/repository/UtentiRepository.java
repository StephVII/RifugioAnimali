package org.generation.italy.rifugioanimali.repository;

import org.generation.italy.rifugioanimali.model.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtentiRepository extends JpaRepository<Utente, String> {

}
