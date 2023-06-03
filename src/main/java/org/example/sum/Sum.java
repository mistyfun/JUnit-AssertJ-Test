package org.example.sum;

import java.util.List;

public class Sum {
    public static int sumList(List<Integer> input) throws IllegalArgumentException {
        if (input == null){
            throw new IllegalArgumentException("List cannot be null");
        }
        if (input.isEmpty()){
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < input.size(); i++){
            sum = sum+ input.get(i);
        }
        return sum;
    }
}
