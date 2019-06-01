package ma.projet.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ma.projet.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{
	@Query("select c from Client c  where c.id=:x") 
    public Page<Client> listClients(@Param("x")Long codeCte,Pageable page);
}
