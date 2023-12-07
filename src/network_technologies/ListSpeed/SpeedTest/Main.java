package network_technologies.ListSpeed.SpeedTest;

import java.util.List;

public class Main {

    public static void main(String[] args) {



        System.out.println("Average time 100 elements ArrayList :" + speedAvgNanoTime(new SpeedMeterArrayList(100).checkOfSpeedStart()));
        System.out.println("Average time 2000 elements ArrayList :" + speedAvgNanoTime(new SpeedMeterArrayList(2000).checkOfSpeedStart()));
        System.out.println("Average time 5000 elements ArrayList :" + speedAvgNanoTime(new SpeedMeterArrayList(5000).checkOfSpeedStart()));

        System.out.println("Average time 100 elements LinkedList :" + speedAvgNanoTime(new SpeedMeterLinkedList(100).checkOfSpeedStart()));
        System.out.println("Average time 2000 elements LinkedList :" + speedAvgNanoTime(new SpeedMeterLinkedList(2000).checkOfSpeedStart()));
        System.out.println("Average time 5000 elements LinkedList :" + speedAvgNanoTime(new SpeedMeterLinkedList(5000).checkOfSpeedStart()));

        System.out.println("Average time 100 elements Stack :" + speedAvgNanoTime(new SpeedMeterStack(100).checkOfSpeedStart()));
        System.out.println("Average time 2000 elements Stack :" + speedAvgNanoTime(new SpeedMeterStack(2000).checkOfSpeedStart()));
        System.out.println("Average time 5000 elements Stack :" + speedAvgNanoTime(new SpeedMeterStack(5000).checkOfSpeedStart()));

        System.out.println("Average time 100 elements ArrayDeque :" + speedAvgNanoTime(new SpeedMeterArrayDeque(100).checkOfSpeedStart()));
        System.out.println("Average time 2000 elements ArrayDeque :" + speedAvgNanoTime(new SpeedMeterArrayDeque(2000).checkOfSpeedStart()));
        System.out.println("Average time 5000 elements ArrayDeque :" + speedAvgNanoTime(new SpeedMeterArrayDeque(5000).checkOfSpeedStart()));
    }

    public static long speedAvgNanoTime (List<Long> listOfNanoTimes) {

        long sumOfNano = 0;

        for (int i = 0; i < listOfNanoTimes.size(); i++) {
            sumOfNano = (sumOfNano + listOfNanoTimes.get(i))/listOfNanoTimes.size();
        }
        return sumOfNano;
    }

}
