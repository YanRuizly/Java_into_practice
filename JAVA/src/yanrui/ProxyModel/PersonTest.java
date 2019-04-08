package yanrui.ProxyModel;

public class PersonTest {
    public static void main(String[] args){
        PersonService personService = new PersonService();
        Person person = new Person("yanrui");
        personService.getPerson(person.getCode());
    }
}
