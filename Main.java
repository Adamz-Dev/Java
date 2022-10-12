public class Main {

   int variableInGlobalScope = 23;

    public static void main(String[] args){
       //trying it here
       /*
       more comments here
       */

       System.out.println("Hello World!");
       testVariables();
       testVariables();
    }


    /*
     This piece of code is to test variables
    */
    public static void testVariables(){
       int sampleInt = 20;
       double sampleDouble = 0.50;
       float sampleFloat = 40f;
       String name = "Ahedor Bright";

       //casting in java
       double doubleCasted = sampleInt; //this will do a double
       int intCasted = (int) sampleDouble; // returns to an int
       //int impossibleTask = (int) name;
       String veryPossible = String.valueOf(sampleDouble);
    }


}