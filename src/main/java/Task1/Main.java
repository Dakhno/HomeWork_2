package Task1;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class Main {
    static class Person {
        final int id;

        final String name;

        Person(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Person person)) return false;
            return getId() == person.getId() && getName().equals(person.getName());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getId(), getName());
        }
    }

    private static Person[] RAW_DATA = new Person[]{
            new Person(0, "Harry"),
            new Person(0, "Harry"),
            new Person(1, "Harry"),
            new Person(2, "Harry"),
            new Person(3, "Emily"),
            new Person(4, "Jack"),
            new Person(4, "Jack"),
            new Person(5, "Amelia"),
            new Person(5, "Amelia"),
            new Person(6, "Amelia"),
            new Person(7, "Amelia"),
            new Person(8, "Amelia"),
    };

    public static class Dict {
        public Map<String, Long> sortedByName(Person[] arrayPerson) {
            return Arrays.stream(arrayPerson)
                    .distinct()
                    .filter(Objects::nonNull)
                    .collect(Collectors.groupingBy(Person::getName, Collectors.counting()));
        }
    }
    private static void showDict(Map<String, Long> dictionary) {
        dictionary.forEach((key, value) -> System.out.println("Key: " + key + "\n" +
                "Value: " + value));
    }

    public static void main(String[] args) {
        Dict dict = new Dict();
        showDict(dict.sortedByName(RAW_DATA));
    }
}
