package org.meruvian.yama.tot.contributtor;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContributtorRepository extends CrudRepository<Contributtor, Long> {
	Contributtor findById(long id);
	
	@Query("SELECT n FROM Contributtor n WHERE n.name LIKE %?1% ")
	List<Contributtor> findByName(String name);
}
