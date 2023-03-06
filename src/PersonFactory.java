import java.util.ArrayList;

public class PersonFactory {
    private ArrayList<Person> allPersons;
    public PersonFactory() {
        allPersons = new ArrayList<Person>();
    }
    public void addPerson(Person newPerson) {
        for (int i = 0;i<allPersons.size();i++) {
            if (newPerson.getLastName().compareTo(allPersons.get(i).getLastName()) <=0) {
                allPersons.add(i,newPerson);
                return;
            }
        }
        allPersons.add(0,newPerson);
    }
    public ArrayList<Person> under18() {
        ArrayList<Person> below18 = new ArrayList<Person>();
        for (int i = 0; i <allPersons.size();i++) {
            if (allPersons.get(i).getAge() < 18) {
                below18.add(allPersons.get(i));
            }
        }
        return below18;
    }
    public boolean checkLastName(String lastName) {
        for (int i = 0; i < allPersons.size();i++) {
            if (allPersons.get(i).getLastName().equals(lastName)) {
                return true;
            }
        }
        return false;
    }
}