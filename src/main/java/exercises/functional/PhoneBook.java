package exercises.functional;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class PhoneBook {
    final List<Person> people;

    public static class Person {
        String name;
        String lastname;
        String phone;

        public Person(String name, String lastname, String phone) {
            this.name = name;
            this.lastname = lastname;
            this.phone = phone;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (this == null || getClass() != o.getClass()) {
                return false;
            }

            Person person = (Person) o;
            return Objects.equals(getName(), person.getName()) && Objects.equals(getLastname(), person.getLastname()) && Objects.equals(getPhone(), person.getPhone());
        }
    }

    public PhoneBook(List<Person> people) {
        this.people = people;
    }

    public Optional<Person> searchByLastname(String lastname) {
        for (Person p : people) {
            if (p.getLastname().equals(lastname)) {
                return Optional.of(p);
            }
        }
        return Optional.empty();
    }
    public Optional<Person> searchByNameAndLastname(String name, String lastname){
        for (Person p : people) {
            if (p.getName().equals(name) && p.getLastname().equals(lastname)) {
                return Optional.of(p);
            }
        }
        return Optional.empty();
    }
}
