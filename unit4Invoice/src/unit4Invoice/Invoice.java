package unit4Invoice;

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

    public Invoice() {
    }

    public Invoice(String nNum, String nDesc, int nQuan, double nPrice) {
        this.itemNum = nNum;
        this.desc = nDesc;
        this.quantity = nQuan;
        this.price = nPrice;
    }

    public String getItemNum() {
        return this.itemNum;
    }

    public void setItemNum(String nNum) {
        this.itemNum = nNum;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String nDesc) {
        this.desc = nDesc;
    }

    public int getQuanity() {
        return this.quantity;
    }

    public void setQuanity(int nQuan) {
        this.quantity = nQuan;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double nPrice) {
        this.price = nPrice;
    }

    public String toString() {
        String printStr = "Item #: " + getItemNum() + " Item Description: " + getDesc() + " Item Quantity: " + getQuanity() + " Individual Price: " + getPrice();
        return printStr;
    }

    public double getInvoiceAmount() {
        double total = getQuanity() * getPrice();
        return total;
    }
}
