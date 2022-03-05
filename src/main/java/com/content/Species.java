package com.content;

public class Species {
	private int speciessid;
	private String speciestype;
	private String speciesgroup;
	private String speciesstatus;
	private String specieslifestyle;
	public int getSpecciessid() {
		return speciessid;
	}
	public void setSpeciessid(int speciessid) {
		this.speciessid = speciessid;
	}
	public String getSpeciestype() {
		return speciestype;
	}
	public void setSpeciestype(String speciestype) {
		this.speciestype = speciestype;
	}
	public String getSpeciesgroup() {
		return speciesgroup;
	}
	public void setSpeciesgroup(String speciesgroup) {
		this.speciesgroup = speciesgroup;
	}
	public String getSpeciesstatus() {
		return speciesstatus;
	}
	public void setSpeciesstatus(String speciesstatus) {
		this.speciesstatus = speciesstatus;
	}
	public String getSpecieslifestyle() {
		return specieslifestyle;
	}
	public void setSpecieslifestyle(String specieslifestyle) {
		this.specieslifestyle = specieslifestyle;
	}
	public Species(int _speciesid, String _speciestype, String _speciesgroup, String _speciesstatus, 
			  String _specieslifestyle) {
		  this.speciessid = _speciesid;
		  this.speciestype = _speciestype;
		  this.speciesgroup= _speciesgroup;
		  this.speciesstatus = _speciesstatus;
		  this.specieslifestyle = _specieslifestyle;
		  
	  }
	public Species( String _speciestype, String _speciesgroup, String _speciesstatus, 
			  String _specieslifestyle) {
		 
		  this.speciestype = _speciestype;
		  this.speciesgroup= _speciesgroup;
		  this.speciesstatus = _speciesstatus;
		  this.specieslifestyle = _specieslifestyle;

}
}
