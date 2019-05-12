package ma.projet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.projet.entity.Commande;

public interface CommandeRepository extends JpaRepository<Commande, Long>{

}
