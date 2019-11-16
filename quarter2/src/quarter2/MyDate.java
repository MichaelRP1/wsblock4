package quarter2;

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

    public MyDate(MyDate d) {
        this.year = d.year;
        this.month = d.month;
        this.day = d.day;
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
            this.month = m;
        }

        if (d < 1 || d > 31) {
            throw new Exception("Invalid Day");
        } else {
            this.day = d;
        }

        this.year = y;
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
         return this.month;
     }

     /**
      * @return day
      */
     public int getDay() {
         return this.day;
     }

     /**
      * @return year
      */
     public int getYear() {
         return this.year;
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
            this.month = m;
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
            this.day = d;
        }
     }

     /**
      * Sets year
      * @param y
      * @return void
      */
     public void setYear(int y) {
        this.year = y;
     }

     /**
      * @return MM/dd/YYYY
      */
      public String toString() {
          String string = this.month + "/" + this.day + "/" + this.year;
          return string;
      }
}
