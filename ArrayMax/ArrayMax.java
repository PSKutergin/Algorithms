package ArrayMax;
// Поиск максимального значения в массиве
public class ArrayMax {
    public static void main(String[] args) {
        int[] ages = {10, 6, 15, 93, 42, 7, 32};
        
        // Поиск максимума через сортировку массива
        /* Arrays.sort(ages);
        int maxAge = ages[ages.length - 1]; */

        // Поиск максимума через сравнение каждого элемента массива
        int maxAge = 0;
        for(int i = 0; i < ages.length; i++) {
            maxAge = Math.max(maxAge, ages[i]);
        }

        System.out.println(maxAge);
    }
}