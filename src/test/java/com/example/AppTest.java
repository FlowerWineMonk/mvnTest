package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.google.gson.Gson;

public class AppTest {

    @Test
    public void testPersonFields() {
        Person person = new Person("Alice", 25);
        assertEquals("Alice", person.name);
        assertEquals(25, person.age);
    }

    @Test
    public void testGsonSerialization() {
        Person person = new Person("Alice", 25);
        Gson gson = new Gson();
        String json = gson.toJson(person);
        assertEquals("{\"name\":\"Alice\",\"age\":25}", json);
    }
}
