package ma.projet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.projet.entity.TableReservation;

public interface TableReservationRepository extends JpaRepository<TableReservation, Long>{

}
