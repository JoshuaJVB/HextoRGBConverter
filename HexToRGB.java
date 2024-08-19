package FIRSTPROJ;

import java.util.HashMap;

public class HexToRGB {
  
  public static HashMap<String, Integer> hexStringToRGB(String hex) {
    
    HashMap<String, Integer> converter = new HashMap<>();
    String holder;
    Long tester;
    String color;

    for(int i = 0; i < 6; i+=2){
      holder ="";
      tester = (long) 0;
      holder += hex.charAt(i);
      holder += hex.charAt(i+1);
      tester = Long.parseLong(holder, 16);

      if (tester < 0){
        tester = (long) 0;
      }else if (tester > 255){
        tester = (long) 255;
      }

      switch (i) {
        case 0:
          color = "r";
          break;
        case 2:
          color = "g";
          break;
        case 4:
          color = "b";
          break;
        default:
          color = "error";
          break;
      }
      converter.put(color, Math.toIntExact(tester));

    }
    // hex -> {r, g, b}
    
    return converter;
  }
  
}