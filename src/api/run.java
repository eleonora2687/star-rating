package api;

import java.util.ArrayList;
import java.util.HashMap;


//to edit accommodation tha thelei mono add
public class run {
    //HashMap<User,Review> reviews;
    private HashMap<Owner,ArrayList<Accommodation>> accommodations;



    public run(){
        setup();




    }

    public void setup(){
        accommodations = new HashMap<>();
        Owner provider1 = new Owner("provider1Name","provider1Surname","provider1","password1");
        accommodations.put(provider1,new ArrayList<>());
        Owner provider2 = new Owner("provider2Name","provider2Surname","provider2","password2");
        accommodations.put(provider2,new ArrayList<>());

        Accommodation accomm1 = new Accommodation("APARTS GIANNIS", Accommodation.Type.APARTMENT, (javax.xml.stream.Location) new Location("thess","thess","2020"),"nice apartments come");
        accomm1.addServices(Services.Kitchen.KITCHEN);

        addAccommodation(provider1,accomm1);
    }

    //--------------------------------paroxoi--------------------------------
    //boolean? needs more input
    public void addAccommodation(Owner owner,Accommodation accommodation){accommodations.get(owner).add(accommodation);}

    public void deleteAccommodation(Owner owner,Accommodation accommodation){accommodations.get(owner).remove(accommodation);}

    //mallon thelei new gia na min pairnei ton pointer, safe
    public ArrayList<Accommodation> getAccommodations(Owner owner){return accommodations.get(owner);}

    //d4.1
    public int getNumberOfReviews(Owner owner){
        int numberOfReviews=0;
        for (Accommodation accommodation : accommodations.get(owner)) {
            numberOfReviews+=accommodation.getNumberOfReviews();
        }
        return numberOfReviews;
    }

    //d4.2 returns 0 if not accommodations
    public float getAverageOfOwner(Owner owner){
        int sumOfReviews = 0;
        for (Accommodation accommodation : accommodations.get(owner)) {
            sumOfReviews+=accommodation.getAverageReviews();
        }
        if (accommodations.get(owner).size()==0){
            return 0;
        }
        return sumOfReviews/(float)accommodations.get(owner).size();
    }

    //--------------------------------xristes--------------------------------
    public void addReview(User user,Review review,Accommodation accommodationToReview){accommodationToReview.addReview(user,review);}

    public void deleteReview(User user,Accommodation accommodation){accommodation.deleteReview(user);}

    //e5.1
    public ArrayList<Accommodation> getUsersReviewedAccommodations(User user){
        ArrayList<Accommodation> reviewedAccommodations = new ArrayList<>();

        for (Owner owner : accommodations.keySet()) {
            for (Accommodation accommodation : accommodations.get(owner)) {
                if (accommodation.getReviews().containsKey(user))
                    reviewedAccommodations.add(accommodation);
            }
        }
        return reviewedAccommodations;
    }

    //e5.2 returns 0 if no reviews
    public float getUsersAverageReview(User user){
        int sumOfReviews=0;
        int numberOfReviews=0;
        for (Owner owner : accommodations.keySet()) {
            for (Accommodation accommodation : accommodations.get(owner)) {
                if (accommodation.getReviews().containsKey(user)) {
                    sumOfReviews += accommodation.getReviews().get(user).getStars();
                    numberOfReviews++;
                }
            }
        }
        if (numberOfReviews==0){
            return 0;
        }
        return sumOfReviews/(float)numberOfReviews;
    }

}