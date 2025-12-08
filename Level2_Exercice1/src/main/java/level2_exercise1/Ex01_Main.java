package level2_exercise1;

public class Ex01_Main
{
    public static void main( String[] args ) {

        Person person = new Person("Frodo", "Bolson",33);
        GenericMethods genericMethods = new GenericMethods();

        System.out.println("Case 1: three different types (Person, String, Integer)");
        genericMethods.genericMethods(person, "Gandalf", 10);

        System.out.println("Case 2: with a different order (Character, Boolean, Integer)");
        genericMethods.genericMethods('A', true, 46);

    }
}
