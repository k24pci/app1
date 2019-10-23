package com.ucx.training.sessions.app1.businesslogic;

public class Employee {
    private String firstName;
    private String lastName;
    private String position;
    private Gender gender;
    private Address address;

    public Employee(){
    }

    public Employee(String firstName, String lastName, String position, Gender gender, Address address)
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

    public String getPosition()
    {
        return position;
    }

    public void setPosition(String position)
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
}
