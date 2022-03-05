package com.content;

public class Animals {
	private int A_id;
	  private String A_name;
	  private String A_gender;
	  private int A_year;
	  private int E_id;
	  private int S_id;
	  private int D_id;
	  private int K_id;
	  private String keepername;
		private int totalanimals;
	public int getA_id() {
		return A_id;
	}
	public void setA_id(int a_id) {
		A_id = a_id;
	}
	public String getA_name() {
		return A_name;
	}
	public void setA_name(String a_name) {
		A_name = a_name;
	}
	public String getA_gender() {
		return A_gender;
	}
	public void setA_gender(String a_gender) {
		A_gender = a_gender;
	}
	public int getA_year() {
		return A_year;
	}
	public void setA_year(int a_year) {
		A_year = a_year;
	}
	public int getE_id() {
		return E_id;
	}
	public void setE_id(int e_id) {
		E_id = e_id;
	}
	public int getS_id() {
		return S_id;
	}
	public void setS_id(int s_id) {
		S_id = s_id;
	}
	public int getD_id() {
		return D_id;
	}
	public void setD_id(int d_id) {
		D_id = d_id;
	}
	public int getK_id() {
		return K_id;
	}
	public void setK_id(int k_id) {
		K_id = k_id;
	}
	  public Animals(int _animalsid, String _animalsname, String _animalsgender,
			  int _animalsyear, int _enclosureid, int _speciesid, int _dietid, int _keeperid) {
		  this.A_id = _animalsid;
		  this.A_name = _animalsname;
		  this.A_gender = _animalsgender;
		  this.A_year = _animalsyear;
		  this.E_id = _enclosureid;
		  this.S_id = _speciesid;
		  this.D_id = _dietid;
		  this.K_id = _keeperid;
		  
	  }
	  public Animals( String _animalsname, String _animalsgender,
			  int _animalsyear, int _enclosureid, int _speciesid, int _dietid, int _keeperid) {
		  this.A_name = _animalsname;
		  this.A_gender = _animalsgender;
		  this.A_year = _animalsyear;
		  this.E_id = _enclosureid;
		  this.S_id = _speciesid;
		  this.D_id = _dietid;
		  this.K_id = _keeperid;
		  
	  }
	  public Animals (int _animalId,String _name,String _gender,int _year,int _keeperId,String _keepername) {
			this.A_id=_animalId;
			this.A_name=_name;
			this.A_gender=_gender;
			this.A_year=_year;
			this.K_id=_keeperId;
			this.keepername=_keepername;
		}
		public Animals (String _keepername, int _totalanimals) {
			this.keepername=_keepername;
			this.totalanimals=_totalanimals;
		}
		public Animals(String string, String string2, int int1, int int2, int int3, int int4, int int5, int int6) {
			// TODO Auto-generated constructor stub
		}
		public String getKeepername() {
			return keepername;
		}
		public void setKeepername(String keepername) {
			this.keepername = keepername;
		}
		public int getTotalanimals() {
			return totalanimals;
		}
		public void setTotalanimals(int totalanimals) {
			this.totalanimals = totalanimals;
		}
}
