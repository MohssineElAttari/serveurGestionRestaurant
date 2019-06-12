package ma.projet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.projet.entity.Images;

public interface ImageRepository extends JpaRepository<Images, Long>{

}
