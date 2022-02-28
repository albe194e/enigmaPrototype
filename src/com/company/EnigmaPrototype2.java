package com.company;

public class EnigmaPrototype2 {

    char[] bogstaver = {' ','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','Æ','Ø','Å'};

    int[] bogstavTilTal(char[] bogstav){
        int[] tal = new int[30];
        for (int i = 0; i < bogstav.length; i++) {
            tal[i] = i;
        }
        return tal;
    }
    char[] talTilBogstav(int[] tal) {
        char[] nyeBogstaver = new char[30];
        for (int i = 0; i < tal.length; i++) {
            nyeBogstaver[i] = bogstaver[i];
        }
        return nyeBogstaver;
    }
        void runProgram () {
            talTilBogstav(bogstavTilTal(bogstaver));
        }
        public static void main (String[]args){
            new EnigmaPrototype2().runProgram();
        }
}