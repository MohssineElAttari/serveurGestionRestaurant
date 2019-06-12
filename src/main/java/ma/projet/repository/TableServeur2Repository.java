package ma.projet.repository;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import ma.projet.entity.TableServeur2;

@Repository
public interface TableServeur2Repository extends JpaRepository<TableServeur2, Long>{


	@Query("SELECT t FROM TableServeur2 t WHERE t.tablee = ?1 and t.serveur =?2 and t.dateFin =?3")
	TableServeur2 findTableServeur2(Long table, Long serveur, Date dateFin);

}
