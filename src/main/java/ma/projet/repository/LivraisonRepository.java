package ma.projet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.projet.entity.Livraison;

public interface LivraisonRepository extends JpaRepository<Livraison, Long>{

}
