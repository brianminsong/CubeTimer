import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class TimerRunner {
    public static void main(String[] args) {
        boolean on = true;
        Scanner ay = new Scanner(System.in);

        int threeSolve = 1;

        String s;

        int stage = 0;
        int scan = 0;
        String shuffle = "";



        while(on) {
            if(stage == 0) {
                System.out.println("Brian Song's Cube Timer :: version Alpha");
                System.out.println("What would you like to do?");
                System.out.println("1 - Time 3x3\n2 - See times\n3 - Save and quit application");
                scan = ay.nextInt();
                if(scan == 1) {
                    stage = 1;
                }
                if(scan == 3) {
                    on = false;
                }

                ay.nextLine();
            }

            if(stage == 1) {
                System.out.println("press enter to start, and then enter to finish. Type in any character and press enter to return to the main menu");
                ThreeByThree three = new ThreeByThree(threeSolve);
                Shuffles shuf = new Shuffles();
                shuf.ThreeByThreeShuffle();
                System.out.print(shuf.toString());
                s = ay.nextLine();
                if(s.length() == 0) {
                    double time = timer();
                    System.out.println(time + "\n");
                    three.setStuff(shuf.toString(), time);
                    //Times.add(three.getSolveNo() + shuf.toString() + elapsedTime);
                    threeSolve++;

                }
                if(s.length() > 0) {
                    System.out.println("");
                    stage = 0;
                }
            }
        }



    }
    public static double timer() {
        Scanner ay = new Scanner(System.in);
        String s = "";
        long tStart = System.currentTimeMillis();
        System.out.print("Timing");
        s = ay.nextLine();
        long tEnd = System.currentTimeMillis();
        long tDelta = tEnd - tStart;
        double elapsedTime = tDelta/1000.0;
        return elapsedTime;
    }

}
