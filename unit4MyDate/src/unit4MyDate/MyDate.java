package unit4MyDate;

public class MyDate {

    /**
     * @author Michael Castiglia
     * AP Computer Science A
     * Unit 4 MyDate Class
     * Additional Reinforcement
     * Optional Project
     * 
     * Included Date Validation (Optional)
     */

    private int year = 1;
    private int month = 1;
    private int day = 1;

    // Constructors
    public MyDate() {

    }

    /**
     * Variable Order:
     * Month, Day, Year
     * @throws Exception 
     */

    public MyDate(int m, int d, int y) throws Exception {
        if (m < 1 || m > 12) {
            throw new Exception("Invalid Month");
        } else {
            month = m;
        }

        if (d < 1 || d > 31) {
            throw new Exception("Invalid Day");
        } else {
            day = d;
        }

        year = y;
    }
    // End Contructors

    // Start Ordinary Setters and Getters

    /**
     * Setter Methods: setDay, setMonth, and setYear
     * Getter Methods: getDay, getMonth, and getYear
     */

     /**
      * @return the month
      */
     public int getMonth() {
         return month;
     }

     /**
      * @return the day
      */
     public int getDay() {
         return day;
     }

     /**
      * @return the year
      */
     public int getYear() {
         return year;
     }

     public void setMonth(int m) throws Exception {
         if (m < 1 || m > 12) {
            throw new Exception("Invalid Month");
        } else {
            month = m;
        }
     }

     public void setDay(int d) throws Exception {
         if (d < 1 || d > 31) {
            throw new Exception("Invalid Day");
        } else {
            day = d;
        }
     }

     public void setYear(int y) {
         year = y;
     }

     /**
      * toString Returns MM/dd/YYYY
      */
      public String toString() {
          String string = month + "/" + day + "/" + year;
          return string;
      }
}
