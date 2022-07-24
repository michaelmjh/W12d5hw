package people;

public class Passenger extends Person {

    private int numberOfBags;

    public Passenger(String name, int numberOfBags){
        super(name);
        this.numberOfBags = numberOfBags;
    }

    public String getPassengerName(){
        return super.getName();
    }

    public void setPassengerName(String name){
        super.setName(name);
    }

    public int getNumberOfBags() {
        return numberOfBags;
    }

    public void setNumberOfBags(int numberOfBags) {
        this.numberOfBags = numberOfBags;
    }
}
