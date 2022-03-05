package com.content;

public class Keeper {
  private int keeperId;
  private String keeperName;
  private String keeperBirth;
  private String keeperEmail;
  private String keeperPhone;
  private String keeperrank;
public int getKeeperId() {
	return keeperId;
}
public void setKeeperId(int keeperId) {
	this.keeperId = keeperId;
}
public String getKeeperName() {
	return keeperName;
}
public void setKeeperName(String keeperName) {
	this.keeperName = keeperName;
}
public String getKeeperBirth() {
	return keeperBirth;
}
public void setKeeperBirth(String keeperBirth) {
	this.keeperBirth = keeperBirth;
}
public String getKeeperEmail() {
	return keeperEmail;
}
public void setKeeperEmail(String keeperEmail) {
	this.keeperEmail = keeperEmail;
}
public String getKeeperPhone() {
	return keeperPhone;
}
public void setKeeperPhone(String keeperPhone) {
	this.keeperPhone = keeperPhone;
}
public String getKeeperrank() {
	return keeperrank;
}
public void setKeeperrank(String keeperrank) {
	this.keeperrank = keeperrank;
}
  public Keeper(int _keeperId, String _keeperName, String _keeperBirth, String _keeperEmail, 
		  String _keeperPhone, String _keeperRank) {
	  this.keeperId = _keeperId;
	  this.keeperName = _keeperName;
	  this.keeperBirth = _keeperBirth;
	  this.keeperEmail = _keeperEmail;
	  this.keeperPhone = _keeperPhone;
	  this.keeperrank = _keeperRank;
	  
  }
  public Keeper(String _keeperName, String _keeperBirth, String _keeperEmail, 
		  String _keeperPhone, String _keeperRank) {
	  
	  this.keeperName = _keeperName;
	  this.keeperBirth = _keeperBirth;
	  this.keeperEmail = _keeperEmail;
	  this.keeperPhone = _keeperPhone;
	  this.keeperrank = _keeperRank;
	  
  }
}
