package org.itAcademy.InterfacePck;

public abstract class AddressInfo {
    //region ATTRIBUTES
    public String country;

    // Directions attributes
    public String city = "";
    public String street = "";
    public int streetNumber = 0;
    public int floor = 0;
    public int door = 0;

    // Telephones attributes
    public int interCode;
    public String telephoneNumber;


    //endregion ATTRIBUTES


    //region METHODS
    public void SetInfo(String cityIn, String streetIn, int streetNumberIn, int floorIn, int doorIn, String telephoneNumberIn){
        city= cityIn;
        street = streetIn;
        streetNumber= streetNumberIn;
        floor = floorIn;
        door = doorIn;
        telephoneNumber = telephoneNumberIn;
    }

    public String ToStringTelephone(){
        return String.format("Tel. +%s %s", interCode, telephoneNumber);
    };

    public String ToStringDirection(){
        return String.format("%s, %s, floor: %s, door: %s\n%s (%s)", street, streetNumber, floor, door, city, country);
    };

    //endregion METHODS


}
