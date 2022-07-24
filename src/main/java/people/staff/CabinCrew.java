package people.staff;

public class CabinCrew extends Staff {

    public CabinCrew(String name){
        super(name, Rank.FLIGHT_ATTENDANT);
    }

    public String getCabinCrewName(){
        return super.getStaffName();
    }

    public void setCabinCrewName(String name){
        super.setStaffName(name);
    }

    public Rank getCabinCrewRank(){
        return super.getRank();
    }

    public String announce(){
        return "Announce";
    }
}
