package quarter2;

public class Invoice {

    /**
     * @author Michael Castiglia
     * @version ALPHA 1.0.0
     * 
     * Purpose: To Make an Item with for Invoicing and
     * to Calculate the Total Price of an Invoice, including
     * using a no-arg constructor
     * 
     * Built for: AP Computer Science A (Unit 4 Invoice Lab)
     */

    private String itemNum;
    private String desc;
    private int quantity;
    private double price;

    /**
     * No Arg Constructor
     */
    public Invoice() {
    }

    /**
     * @param itemNum item number
     * @param desc description of item
     * @param quantity quantity of items
     * @param price price for each item
     */
    public Invoice(String nNum, String nDesc, int nQuan, double nPrice) {
        this.itemNum = nNum;
        this.desc = nDesc;
        this.quantity = nQuan;
        this.price = nPrice;
    }

    //Copy Constructor
    public Invoice(Invoice i) {
        this.itemNum = i.itemNum;
        this.desc = i.desc;
        this.quantity = i.quantity;
        this.price = i.price;
    }

    /**
     * @return itemNum
     */
    public String getItemNum() {
        return this.itemNum;
    }

    /**
     * @param itemNum item number
     */
    public void setItemNum(String nNum) {
        this.itemNum = nNum;
    }

    /**
     * @return description
     */
    public String getDesc() {
        return this.desc;
    }

    /**
     * @param desc item decription
     */
    public void setDesc(String nDesc) {
        this.desc = nDesc;
    }

    /**
     * @return quantity
     */
    public int getQuanity() {
        return this.quantity;
    }

    /**
     * @param quantity number of items
     */
    public void setQuanity(int nQuan) {
        this.quantity = nQuan;
    }

    /**
     * @return price
     */
    public double getPrice() {
        return this.price;
    }

    /**
     * @param price price per item
     */
    public void setPrice(double nPrice) {
        this.price = nPrice;
    }

    /**
     * Makes a toString Statement
     * @return string
     */
    public String toString() {
        String printStr = "Item #: " + getItemNum() + " Item Description: " + getDesc() + " Item Quantity: " + getQuanity() + " Individual Price: " + getPrice();
        return printStr;
    }

    /**
     * Gets total amount.
     * @return total
     */
    public double getInvoiceAmount() {
        double total = getQuanity() * getPrice();
        return total;
    }
}
