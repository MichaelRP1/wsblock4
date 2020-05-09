package mock1youtube;

import java.util.ArrayList;

public class ReviewCollector {
    private ArrayList<ProductReview> reviewList;
    private ArrayList<String> productList;

    public ReviewCollector() {
        reviewList = new ArrayList<ProductReview>();
        productList = new ArrayList<String>();
    }

    // Part A
    public void addReview(ProductReview prodReview) {
        reviewList.add(prodReview);
        String name = prodReview.getName();
        boolean found = false;
        for(int i = 0; i < productList.size(); i++) {
            if(name.equals(productList.get(i))) {
                found = true;
            }
        }
        if(found == false) {
            productList.add(name);
        }
    }

    // Part B
    public int getNumGoodReviews(String prodName) {
        int good = 0;
        for(ProductReview list: reviewList) {
            if(list.getName().equals(prodName)) {
                if(list.getReview().indexOf("best") != -1) {
                    good++;
                }
            }
        }
        return good;
    }

    /* Part C
    public ArrayList<ProductReview> getBestReviewsByProduct(int prodName)
    The integer "good" is not longer necessary. An ArrayList containing ProductReview objects would be necessary and needed to be added.
    In addition, instead of incrementing "good" up by 1 if the review is considered good, the ProductReview would have to be added to the ArrayList that was created.
    Finally, the method would then have to return the ArrayList that was created instead of the integer "good".
     */

    public static void main(String[] args) {
        ReviewCollector i = new ReviewCollector();
        i.addReview(new ProductReview("eggs", "asbestos"));
        System.out.println(i.getNumGoodReviews("eggs"));
    }
}
