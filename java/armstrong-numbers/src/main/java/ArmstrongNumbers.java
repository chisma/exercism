import java.util.Arrays;

class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {


        String numberAsString = String.valueOf(numberToCheck);
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
