package se.hkr.Task1;
import java.lang.reflect.Array;
import java.util.Random;

public class Main {

    ChocolatePiece[] storeChocolateObject() {
        ChocolatePiece[] chocolatePieces = new ChocolatePiece[24];
        Random random = new Random();
        for (int i = 0; i < chocolatePieces.length; i++) {
            int rndnr = random.nextInt(0-3);
            if (rndnr == 0) {
                chocolatePieces[i] = new ChocolatePiece("star", 7);
            }else if(rndnr == 1){
                chocolatePieces[i] = new ChocolatePiece("santa", 8);
            }else if(rndnr == 2) {
                chocolatePieces[i] = new ChocolatePiece("tree", 6);}



        }
        return chocolatePieces;
    }

    void openCalendar() {
        Boolean notDone = true;
        while (notDone == true) {
            System.out.printf("What window (day) should I open now between 1 and 24?");
            notDone = false;
            java.util.Scanner input = new java.util.Scanner(System.in);
            String answer = input.nextLine();
            try {
                Integer.parseInt(answer);
            } catch (Exception e) {
                System.out.println("Try again! but without those chars dumbass!");
                notDone = true;
            }
            int nr = Integer.parseInt(answer);
            if (nr < 1 | nr > 24) {
                notDone = true;
                System.out.println("This isnt between 1 and 24 motherfucker!");
            }
        }


    }
    public static void main(String[] args) {
        Main d = new Main();
        System.out.println(d.storeChocolateObject());
        d.openCalendar();
    }





}



