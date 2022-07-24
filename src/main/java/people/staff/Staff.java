package people.staff;

import people.Person;

public abstract class Staff extends Person {

    private Rank rank;

    public Staff(String name, Rank rank){
        super(name);
        this.rank = rank;
    }

    public String getStaffName(){
        return super.getName();
    }

    public void setStaffName(String name){
        super.setName(name);
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }
}
