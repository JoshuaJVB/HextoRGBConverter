package FIRSTPROJ;
import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        String hex = "FFFFFF";
        HashMap<String, Integer> result;

        result = HexToRGB.hexStringToRGB(hex);
        System.out.println(result);
    }

}
