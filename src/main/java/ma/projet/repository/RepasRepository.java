package ma.projet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.projet.entity.Repas;

public interface RepasRepository extends JpaRepository<Repas, Long> {

}
