package repositories;

import models.Persona;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PeopleRepository extends MongoRepository<Persona, String> {
}