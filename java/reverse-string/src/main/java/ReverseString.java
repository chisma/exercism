class ReverseString {

    String reverse(String inputString) {


        if(inputString.equals("")) {
            return "";
        }
        String reversedString = "";


        for(int index = inputString.length() - 1; index >= 0;index--) {


            reversedString += inputString.charAt(index);


        }

        return reversedString;
    }


}