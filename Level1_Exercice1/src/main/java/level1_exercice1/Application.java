package level1_exercice1;

public class Application {
    public void start() {
        String argument1 = "Galaxy S", argument2 = "Samsung", argument3 = "Black";

        NoGenericMethods smartphone1 = new NoGenericMethods(argument1, argument2, argument3);
        NoGenericMethods smartphone2 = new NoGenericMethods(argument3, argument1,  argument2);
        NoGenericMethods smartphone3 = new NoGenericMethods(argument2, argument3, argument1);

        NoGenericMethods[] showroom = new NoGenericMethods[]{smartphone1, smartphone2, smartphone3};

        for (NoGenericMethods character : showroom) {
            System.out.println(character);
        }
    }
}
