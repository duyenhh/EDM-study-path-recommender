package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class faculty_course {
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String maMon;
	private String tenMon;
	private int soTinChi;
	private int idRequire;
	private int totalRequire;
	
	

	public faculty_course() {}
	
	public int getId() {
		return id;
	}
	
	public int getIdRequire() {
		return idRequire;
	}
	
	public int getSoTinChi() {
		return soTinChi;
	}
	
	public String getTenMon() {
		return tenMon;
	}
	public int getTotalRequire() {
		return totalRequire;
	}
	
	public String getMaMon() {
		return maMon;
	}

}
