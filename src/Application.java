class Person {

    //instance variables
    String name;
    int age;

    //class creates an Object Type
    //classes contain
    //1. Data
    //2. Subroutines (methods)

}

/**
 * Created by LordwolF on 7/31/2016.
 */
public class Application {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.name = "LordwolF76"; person1.age = 40;

        Person person2 = new Person();
        person2.name = "PerfectingSilence"; person2.age = 16;

        System.out.println(person1.name + "  " + person1.age);
        System.out.println(person2.name + "  " + person2.age);
    }
}
