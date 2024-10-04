package net.jacobstephens.LinkedList;

public class Town {
    private String town;
    private int kmFromSydney;

    public Town(String town, int kmFromSydney) {
        this.town = town;
        this.kmFromSydney = kmFromSydney;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public int getKmFromSydney() {
        return kmFromSydney;
    }

    public void setKmFromSydney(int kmFromSydney) {
        this.kmFromSydney = kmFromSydney;
    }
}
