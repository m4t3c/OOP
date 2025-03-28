package exercises.oop.phonebook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBookList implements PhoneBook{
    private final ArrayList<Person> phoneBook;

    public PhoneBookList() {
        phoneBook = new ArrayList<>();
    }


    @Override
    public boolean addPerson(Person p) {
        //Controllo se questa persona è contenuta
        if(phoneBook.contains(p) || phoneBook.size() >= MAX_PERSON) {
            return false;
        }

        phoneBook.add(p);
        return true;
    }

    @Override
    public boolean removePerson(Person p) {
        if(phoneBook.contains(p)){
            phoneBook.remove(p);
            return true;
        }
        return false;
    }

    @Override
    public Person[] searchByLastname(String lastname) {
        ArrayList<Person> ris = new ArrayList<>();
        int pos = 0;
        for(Person current : phoneBook){
            if(current.getLastname().equals(lastname)){
                ris.add(current);
            }
        }

        return ris.toArray(new Person[]{});
    }

    @Override
    public Person[] searchByNameAndLastname(String name, String lastname) {
        ArrayList<Person> ris = new ArrayList<>();
        int pos = 0;
        for(Person current : phoneBook){
            if(current.getLastname().equals(lastname) && current.getName().equals(name)){
                ris.add(current);
            }
        }

        return ris.toArray(new Person[]{});
    }
}
