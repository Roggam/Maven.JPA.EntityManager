package services;

import entities.Artist;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistRepo extends CrudRepository<Artist, Long> {
}
