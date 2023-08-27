package services;

import models.Persona;
import repositories.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeopleServiceImpl implements PeopleService {
  private final PeopleRepository peopleRepository;

  @Autowired
  public PeopleServiceImpl(PeopleRepository peopleRepository) {
    this.peopleRepository = peopleRepository;
  }

  @Override
  public List<Persona> getAllPeople() {
    return peopleRepository.findAll();
  }

  @Override
  public Persona getPersonById(String _id) {
    return peopleRepository.findById(_id).orElse(null);
  }

  @Override
  public Persona createPerson(Persona person) {
    return peopleRepository.save(person);
  }

  @Override
  public Persona updatePerson(String _id, Persona person) {
    Persona existingPerson = peopleRepository.findById(_id).orElse(null);
    if (existingPerson == null) {
      return null;
    }

    return peopleRepository.save(existingPerson);
  }

  @Override
  public void deletePerson(String _id) {
    peopleRepository.deleteById(_id);
  }
}