package controllers;

import models.Persona;
import services.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/personas")
public class PeopleController {
  private final PeopleService peopleService;

  @Autowired
  public PeopleController(PeopleService peopleService) {
    this.peopleService = peopleService;
  }

  @GetMapping
  public List<Persona> getAllPeople() {
    return peopleService.getAllPeople();
  }

  @GetMapping("/{_id}")
  public Persona getPeopleById(@PathVariable String _id) {
    return peopleService.getPersonById(_id);
  }

  @PostMapping
  public Persona createPerson(@RequestBody Persona person) {
    return peopleService.createPerson(person);
  }

  @PutMapping("/{_id}")
  public Persona updatePerson(@PathVariable String _id, @RequestBody Persona person) {
    return peopleService.updatePerson(_id, person);
  }

  @DeleteMapping("/{id}")
  public void deletePerson(@PathVariable String _id) {
    peopleService.deletePerson(_id);
  }
}