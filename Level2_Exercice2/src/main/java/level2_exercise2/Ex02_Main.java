package level2_exercise2;

public class Ex02_Main {
    public static void main( String[] args ) {

        Person person = new Person("Frodo", "Baggins",50);
        GenericMethods genericMethods = new GenericMethods();

        System.out.println("Case 1: with Person types (Person, Person, Person)");
        genericMethods.genericMethods(person,
                new Person("Sam", "Gamgee", 38),
                new Person("Mariadoc", "Brandybuck", 36),
                new Person("Peregrin", "Took", 28));

        System.out.println("Case 2: with a different type and numbers of arguments" +
                " (Character, Boolean, Integer)");
        genericMethods.genericMethods("Hobbit", "Elf","Human", "Dwarf", "Orc", "Goblin");

    }
}
