public class Math {
    public static void main(String[] args) {
          Math tni = new Math();
          Math flt = new Math();
          System.out.println(tni.calc(3,2));
          System.out.println(flt.calc(6.7F,7));
    }
    public int calc(int a, int b) {
        return a + b;
    }
    public float calc(float a, int b) {
        return a + b;
    }
    //   public double calc(int a, int b) {
  //      return a + b;
  //  }
}