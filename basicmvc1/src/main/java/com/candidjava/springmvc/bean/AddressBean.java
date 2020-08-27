package com.candidjava.springmvc.bean;

public class AddressBean
{
	private String city;
	private String state;
	private int pincode;

	public void setCity(String city)
	{
		this.city=city;
	}
	
	public String getCity()
	{
		return this.city;
	}

	public String getState()
	{
		return state;
	}

	public void setState(String state) 
	{
		this.state = state;
	}

	public int getPincode() {
		
		return pincode;
	}

	public void setPincode(int pincode) 
	{
		if(pincode>10000)
		{
			this.pincode = pincode;
		}
		else
		{
			System.out.println("invalid pincode");
		}
	}
	
	
	
	
}