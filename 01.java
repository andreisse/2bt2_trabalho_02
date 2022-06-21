package Trabalhos_poo.trabalho_02;

public class App {
    public static void main(String[] args) {
        PersonDAO pDao = new PersonDAO();
        int iP1 = 1;
        String nP1 = "Lúcia";
        Person person1 = new Person(iP1, nP1);
        pDao.addPerson(person1);
        int iP2 = 2;
        String nP2 = "Fabio";
        Person person2 = new Person(iP2, nP2);
        pDao.addPerson(person2);
        int iP3 = 3;
        String nP3 = "Fabrício";
        Person person3 = new Person(iP3, nP3);
        pDao.addPerson(person3);
        System.out.println(pDao.getPerson());
        pDao.deletePerson(person2);
        System.out.println(pDao.getPerson());
        pDao.getById(iP1);
        pDao.getById(iP2);
        
    }
}
