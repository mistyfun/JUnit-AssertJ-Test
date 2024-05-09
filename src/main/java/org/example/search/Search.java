package org.example.search;

import java.util.List;

public class Search {
    public static int findLargest(List<Integer> numbers) {
        int largestNumber =-1;
        if (numbers == null) {
            throw new IllegalArgumentException("List cannot be null");
        }
        for (int i = 0; i < numbers.size(); i++) {
            int currentNumber = numbers.get(i);
            if (largestNumber < currentNumber){
                largestNumber = currentNumber;
            }
        }
        return largestNumber;
    }

    public static int findLargest2(List<Integer> numbers) {
        int largestNumber =-1;
        if (numbers == null) {
            throw new IllegalArgumentException("List cannot be null");
        }
        for (Integer currentNumber : numbers) {
            if (largestNumber < currentNumber){
                largestNumber = currentNumber;
            }
        }
        return largestNumber;
    }

    public static int indexOfSmallestNumber(List<Integer> numbers){
        int index = -1;
        int smallestNumber = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.size(); i++){
            int currentNumber = numbers.get(i);
            if (smallestNumber > currentNumber){
                smallestNumber = currentNumber;
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestNumber2(List<Integer> numbers){
        int indexOfSmallestNumber = 0;
        for (int currentIndex = 0; currentIndex < numbers.size(); currentIndex++){
            if ( numbers.get(currentIndex) < numbers.get(indexOfSmallestNumber) ){
               indexOfSmallestNumber = currentIndex;
            }
        }
        return indexOfSmallestNumber;
    }
}
