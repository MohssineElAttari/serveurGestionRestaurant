package ma.projet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.projet.entity.Tablee;

public interface TableRepository extends JpaRepository<Tablee, Long>{

}
