package Trabalhos_poo.trabalho_02;

import java.util.ArrayList;
import java.util.List;

public class PersonDAO {
    private Person person;
    private List<Person> people = new ArrayList<Person>();

    public void addPerson(Person person){
        people.add(person);
    }
    public void deletePeople(People people){
        person.remove(people);
    }
    public List<Person> getPeople() {
        return people;
    }
    public void getById(int idp){
        boolean find = false;
        for (Person person : people) {
            if(idp == person.getId()){
                System.out.println(person);
                find = true;
                break;
            }
        }
        if(find == false){
            System.out.println("não foi possível encontrar o Id");
        }
    }
    public PersonDAO() {
    }

}
