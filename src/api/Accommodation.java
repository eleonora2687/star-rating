package api;

import javax.xml.stream.Location;
import java.util.HashMap;

//tha xreiastei delete gia ta services
public class Accommodation {
    private String name;//na mpei orio stous xaraktires
    private Type type;
    private Location location;
    private String description;
    private Services services;
    private HashMap<User,Review> reviews;

    enum Type{
        HOTEL,APARTMENT,MAISONETTE
    };

    public Accommodation(String name, Type type, Location location, String description) {
        this.name = name;
        this.type = type;
        this.location = location;
        this.description = description;
        this.services = new Services();
        this.reviews = new HashMap<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void addServices(Services.View view){this.services.addView(view);}

    public void addServices(Services.Bathroom bathroom){this.services.addBathroom(bathroom);}

    public void addServices(Services.Laundry laundry){this.services.addLaundry(laundry);}

    public void addServices(Services.Entertainment entertainment){this.services.addEntertainment(entertainment);}

    public void addServices(Services.HeatingAndAirCondition heatingAndAirCondition){this.services.addHeatingAndAirCondition(heatingAndAirCondition);}

    public void addServices(Services.Internet internet){this.services.addInternet(internet);}

    public void addServices(Services.Kitchen kitchen){this.services.addKitchen(kitchen);}

    public void addServices(Services.Exterior exterior){this.services.addExterior(exterior);}

    public void addServices(Services.ParkingSpace parkingSpace){this.services.addParkingSpace(parkingSpace);}

    public void addReview(User user,Review review){reviews.put(user,review);}

    public void deleteReview(User user){reviews.remove(user);};

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public Location getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }

    public Services getServices() {
        return services;
    }

    public HashMap<User, Review> getReviews() {return reviews;}

    public float getAverageReviews(){
        int sumOfReviews=0;
        for (User user : reviews.keySet()) {
            sumOfReviews+=reviews.get(user).getStars();
        }
        return sumOfReviews/(float)reviews.size();
    }

    public int getNumberOfReviews(){return reviews.size();}

    @Override
    public String toString() {
        return "Accommodation{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", location=" + location +
                ", description='" + description + '\'' +
                ", services=" + services +
                ", reviews=" + reviews +
                '}';
    }
}
