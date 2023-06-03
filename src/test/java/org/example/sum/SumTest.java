package org.example.sum;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class SumTest {

    @Test
    public void throws_IllegalArgumentException_when_list_is_null(){
        List<Integer> numbers = null;
        assertThatThrownBy(() -> Sum.sumList(numbers))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("List cannot be null");
    }

    @Test
    public void returns_zero_when_list_is_empty(){
        List<Integer> numbers = List.of(); //List<Integer> numbers = new ArrayList<>();
        int sum = Sum.sumList(numbers);
        assertThat(sum).isEqualTo(0);
    }

    @Test
    public void returns_sum_when_list_is_not_empty(){
        List<Integer> numbers = List.of(1, 2, 3);
        int sum = Sum.sumList(numbers);
        assertThat(sum).isEqualTo(1+2+3);
    }

    @Test
    public void returns_sum_when_list_is_not_empty_2(){
        List<Integer> numbers = List.of(4, 5, 6);
        int sum = Sum.sumList(numbers);
        assertThat(sum).isEqualTo(4+5+6);
    }

}
