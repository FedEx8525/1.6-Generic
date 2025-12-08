package level2_exercise2;

public class GenericMethods {

    public <T> void genericMethods(T... arguments) {
        for (T argument : arguments) {
            System.out.println("[" + argument + "] ");
        };
    }
}
