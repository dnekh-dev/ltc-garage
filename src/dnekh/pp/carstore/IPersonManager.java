package dnekh.pp.carstore;

import dnekh.pp.carstore.bluprintclasses.Person;

public interface IPersonManager {

    void addPerson(Person person);
    Person getPerson(String id);
    void removePerson(String id);
    void displayAllPersons();
}
