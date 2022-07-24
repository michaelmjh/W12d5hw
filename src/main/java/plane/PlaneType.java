package plane;

public enum PlaneType {
    BIG(5, 10),
    SMALL(1, 2);

    private final int capacity;
    private final int totalWeight;

    PlaneType(int capacity, int totalWeight){
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getTotalWeight() {
        return this.totalWeight;
    }
}