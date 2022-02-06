package com.example.testdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class HelloController {
  private PersonService personService;

  public HelloController(PersonService personService) {
    this.personService = personService;
  }

  @GetMapping
  public String index() {
    return personService.getName();
  }
}
