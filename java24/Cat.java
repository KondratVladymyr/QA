public class Cat extends Animal{
    String cat;
    @Override
    void makeSound() {
        System.out.println("meow!");
    }
    void run(){
        super.run();
        System.out.print(" " + "and say");
    }
}
