public class Convert_test {
    public static void main(String[] args) {
        PersonFactory personFactory = new PersonFactory();

        // Create a Rural person
        IPerson ruralPerson = personFactory.getPerson(PersonType.Rural);
        System.out.println("Rural Person: " + ruralPerson.getName());

        // Create an Urban person
        IPerson urbanPerson = personFactory.getPerson(PersonType.Urban);
        System.out.println("Urban Person: " + urbanPerson.getName());
    }
}