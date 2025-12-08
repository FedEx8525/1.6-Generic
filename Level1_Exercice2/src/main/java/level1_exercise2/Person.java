package level1_exercise2;

public class Person {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }
    public String getSurname() {
        return this.surname;
    }
    public int getAge() {
        return this.age;
    }

    public String toString() {
        return "[Name: " + this.getName() + " Surname: " + this.getSurname() +
                " Age: " + this.getAge() + "]";
    }


}
