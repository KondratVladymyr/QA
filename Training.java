public class Training {
    public static void main(String []args) {
        Animal d = new Dog();
        Animal c = new Cat();
        c.cat = "Barsik";
        d.dog = "Marsik";
        System.out.print(c.cat);
        System.out.print(" ");
        c.run();
        System.out.print(" ");
        theThing(c);
        System.out.print(d.dog);
        System.out.print(" ");
        d.run();
        System.out.print(" ");
        theThing(d);
    }
    static void theThing(Animal animal) {
        animal.makeSound();
    }
}
