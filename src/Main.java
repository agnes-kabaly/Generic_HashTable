import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<String, Object> beleverem = new HashMap<>(128);
        beleverem.put("Ági", 12000);
        Integer aFaszom = 20;
        System.out.println(aFaszom.hashCode()+1);

    }


}
