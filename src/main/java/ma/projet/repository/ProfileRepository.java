package ma.projet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.projet.entity.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Long>{

}
