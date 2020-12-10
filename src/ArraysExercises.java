import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {

//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
//        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];
        people[0] = new Person("Frank");
        people[1] = new Person("Jake");
        people[2] = new Person("Mike");
//        Person newPerson1 = new Person("Alex");
//        people = addPersons(people, newPerson1);
//        Person newPerson2 = new Person("Zak");
//        people = addPersons(people, newPerson2);
//        Person newPerson3 = new Person("Jules");
//        people = addPersons(people, newPerson3);

        for (Person peoples : people) {
            System.out.println(peoples.getName());
        }

    }

    public static Person[] addPersons(Person[] people, Person person) {
        people =  Arrays.copyOf(people, people.length + 1);
        people[people.length - 1] = person;
        return people;
    }

}
