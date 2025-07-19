package exercises.oop.phonebook;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * A PhoneBook implementation internally using ArrayList. Its capacity is limited to 256 persons.
 *
 * @author Matteo Coppa
 * @see PhoneBook Interface
 */
public class PhoneBookList implements PhoneBook{
    final ArrayList<Person> phoneBook;

    public PhoneBookList() {
        phoneBook = new ArrayList<>();
    }

    @Override
    public boolean addPerson(Person person) {
        if (phoneBook.contains(person) || phoneBook.size() >= MAX_PERSONS) {
            return false;
        }

        return phoneBook.add(person);
    }

    @Override
    public boolean removePerson(Person person) {
        return phoneBook.remove(person);
    }

    @Override
    public Person[] searchByLastname(String lastname) {
        ArrayList<Person> tmp = new ArrayList<>();
        for (Person p : phoneBook) {
            if (p.getLastname().equals(lastname)) {
                tmp.add(p);
            }
        }
        return tmp.toArray(new Person[]{});
    }

    @Override
    public Person[] searchByNameAndLastname(String name, String lastname) {
        ArrayList<Person> tmp = new ArrayList<>();
        for (Person p : phoneBook) {
            if (p.getLastname().equals(lastname) && p.getName().equals(name)) {
                tmp.add(p);
            }
        }
        return tmp.toArray(new Person[]{});
    }
}
