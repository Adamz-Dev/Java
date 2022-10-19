public class TryingMethod {
    public static void main( String[] args){ 
        int sum = add();
        System.out.println(sum);

        authentication("Aamu", "admin1234" );
    }

    // Days of the week

    public static String daysOfWeek(int day) {
        switch(day) {
        case 1 :
            return "Monday";
        case 2 :
            return "Tuesday";
        case 3 :
            return "Wednesday";
        case 4 :
            return "Thursday";
        case 5 :
            return "Friday";
        default: 
         return "put the correct Number of day";
       
        }
    }

     // Authentication
     
     public static void authentication(String userName, String password) {

        if (userName == "Adamu" & password == "admin1234" ){
    
            System.out.println("Authentication success");
    
         }else if (userName == "uchechi" & password == "uchechi1234") {
    
            System.out.println(" Authentication success");

         }else System.out.println("Wrong password or username!");

    }

    // add numbers

    public static int add() {
        int result = 0;
        int i=1;
        while (i<1000) {
            result += i;
            i++;
        }
        return result;
    }
    // Even numbers

    public static void evenNumbers() {
        int sumOfEven = 0;
        for (int i=12; i<103; i++) {
            if (i%2 == 0) { 
                sumOfEven += i;
            } else ;
        }
        System.out.println(sumOfEven);
    }
}
