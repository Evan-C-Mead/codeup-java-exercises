public class Person {

    private String name;

    public Person(String personName) {
        this.name = personName;
    }

    //TODO: return the person's name
    public String getName() {
        return this.name;
    }

    //TODO: change the name property to the passed value
    public void setName(String name) {
        this.name = name;
    }

    //TODO: print a message to the console using the person's name
    public void sayHello() {
        System.out.printf("Hello, %s\n", name);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Dude");
        System.out.println(person1.name);
        person1.sayHello();

//        Person person2 = new Person("John");
//        Person person3 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person2 == person3);
//
//        Person person4 = new Person("Mark");
//        Person person5 = person4;
//        System.out.println(person4 == person5);
//
//        Person person6 = new Person("John");
//        Person person7 = person6;
//        System.out.println(person6.getName());
//        System.out.println(person7.getName());
//        person7.setName("Jane");
//        System.out.println(person6.getName());
//        System.out.println(person6);
//        System.out.println(person7.getName());
//        System.out.println(person7);
    }

}
