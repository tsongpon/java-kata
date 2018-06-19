package io.songpon.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ArrayKataTest {

    @Test
    public void sort() {
        var kata = new ArrayKata();
        int myArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Assert.assertEquals(55, kata.sum(myArray));
    }

    @Test
    public void removeDup() {
        var kata = new ArrayKata();
        int myArray[] = {1, 1, 1, 4, 5, 6, 7, 8, 9, 9};
        var out = kata.removeDup(myArray);
        Arrays.stream(out).forEach(System.out::println);
    }
}