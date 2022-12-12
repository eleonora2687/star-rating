package api;


public class Review {
    private String reviewText;
    private int stars;

    public Review(){

    }

    public boolean setStars(int stars){
        if (stars>5 | stars<1)
            return false;

        this.stars=stars;
        return true;
    }

    public boolean setReviewText(String reviewText){
        if (reviewText.length()>500)
            return false;
        this.reviewText=reviewText;
        return true;
    }

    public String getReviewText() {
        return reviewText;
    }

    public int getStars() {
        return stars;
    }
}
