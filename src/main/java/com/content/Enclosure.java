package com.content;
public class Enclosure {
	  private int E_Id;
	  private String E_type;
	  private String E_location;
	public int getE_Id() {
		return E_Id;
	}
	public void setE_Id(int e_Id) {
		E_Id = e_Id;
	}
	public String getE_type() {
		return E_type;
	}
	public void setE_type(String e_type) {
		E_type = e_type;
	}
	public String getE_location() {
		return E_location;
	}
	public void setE_location(String e_location) {
		E_location = e_location;
	}
	public Enclosure(int _enclosureId, String _enclosureType, String _enclosureLocation) {
		  this.E_Id = _enclosureId;
		  this.E_type = _enclosureType;
		  this.E_location = _enclosureLocation;
}
	public Enclosure( String _enclosureType, String _enclosureLocation) {
		  
		  this.E_type = _enclosureType;
		  this.E_location = _enclosureLocation;
}	
}
	  

