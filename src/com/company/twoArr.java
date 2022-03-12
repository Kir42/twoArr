package com.company;

import ru.vsu.cs.util.ArrayUtils;


import java.io.FileNotFoundException;
import java.lang.String;

public class twoArr {

    public static void main(String[] args) throws FileNotFoundException {


        int[][] array =  ArrayUtils.readIntArray2FromFile("input.txt");

        int[][] newArr = new int[array.length][array[0].length];
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {


                    if (array[i][j] == array[i - 1][j - 1]) {
                        counter++;


                    }
                } catch (Exception e) {

                }
                try {

                    if (array[i][j] == array[i - 1][j]) {
                        counter++;

                    }
                } catch (Exception e) {

                }
                try {

                    if (array[i][j] == array[i - 1][j + 1]) {
                        counter++;

                    }
                } catch (Exception e) {

                }
                try {
                    if (array[i][j] == array[i][j - 1]) {
                        counter++;
                    }
                } catch (Exception e) {
                }
                try {
                    if (array[i][j] == array[i][j + 1]) {
                        counter++;
                    }

                } catch (Exception e) {

                }
                newArr[i][j] = counter;
                counter = 0;
            }

        }

        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr[0].length; j++) {
                System.out.println(newArr[i][j]);
            }
        }
        ArrayUtils.writeArrayToFile("output.txt",newArr,"");
    }
}






