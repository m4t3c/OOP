package exercises.oop.phonebook;

import java.util.Arrays;

public class PhoneBookArray implements PhoneBook {
    private final Person[] phoneBook;

    public PhoneBookArray() {
        this.phoneBook = new Person[MAX_PERSON];
    }

    @Override
    public boolean addPerson(Person p) {
        //controllo se questa persona c'è già nell'array
        for (int i = 0; i < phoneBook.length; i++){
            if (phoneBook[i] != null && phoneBook[i].equals((p))){
                return false;
            }
        }

        //controllo se c'è posto nell'array per aggiungere la persona
        for (int i = 0; i < phoneBook.length; i++){
            if (phoneBook[i] == null){
                phoneBook[i] = p;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean removePerson(Person p) {
        //cerco la persona nell'array
        for (int i = 0; i < phoneBook.length; i++){
            if(phoneBook[i] != null && phoneBook[i].equals(p)){
                phoneBook[i] = null;
                return  true;
            }
        }
        return false;
    }

    @Override
    public Person[] searchByLastname(String lastname) {
        //Creo un array che abbia al suo interno tutte le persone con il congome cercato
        Person[] ris = new Person[MAX_PERSON];
        int pos = 0;
        for(int i = 0; i < phoneBook.length; i++){
            if(phoneBook[i] != null && phoneBook[i].getLastname().equals(lastname)){
                ris[pos] = phoneBook[i];
                pos++;
            }
        }
        //pos sarà la dimensione dell'array perchè ogni volta
        //che troviamo una persona con il cognome cercato incrementa
        return Arrays.copyOf(ris, pos);
    }

    @Override
    public Person[] searchByNameAndLastname(String name, String lastname) {
        Person[] ris = new Person[MAX_PERSON];
        int pos = 0;
        for(int i = 0; i < phoneBook.length; i++){
            if(phoneBook[i] != null && phoneBook[i].getLastname().equals(lastname) && phoneBook[i].getName().equals(name)){
                ris[pos] = phoneBook[i];
                pos++;
            }
        }
        return Arrays.copyOf(ris, pos);
    }

}
