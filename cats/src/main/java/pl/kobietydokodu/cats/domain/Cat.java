package pl.kobietydokodu.cats.domain;

import java.util.Date;

public class Cat
{
	String name;
	Date birthDate;
	Float weight;
	String ownerName;
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public Date getBirthDate()
	{
		return birthDate;
	}
	public void setBirthDate(Date birthDate)
	{
		this.birthDate = birthDate;
	}
	public Float getWeight()
	{
		return weight;
	}
	public void setWeight(Float weight)
	{
		this.weight = weight;
	}
	public String getOwnerName()
	{
		return ownerName;
	}
	public void setOwnerName(String ownerName)
	{
		this.ownerName = ownerName;
	}

	public String intriduceYourself()
	{
		return "Cze��, jestem "+name+", urodzi�em si� "+birthDate+", wa�� "+weight+", a opiekuje si� mn� " + ownerName;
	}
}
