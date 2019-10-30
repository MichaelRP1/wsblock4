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
     * Mutator Methods: setDay, setMonth, and setYear
     * Accessor Methods: getDay, getMonth, and getYear
     */

     /**
      * @return month
      */
     public int getMonth() {
         return month;
     }

     /**
      * @return day
      */
     public int getDay() {
         return day;
     }

     /**
      * @return year
      */
     public int getYear() {
         return year;
     }

     /**
      * Sets Month, Throws Exception if not valid
      * @param m
      * @throws Exception
      * @return void
      */

     public void setMonth(int m) throws Exception {
         if (m < 1 || m > 12) {
            throw new Exception("Invalid Month");
        } else {
            month = m;
        }
     }

     /**
      * Sets day, throws Exception if not valid
      * @param d
      * @throws Exception
      * @return void
      */
     public void setDay(int d) throws Exception {
         if (d < 1 || d > 31) {
            throw new Exception("Invalid Day");
        } else {
            day = d;
        }
     }

     /**
      * Sets year
      * @param y
      * @return void
      */
     public void setYear(int y) {
         year = y;
     }

     /**
      * @return MM/dd/YYYY
      */
      public String toString() {
          String string = month + "/" + day + "/" + year;
          return string;
      }
}
