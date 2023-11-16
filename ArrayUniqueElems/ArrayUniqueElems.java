package ArrayUniqueElems;

import java.util.ArrayList;
import java.util.List;

public class ArrayUniqueElems {

    public static void main(String[] args) {
        long[] phoneNumbers = new long[] {+79160203040L, +79160203042L, +79160203041L, +79160203040L, +79160203041L, +79160203045L, +79160203043L};

        List<Long> uniqueNumbers = new ArrayList<>();

        for(long currentNumber:phoneNumbers) {
            boolean alreadyExists = false;
            for(Long existingNumber:uniqueNumbers) {
                if (existingNumber == currentNumber) {
                    alreadyExists = true;
                    break;
                }
            }
            if(!alreadyExists) {
                uniqueNumbers.add(currentNumber);
            }
        }

        System.out.println(uniqueNumbers);
    }
}
