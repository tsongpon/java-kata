package io.songpon.array;

import java.util.Arrays;

public class ArrayKata {

    public int sum(int myArray[]) {
        return Arrays.stream(myArray).sum();
    }


    public int[]  removeDup(int in[]) {
        return Arrays.stream(in).distinct().toArray();
    }

}
