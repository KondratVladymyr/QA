public class Main {
    public static void main(String[] args) {
        IElement w = new Wind();
        IElement r = new River();
        identifyElement(w);
        identifyElement(r);
    }
   public static void identifyElement(IElement a) {
     System.out.println(a.getElementName());
    }
}
