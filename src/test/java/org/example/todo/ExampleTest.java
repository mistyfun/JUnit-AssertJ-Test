package org.example.todo;

import org.assertj.core.data.Index;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;


public class ExampleTest {

    @Test
    public void testString() {
        String s = "Hello, world!";
        assertThat(s).startsWith("Hello");
        assertThat(s).contains("world");
        assertThat(s).endsWith("!");
        assertThat(s).hasSize(13);
    }
    @Test
    public void testSet(){
        Set<Integer> set = new HashSet<>();
        set.add(2);
        set.add(1);
        set.add(3);
        set.add(2);
        assertThat(set.size()).isEqualTo(3);
        assertThat(set).contains(3);
        assertThat(set).containsAll(set);
        assertThat(set).containsOnlyOnce(2);
    }

    @Test
    public void testArray(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(4);
        assertThat(arrayList.size()).isEqualTo(5);
        assertThat(arrayList).contains(3);
        assertThat(arrayList).contains(1, Index.atIndex(0));
        assertThat(arrayList).containsOnlyOnce(1);
    }
}
