package ArrayShift;

public class ArrayShift {
    int[] array = new int[] {15,23,20,5,15,20,15,20};
    int removeDuplicates( int[] array) {
        int length = array.length;
        int i = 0;

        while(i < length) {
            boolean found = false;
            for(int j = i + 1; j < length; j++) {
                if(array[i] == array[j]) {
                    found = true;
                    break;
                }
            }
            if(!found) {
                i++;
                continue;
            }
            else {
                for(int j = i + 1; j < length; j++) {
                    array[j - 1] = array[j];
                }
                length--;
            }
        };
        return length;
    }
}