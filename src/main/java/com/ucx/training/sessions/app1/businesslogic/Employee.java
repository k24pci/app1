package com.ucx.training.sessions.app1.businesslogic;

public class Employee {
    private String firstName;
    private String lastName;
    private Gender gender;
    private Address address;
    private Position position;

    public Employee(String steve, String bald, String qa, Gender male, Address address1){
    }

    public Employee(String firstName, String lastName, Position position, Gender gender, Address address)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.gender = gender;
        this.address = address;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public Position getPosition()
    {
        return position;
    }

    public void setPosition(Position position)
    {
        this.position = position;
    }

    public Gender getGender()
    {
        return gender;
    }

    public void setGender(Gender gender)
    {
        this.gender = gender;
    }

    public Address getAddress()
    {
        return address;
    }

    public void setAddress(Address address)
    {
        this.address = address;
    }

    public double calculateWage(double workingHoursPerMonth){
        return workingHoursPerMonth * position.getPayPerHour();
    }
}
