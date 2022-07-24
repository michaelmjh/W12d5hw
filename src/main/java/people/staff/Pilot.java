package people.staff;

public class Pilot extends Staff {

    private String licenceNumber;

    public Pilot(String name, Rank rank, String licenceNumber){
        super(name, rank);
        this.licenceNumber = licenceNumber;
    }

    public String getPilotName(){
        return super.getStaffName();
    }

    public void setPilotName(String name){
        super.setStaffName(name);
    }

    public Rank getPilotRank(){
        return super.getRank();
    }

    public void setPilotRank(Rank rank){
        super.setRank(rank);
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public void setLicenceNumber(String licenceNumber) {
        this.licenceNumber = licenceNumber;
    }

    public String fly(){
        return "Fly";
    }
}
