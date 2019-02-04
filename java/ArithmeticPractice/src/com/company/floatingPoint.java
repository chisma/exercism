package com.company;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class floatingPoint {

    public static void main(String[] args) {


        long longExample = 2L;
        display(longExample);


/*        f = f * f;
        System.out.println("float squared " + f);
        d = d * Math.sqrt(d);
        System.out.println("Double with sqrt multiplication " + d);
        bd_fromDouble = bd_fromDouble.multiply(BigDecimal.valueOf(Math.sqrt(bd_fromDouble.doubleValue())));
        display("Big decimal from double roundingMode halfUp:,2 follows") ;
        display(bd_fromDouble.setScale(2, RoundingMode.HALF_UP));
        display("Big decimal from double roundingMode halfDown:,2 follows") ;
        display(bd_fromDouble.setScale(2, RoundingMode.HALF_DOWN));

        display("Big decimal from double roundingMode halfUp,6: follows") ;

        display(bd_fromDouble.setScale(6, RoundingMode.HALF_UP));

        display("Big decimal from double roundingMode halfDown,6: follows") ;
        display(bd_fromDouble.setScale(6, RoundingMode.HALF_DOWN));
        System.out.println("big decimal(from double) with sqrt multiplication " + bd_fromDouble);

        bd_fromString = bd_fromString.multiply(BigDecimal.valueOf(Math.sqrt(bd_fromString.doubleValue())));

        display("Big decimal from string roundingMode half_up, 2 follows");
        display(bd_fromString.setScale(2, RoundingMode.HALF_UP));

        display("big decimal from string roundingMode half down,2 follows");
        display(bd_fromString.setScale(2, RoundingMode.HALF_DOWN));
        System.out.println("big decimal(from string) with sqrt multiplication "  + bd_fromString);*/





    }

    private static void display(Object objToDisplay) {
        System.out.println(objToDisplay.toString());
    }
}
