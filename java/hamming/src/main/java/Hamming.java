class  Hamming {

    String leftStrand;
    String rightStrand;

    Hamming(String leftStrand, String rightStrand) throws IllegalArgumentException{
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
        if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
        getHammingDistance();

    }

    int getHammingDistance() {

        int hammingDistance = 0;

        if (leftStrand.length() == 0 && rightStrand.length() == 0) {
            return hammingDistance;
        }
        leftStrand.toUpperCase();
        rightStrand.toUpperCase();


        for (int i = 0; i < leftStrand.length(); i++) {
            if (leftStrand.charAt(i) != (rightStrand.charAt(i))) {
                    hammingDistance++;
                }

        }
        return hammingDistance;

    }
}


