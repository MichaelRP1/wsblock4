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
        itemNum = nNum;
        desc = nDesc;
        quantity = nQuan;
        price = nPrice;
    }

    public String getItemNum() {
        return itemNum;
    }

    public void setItemNum(String nNum) {
        itemNum = nNum;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String nDesc) {
        desc = nDesc;
    }

    public int getQuanity() {
        return quantity;
    }

    public void setQuanity(int nQuan) {
        quantity = nQuan;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double nPrice) {
        price = nPrice;
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
