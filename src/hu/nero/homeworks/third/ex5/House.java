package hu.nero.homeworks.third.ex5;

public class House {
private String streetName;
private int buildingNumber;

public House(String streetName, int buildingNumber) {
		this.streetName = streetName;
		this.buildingNumber = buildingNumber;
}

public String getStreetName() {
		return streetName;
}

public void setStreetName(String streetName) {
		this.streetName = streetName;
}

public int getBuildingNumber() {
		return buildingNumber;
}

public void setBuildingNumber(int buildingNumber) {
		this.buildingNumber = buildingNumber;
}

@Override
public String toString() {
		return streetName + " " + buildingNumber;


}
}
