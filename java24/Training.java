public class Training {
    public static void main(String []args) {
        Dog d = new Dog();
        Cat c = new Cat();
        c.cat = "Barsik";
        d.setName("Marsik");
        System.out.print(c.cat);
        System.out.print(" ");
        c.run();
        System.out.print(" ");
        c.makeSound();
        System.out.print(d.getName());
        System.out.print(" ");
        d.run();
        System.out.print(" ");
        d.makeSound();
    }
}
