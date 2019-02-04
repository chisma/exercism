

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


class RnaTranscription {

    String transcribe(String dnaStrand) {


        Map<String, String> rnaMap = new HashMap<>();

        //IntStream.range(0, dnaStrand.length()).forEach(i -> map();
        rnaMap.put("G", "C");
        rnaMap.put("C", "G");
        rnaMap.put("T", "A");
        rnaMap.put("A", "U");


        boolean willTranscribe = Arrays.stream(dnaStrand.split("")).allMatch(character->rnaMap.containsKey(character));

        if(willTranscribe){



            return Arrays.stream(dnaStrand.split("")).map(character -> rnaMap.get(character)).collect(Collectors.joining(""));

        }


        else
            throw new IllegalArgumentException("Invalid input");

    }







        //return () -> String.join(map(rnaMap, forEach(ch -> dnaStrand.split("")));



}
