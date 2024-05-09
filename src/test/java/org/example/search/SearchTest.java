package org.example.search;

import org.example.sum.Sum;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class SearchTest {

    @Test
    public void throws_IllegalArgumentException_when_list_is_null(){
        List<Integer> numbers = null;
        assertThatThrownBy(() -> Search.findLargest(numbers))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("List cannot be null");
    }

    @Test
    public void find_largest_number_for_a_list_of_one_number(){
        List<Integer> numbers = List.of(9);
        assertThat(Search.findLargest(numbers)).isEqualTo(9);
    }
    @Test
    public void find_index_of_the_smallest_number(){
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7); //2 = index 1
        assertThat(Search.indexOfSmallestNumber2(numbers)).isEqualTo(0);
    }
}
