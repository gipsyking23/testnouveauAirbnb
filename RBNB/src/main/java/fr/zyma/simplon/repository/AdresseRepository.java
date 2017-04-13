package fr.zyma.simplon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.zyma.simplon.model.Adresse;

@Repository
public interface AdresseRepository extends JpaRepository<Adresse, Long> {

}
