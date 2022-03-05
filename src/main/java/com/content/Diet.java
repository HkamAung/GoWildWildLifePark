package com.content;

public class Diet {
	private int D_id ;
	  private String D_type;
	  private int D_number;
	public int getD_id() {
		return D_id;
	}
	public void setD_id(int d_id) {
		D_id = d_id;
	}
	public String getD_type() {
		return D_type;
	}
	public void setD_type(String d_type) {
		D_type = d_type;
	}
	public int getD_number() {
		return D_number;
	}
	public void setD_number(int d_number) {
		D_number = d_number;
	}
	public Diet(int _Dietid, String _Diettype, int _Dietnumber ) {
		  this.D_id = _Dietid;
		  this.D_type = _Diettype;
		  this.D_number = _Dietnumber;
	}
	public Diet(String _Diettype, int _Dietnumber ) {
		  
		  this.D_type = _Diettype;
		  this.D_number = _Dietnumber;
	}
}
