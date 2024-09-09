package demo;

import org.springframework.stereotype.Component;

@Component("add")
public class Address {
	
	private int hno;
	
	private String colony;
	
	private int pin;
	
	private String city;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public int getHno() {
		return hno;
	}

	public void setHno(int hno) {
		this.hno = hno;
	}

	public String getColony() {
		return colony;
	}

	public void setColony(String colony) {
		this.colony = colony;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [hno=" + hno + ", colony=" + colony + ", pin=" + pin + ", city=" + city + "]";
	}

	public Address(int hno, String colony, int pin, String city) {
		super();
		this.hno = hno;
		this.colony = colony;
		this.pin = pin;
		this.city = city;
	}
	

}
