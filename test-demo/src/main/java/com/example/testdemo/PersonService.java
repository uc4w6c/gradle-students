package com.example.testdemo;

import org.springframework.stereotype.Service;

@Service
public class PersonService {
  public String getName() {
    throw new RuntimeException();
    // return "Taro";
  }
}
