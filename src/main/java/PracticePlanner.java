public class PracticePlanner {
    /*
       Welcome to your first programming assignment!
       Even though you are in the beginning of your programming journey,
       if you put it time and effort you can become a real expert.
       Have you ever heard of the 10000 hour rule?
       ------------------------------------------------------------
       10000 hour rule
       -------------------------------------------------------------
       The 10000 hour rule states that you can become an expert in any
       skill if you practise intensely in the correct way in 10000 hours.
       (From Malcolm Gladwell's blockbuster book "Outliers")

       In this exercise you will make a program to calculate
       how long it will take you to get 10000 hours of programming practise.
       First thing you need to decide how long you want to practise per day.
       Scroll down to in STEP 1:
       */

    /**
     * This is the Main method,
     * Uncomment the lines of code for each method you implement
     * to test your solution
     * Experiment with entering your own attributes
     */
    public static void main(String[] args) {
        //System.out.println("MinuteToHourConverter: " + minuteToHourConverter( 15)+" hours");
        //System.out.println("MinutePerDayToHoursPerYearConverter: "+ minutePerDayToHoursPerYearConverter(45)+" hours per year");
        //System.out.println("YearsBeforeMasteryCalculator: "+yearsBeforeMasteryCalculator(45)+" years");
        //System.out.println("HoursOfPracticePerDayCalculator: "+hoursOfPracticePerDayCalculator()+" hours");
        //System.out.println("PracticeTimeCalculator: "+practiceTimeCalculator()+" hours");
    }

    /**
     *  STEP 1:
     *     Create a method that takes in the amount of minutes you want to practise a day
     *     and returns this number converted to hours.
     *     Example: If we input 15 minutes the method returns 0.25 hours
     * @param minutes  whole number of minutes
     * @return  decimal number of hours
     * Points: 2
     * New skills: operations with primitive types
     * Difficulty: 1
     */
    public static double minuteToHourConverter(int minutes){
        // implement the method here

        return 0.0;
    }

    /**
     * STEP 2:
     * Make a method that calculates how many programming hours you can gain in a year (365 days)
     * If you practise a given amount of minutes per day.
     * (Do not substract hollidays and weekends, this is a rough estimate)
     * Please, round up your answer to two decimal places.
     * Just like in general math, 1.5 needs to be rounded up to 2, 1.3 needs to be rounded down to 1
     * Example: if we input 60 minutes the method returns 365.00 hours a year
     * @param minutes whole number of minutes
     * @return hours decimal number
     * Points: 2
     * New skills: rounding up variables
     * Difficulty:2
     */

    public static double minutePerDayToHoursPerYearConverter(int minutes){
        // Implement the code here ...

        return 0.0;
    }
    /**
     * STEP 3:
     * Make a method that calculates how many years you need to get to 10000 hours
     * of practise, while practising the amount of minutes you choose per day
     * For example how many years does it take to get to 10000 hours by practising 45 minutes a day?
     * Please, provide the answer as a whole number rounded up to two 2 decimals
     * Example: If we input practising time 45 minutes the method returns 37 years
     * @param minutes whole number of minutes
     * @return years whole number of years
     * Points: 3
     * New skills: value casting
     * Difficulty: 3
     */

    public static int yearsBeforeMasteryCalculator(int minutes){
        // Implement the code here ...

        return 0;
    }
    /**
     * STEP 4:
     *      Write a method that calculates:
     *      How many hours a day must you practise to become an expert in 20 years?
     *      We assume that all years have 365 days.
     *      Please, round up the result to 2 decimal places.
     *      Example: Running the method returns the answer in hours.
     * @return years decimal number
     * Points: 3
     * New skills: empty input
     * Difficulty: 2
     */

    public static double hoursOfPracticePerDayCalculator(){
        // Implement the code here ...

        return 0.0;
    }
    /**
     * Extra challenge :)
     * STEP 5:
     *      Make a method that calculates how much time has passed from
     *      the time you start training to the time you finish the task.
     *      The answer must be converted from milliseconds to hours with 2 decimal places.
     *      For the sake of simplicity, use: 1665378185977 as your start training time
     *      Use System.currentTimeMillis() for your task finish time
     *      Example: Running the method returns 300.25 hours
     *      Tip! System.currentTimeMillis() method returns system time in milliseconds,
     *           Be careful about choosing your variable data type.
     * @return hours decimal number
     * Points: 2
     * New skills: dealing with long numbers
     * Difficulty: 4
     */
    public static double practiceTimeCalculator(){
        long startTime = 1665378185977L;
        long finishTime = System.currentTimeMillis();
        long trainingTime = finishTime - startTime;
        long minutes = trainingTime/1000/60;
        double hours = (double)minutes/60;
        return hours;
    }
}