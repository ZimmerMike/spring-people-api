package services;

import models.Persona;

import java.util.List;

public interface PeopleService {
  List<Persona> getAllPeople();

  Persona getPersonById(String _id);

  Persona createPerson(Persona person);

  Persona updatePerson(String _id, Persona person);

  void deletePerson(String _id);
}