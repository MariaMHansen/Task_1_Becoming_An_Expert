import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PracticePlannerTest {
    PracticePlannerTest() {
    }
    @DisplayName("Checks minuteToHourConverter converts 15 minutes to hours.")
    @Test
    void minuteToHourConverterTest() throws Exception {
        // Test that checks if the students remembered to convert minutes to double before division
        if(PracticePlanner.minuteToHourConverter(1)==0.0){
            fail(   "\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    " METHOD: minuteToHourConverter\n" +
                    " Try to convert the minutes to a double data type\n" +
                    " before the division look at an example in the\n"+
                    " \"Introduction to Java Programming and Data Structures book\"\n" +
                    " chapter 2.15 Numeric Type Conversions\n" +
                    "-------------------------------------------------------------------------\n"
            );
        }

        Assertions.assertEquals(0.25, PracticePlanner.minuteToHourConverter(15));

    }

    @DisplayName("Checks if minutePerDayToHoursPerYearConverter converts minutes per day to hours per year.")
    @Test
    void minutePerDayToHoursPerYearConverterTest() {
        // Test that checks if the students remembered to round up the value
        if(PracticePlanner.minutePerDayToHoursPerYearConverter(55)==334.5833333333333){
            fail(   "\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    " METHOD: minutePerDayToHoursPerYearConverter\n" +
                    " You need to round up the result to two decimals, try the to google\n" +
                    " Java Math.round() method to find an example in documentation\n" +
                    " You can also find an example in the book \n"+
                    " \"Introduction to Java Programming and Data Structures book\"\n" +
                    "  chapter 4.2.3 The Rounding Methods \n" +
                    "-------------------------------------------------------------------------\n"
            );
        }
        // Test that checks if the students only rounded up to one decimal
        if(PracticePlanner.minutePerDayToHoursPerYearConverter(55)==334.6){
            fail(   "\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    " METHOD: minutePerDayToHoursPerYearConverter\n" +
                    " You are almost done, but \n" +
                    " You need to round up the result to two decimals, not one\n" +
                    "-------------------------------------------------------------------------\n"
            );
        }
        Assertions.assertEquals( 334.58, PracticePlanner.minutePerDayToHoursPerYearConverter(55));
    }

    @DisplayName("Checks if yearsBeforeMasteryCalculatorTest returns years.")
    @Test
    void yearsBeforeMasteryCalculatorTest() {
        // Test that checks if the students remembered to round up the value
        if(PracticePlanner.yearsBeforeMasteryCalculator(45)==36.529680365296805) {
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    " METHOD: yearsBeforeMasteryCalculator\n" +
                    " You need to round up the result to a whole integer\n" +
                    " Check the task description again, and try the Math.round() method\n" +
                    "-------------------------------------------------------------------------\n"
            );
        }
        // Test that checks if the students remembered to round down numbers like 126.4 to 126 not 127
        if(PracticePlanner.yearsBeforeMasteryCalculator(13)==127) {
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    " METHOD: yearsBeforeMasteryCalculator\n" +
                    " It looks like your method is rounding values like 1.3 up to 2\n" +
                    " According to the task, they need to be rounded down to 1 \n" +
                    " Try to do the calculations in double type values first, \n" +
                    " Round the result up and cast it to an integer in the end \n" +
                    " to get the correct result. You see a casting example in \n" +
                    " \"Introduction to Java Programming and Data Structures book\"\n" +
                    "  chapter 2.15 casting \n" +
                    "-------------------------------------------------------------------------\n"
            );
        }

        Assertions.assertEquals( 37, PracticePlanner.yearsBeforeMasteryCalculator(45));

    }

    @DisplayName("Checks if hoursOfPractisePerDayCalculator returns hours per day")
    @Test
    void hoursOfPracticePerDayCalculatorTest() {
        // Test that checks if the students only rounded up to one decimal
        if(PracticePlanner.hoursOfPracticePerDayCalculator()==1.36986301369863){
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    " METHOD: hoursOfPracticePerDayCalculator\n" +
                    " You need to round up the result to two decimals, try the to google\n" +
                    " Java Math.round() method to find an example in documentation\n" +
                    "-------------------------------------------------------------------------\n"
            );
        }
        Assertions.assertEquals( 1.37, PracticePlanner.hoursOfPracticePerDayCalculator());
    }

    @DisplayName("Checks if practiceTimeCalculator returns hours from a fixed point in time to now")
    @Test
    void practiceTimeCalculatorTest() {
        // Test that checks if the students only rounded up to one decimal
        if(PracticePlanner.practiceTimeCalculator()==0.0){
            fail("\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    " METHOD: practiceTimeCalculator\n" +
                    " There is probably a mistake in variable type conversion\n" +
                    " There is probably a mistake in variable type conversion\n" +
                    " Try to do the calculations using long variable type and cast to double \n" +
                    " during the last division from minutes to hours. Remember to round up after \n" +
                    "-------------------------------------------------------------------------\n"
            );
        }
        double expected = Math.round(((double)((System.currentTimeMillis()-1665378185977L)/1000/60)/60)*100.0)/100.0;
        Assertions.assertEquals( expected, PracticePlanner.practiceTimeCalculator());
    }

}