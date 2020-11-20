package edu.bsu.cs224;

public class Main {

    public static void main(String[] args){
            Tour myTour = new Tour(8,8);
            myTour.findSolutions();
            System.out.println("# of Solutions: "+myTour.getSolutions());

    }
}
