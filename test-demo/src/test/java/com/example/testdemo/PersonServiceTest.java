package com.example.testdemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonServiceTest {
  @Test
  void 名前を取得() {
    String actual = new PersonService().getName();
    assertEquals("hanako", actual);
  }
}
