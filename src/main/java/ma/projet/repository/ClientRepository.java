package ma.projet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.projet.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
