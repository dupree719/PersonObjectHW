package personobject;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Kevin", "Samuels");
        Person person2 = new Person("LeBron", "James");
        Person person3 = new Person("Bruce", "Lee");


        Person[] arrayFLName = {person1, person2, person3};
        PersonHandler allPersons = new PersonHandler(arrayFLName);

        System.out.println(allPersons.whileLoop());
        System.out.println(allPersons.forLoop());
        System.out.println(allPersons.forEachLoop());
    }
}
