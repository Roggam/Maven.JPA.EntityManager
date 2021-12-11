package services;

import entities.CD;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CDRepo extends CrudRepository<CD, Long> {
}
