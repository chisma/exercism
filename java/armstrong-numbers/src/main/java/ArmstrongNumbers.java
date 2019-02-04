import java.math.BigInteger;
import java.util.Arrays;

class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {


        String numberAsString = String.valueOf(numberToCheck);
        System.out.println(numberAsString);
        String[] array = numberAsString.split("");
        int length = numberAsString.length();
        int sum = 0;
        sum = Arrays.stream(array).mapToInt(digit -> (int) Math.pow(Integer.valueOf(digit), length)).sum();
        if (sum == numberToCheck || length == 1) {
            return true;
        } else {
            return false;
        }


    }
}

        /*Arrays.stream(array).forEach(digit -> {

             sum += (int)Math.pow(Integer.valueOf(digit), length));
            if (sum == numberToCheck || length == 1) {
                return true;
            } else
                return false;

        });*/


//        System.out.println(length);
//        int sum = 0;
//        for (int i = 0; i < length; i++) {
//            sum += Math.pow(Integer.valueOf(array[i]), length);
//            System.out.println(sum);
//
//        }


