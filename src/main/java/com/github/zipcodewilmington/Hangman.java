package com.github.zipcodewilmington;
//Isiah Armstrong

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author xt0fer
 * @version 1.0.0
 * @date 5/27/21 11:02 AM
 */
public class Hangman {

    public static void main(String[] args){

        runGame();
        WordGuess();


    }

    public static void runGame() {
        System.out.println("Let's play Hangman!");
        Scanner scanner = new Scanner(System.in);
    }
    public static void WordGuess(char s){
       String words = Arrays.toString(new String[]{"cat", "dog", "bog", "cut"});
       char[] array = words.toCharArray();
        System.out.println(array[6]);
        int randomNum = array.length - 1;

    }


}
