package api;


import java.util.HashSet;

public class Services {
    private HashSet<View> view;
    private HashSet<Bathroom> bathroom;
    private HashSet<Laundry> laundry;
    private HashSet<Entertainment> entertainment;
    private HashSet<HeatingAndAirCondition> heatingAndAirCondition;
    private HashSet<Internet> internet;
    private HashSet<Kitchen> kitchen;
    private HashSet<Exterior> exterior;
    private HashSet<ParkingSpace> parkingSpace;

    enum View{
        POOL_VIEW,BEACH_VIEW,SEA_VIEW_PORT_VIEW,MOUNTAIN_VIEW,ROAD_VIEW
    };
    enum Bathroom{
        HAIRDRYER
    };
    enum Laundry{
        WASHING_MACHINE,DRYER
    }
    enum Entertainment{
        TV
    }
    enum HeatingAndAirCondition{
        INDOOR_FIREPLACE,AIR_CONDITION,CENTRAL_HEATING
    }
    enum Internet{
        WIFI,ETHERNET
    }
    enum Kitchen{
        KITCHEN, REFRIGERATOR, MICROWAVE, COOKWARE,
        DISHES_AND_CUTLERY, DISHWASHER, COFFEE_MACHINE
    }
    enum Exterior{
        BALCONY,YARD
    }
    enum ParkingSpace{
        FREE_ON_PROPERTY,FREE_ON_THE_ROAD
    }

    public Services() {
        view = new HashSet<>();
        bathroom = new HashSet<>();
        laundry = new HashSet<>();
        entertainment = new HashSet<>();
        heatingAndAirCondition = new HashSet<>();
        internet = new HashSet<>();
        kitchen = new HashSet<>();
        exterior = new HashSet<>();
        parkingSpace = new HashSet<>();
    }



    public HashSet<View> getView() {
        return view;
    }

    public HashSet<Bathroom> getBathroom() {
        return bathroom;
    }

    public HashSet<Laundry> getLaundry() {
        return laundry;
    }

    public HashSet<Entertainment> getEntertainment() {
        return entertainment;
    }

    public HashSet<HeatingAndAirCondition> getHeatingAndAirCondition() {
        return heatingAndAirCondition;
    }

    public HashSet<Internet> getInternet() {
        return internet;
    }

    public HashSet<Kitchen> getKitchen() {
        return kitchen;
    }

    public HashSet<Exterior> getExterior() {
        return exterior;
    }

    public HashSet<ParkingSpace> getParkingSpace() {
        return parkingSpace;
    }

    public void addView(View view) {
        this.view.add(view);
    }

    public void addBathroom(Bathroom bathroom) {
        this.bathroom.add(bathroom);
    }

    public void addLaundry(Laundry laundry) {
        this.laundry.add(laundry);
    }

    public void addEntertainment(Entertainment entertainment) {
        this.entertainment.add(entertainment);
    }

    public void addHeatingAndAirCondition(HeatingAndAirCondition heatingAndAirCondition) {
        this.heatingAndAirCondition.add(heatingAndAirCondition);
    }

    public void addInternet(Internet internet) {
        this.internet.add(internet);
    }

    public void addKitchen(Kitchen kitchen) {
        this.kitchen.add(kitchen);
    }

    public void addExterior(Exterior exterior) {
        this.exterior.add(exterior);
    }

    public void addParkingSpace(ParkingSpace parkingSpace) {
        this.parkingSpace.add(parkingSpace);
    }

    @Override
    public String toString() {
        return "Services{" +
                "view=" + view +
                ", bathroom=" + bathroom +
                ", laundry=" + laundry +
                ", entertainment=" + entertainment +
                ", heatingAndAirCondition=" + heatingAndAirCondition +
                ", internet=" + internet +
                ", kitchen=" + kitchen +
                ", exterior=" + exterior +
                ", parkingSpace=" + parkingSpace +
                '}';
    }
}