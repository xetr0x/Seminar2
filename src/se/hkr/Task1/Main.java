package se.hkr.Task1;

import java.lang.reflect.Array;
import java.util.Objects;
import java.util.Random;

public class Main {

    ChocolatePiece[] storeChocolateObject() {
        Random random = new Random();
        ChocolatePiece[] chocolatePieces = new ChocolatePiece[24];
        for (int i = 0; i < chocolatePieces.length; i++) {
            int rndnr = random.nextInt(0, 3);
            if (rndnr == 0) {
                chocolatePieces[i] = new ChocolatePiece("star", 7);
            } else if (rndnr == 1) {
                chocolatePieces[i] = new ChocolatePiece("santa", 8);
            } else if (rndnr == 2) {
                chocolatePieces[i] = new ChocolatePiece("tree", 6);
            }
        }
        return chocolatePieces;
    }

    void openCalendar(ChocolatePiece[] pieces) {
        int i = 0;
            while (true) {
                System.out.printf("What window (day) should I open now between 1 and 24?");
                java.util.Scanner input = new java.util.Scanner(System.in);
                String answer = input.nextLine();
                try {
                    Integer.parseInt(answer);
                } catch (Exception e) {
                    System.out.println("Try again! but without those chars dumbass!");
                    continue;
                }
                int nr = Integer.parseInt(answer);
                if (nr < 1 | nr > 24) {
                    System.out.println("This isnt between 1 and 24 motherfucker!");
                    continue;
                }

                ChocolatePiece piece = pieces[nr - 1];
                if (!piece.IsEaten()){
                    piece.setEaten(true);
                    System.out.println("The window"+ nr +"has been open, the weight is:" + piece.getWeight() + "   and the form" +
                            "is: " + piece.getShape());
                    i++;
                }
                else {
                    System.out.println("its already been eaten!");
                }
                if (i == 24){
                    break;
                }
            }
    }

    public static void main(String[] args) {
        Main d = new Main();
        d.openCalendar(d.storeChocolateObject());
    }


}



