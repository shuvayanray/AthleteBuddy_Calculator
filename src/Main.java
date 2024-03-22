/*This java project is used to calculate speed, cadence and target heart rate zone. Number of steps
taken, step-length, activity time, age, resting heart-rate, low-end and high-end heartrate zone are
taken as inputs from the athlete. */

import java.util.*;
public class Main {
    public static void main(String[] args) {
        int steps, time, age, rhr, cadence;
        float steplength;
        double hrr, min, max, hrmax;
        double speed, newspeed;
        double lowendzone, highendzone;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of steps taken:");
        steps = sc.nextInt();
        System.out.print("Enter step length in m:");
        steplength = sc.nextFloat();
        System.out.print("Enter activity time in min:");
        time = sc.nextInt();
        System.out.print("Enter your age:");
        age = sc.nextInt();
        System.out.print("Enter your resting heart rate:");
        rhr = sc.nextInt();
        System.out.print("Enter low-end heart rate zone %:");
        lowendzone = sc.nextDouble();
        System.out.print("Enter high-end heart rate zone %:");
        highendzone = sc.nextDouble();

        {
            speed = (steps * steplength) / time;
            cadence = steps / time;
            hrmax = 206.9 - (0.67 * age);
            hrr = (hrmax - rhr);
            min = hrr * (lowendzone / 100) + rhr;
            max = hrr * (highendzone / 100) + rhr;
            newspeed = (speed / 16.667);
        }


        System.out.println("Your speed is:" + " " + newspeed + " " + "km/h");
        System.out.println("Your cadence is:" + " " + cadence + " " + "steps per min");
        System.out.println("Your target heart rate zone is between" + " " + min + " "+"to"+" "+ max+" "+"BPM");

    }
}
