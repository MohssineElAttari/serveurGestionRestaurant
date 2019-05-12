package ma.projet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.projet.entity.Administrateur;

public interface AdministrateurRepository extends JpaRepository<Administrateur, Long>{

}
