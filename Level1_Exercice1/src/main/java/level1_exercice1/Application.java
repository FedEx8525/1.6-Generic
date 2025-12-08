package level1_exercice1;

public class Application {
    public void start() {
        NoGenericMethods smartphone1 = new NoGenericMethods("Galaxy S", "Samsung", "Gray");
        NoGenericMethods smartphone2 = new NoGenericMethods("Apple", "IPhone",  "White");
        NoGenericMethods smartphone3 = new NoGenericMethods("Black", "Pixel 8 Pro", "Xiaomi");

        NoGenericMethods[] showroom = new NoGenericMethods[]{smartphone1, smartphone2, smartphone3};

        for (NoGenericMethods character : showroom) {
            System.out.println(character);
        }
    }
}
