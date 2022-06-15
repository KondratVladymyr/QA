import java.util.HashMap;

public class Clients {
    public static void main(String[] args){
        HashMap<String, String> customers = new HashMap<>();
        customers.put("1","Иван Иванович Иванов");
        customers.put("2","Алексей Алексеевич Алексеев");
        customers.put("3","Михаил Михайлович Михайлов");
        customers.put("4","Петр Петрович Петров");
        customers.put("5","Егор Егорович Егоров");
        System.out.println(customers);
        String a = customers.get("1");
        System.out.println(a);
        customers.remove("3");
        System.out.println(customers);
    }
}
