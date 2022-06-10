package org.sid.enquete.dao;

import java.util.List;

import org.sid.enquete.entities.Etude;
import org.sid.enquete.entities.Requete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource
public interface RequeteRepository extends JpaRepository<Requete, Long> {

	@Query(value = "select e from Requete e where etude_id = :x")
	public List<Requete> situationsById(@Param("x")int mc);
	
	@Query(value = "select e from Requete e")
	public List<Requete> situations();
}
