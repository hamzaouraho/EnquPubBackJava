package org.sid.enquete.dao;

import java.util.List;

import org.sid.enquete.entities.Etude;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource
public interface EtudeRepository extends JpaRepository<Etude, Long> {
	@Query("select e from Etude e where id = :x")
	public List<Etude> chercher(@Param("x")Long mc);
	
	@Query(value = "select e from Etude e where id = :x")
	public List<Etude> visualiser(@Param("x")Long mc);

}
