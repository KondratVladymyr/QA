import java.util.ArrayList;

public class Arr {

    public static void main(String[] args) {
        String str = "three";
        ArrayList<String> strList = new ArrayList<>();
        strList.add("one");
        strList.add(str);
        System.out.println(list("three", strList));
        System.out.println(list("one", strList));
        System.out.println(list("fff", strList));
        System.out.println(list(str, strList));
    }
    static boolean list(String a, ArrayList<String> strList) {
        for (String str : strList) {
            if (str.equals(a))
                return true;
        }
        return false;
    }
}



