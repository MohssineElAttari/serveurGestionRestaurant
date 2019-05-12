package ma.projet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.projet.entity.CommandeClient;

public interface CommandeClientRepository extends JpaRepository<CommandeClient, Long>{

}
