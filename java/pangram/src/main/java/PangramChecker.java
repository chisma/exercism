import java.util.Arrays;
import java.util.stream.Collectors;



public class PangramChecker {

    public boolean isPangram(String input) {

        //return input.replaceAll("^[aA-zZ]", "").toLowerCase().chars().collect(Collectors.toSet());

        //List<Integer> iList = Arrays.stream(input.trim().replaceAll("^[aA-zZ]","").toLowerCase()
          //      .split("")).map(ch -> Integer.valueOf(ch))
            //    .distinct().collect(Collectors.toList());
        if(input.equals(""))
            return false;


        String input1 = "\"Five quacking Zephyrs jolt my wax bed.\"";

        //String result = input1.replaceAll("^\"|\"💲", "");


        String result = Arrays.stream(input
                 .trim()
                 .replaceAll("[^A-Za-z]+", "")
                 .toLowerCase()
                 .split("")).distinct().sorted().collect(Collectors.joining()).toString();


        System.out.println(result);
        return result.equals("abcdefghijklmnopqrstuvwxyz")?true:false;





    }



}
