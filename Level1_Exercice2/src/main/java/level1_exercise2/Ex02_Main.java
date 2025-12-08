package level1_exercise2;

public class Ex02_Main {
    public static void main(String[] args) {
        Person person = new Person("Frodo", "Bolson",33);
        GenericMethods genericMethods = new GenericMethods();

        System.out.println("Case 1: three different types (Person, String, Integer)");
        genericMethods.genericMethods(person, "Gandalf", 10);

        System.out.println("Case 2: with a different order (String, Integer, Person)");
        genericMethods.genericMethods("Gimli", 117, person);

        System.out.println("Case 3: three same types (String, String, String)");
        genericMethods.genericMethods("Aragorn", "Sauron", "Legolas");

        System.out.println("Case 4: with ather types (Character, Float, Boolean)");
        genericMethods.genericMethods('A', 173.57f, false);


    }
}
