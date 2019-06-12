package ma.projet.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ma.projet.entity.TableServeur;

public interface TableServeurRepository extends JpaRepository<TableServeur, Long>{
	
	@Query("SELECT t FROM TableServeur t WHERE t.tablee.id = ?1 and t.serveur.id =?2 and t.dateFin=?3 ")
	TableServeur findTableServeur(Long table,Long serveur,Date dateFin);
}
