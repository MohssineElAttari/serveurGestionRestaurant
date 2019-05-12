package ma.projet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.projet.entity.Table;

public interface TableRepository extends JpaRepository<Table, Long>{

}
