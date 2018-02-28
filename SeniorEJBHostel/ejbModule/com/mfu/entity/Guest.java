package com.mfu.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Guest implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long guestId;
	private String guestIdNumber;
	private String guestFirstname;
	private String guestLastname;
	private String guestNationality;
	private String guestEmail;
	private String guestAddress;
	private String guestPhone;
	private String guestGender;
	private int guestAge;

	public long getGuestId() {
		return guestId;
	}

	public void setGuestId(long guestId) {
		this.guestId = guestId;
	}

	public String getGuestIdNumber() {
		return guestIdNumber;
	}

	public void setGuestIdNumber(String guestIdNumber) {
		this.guestIdNumber = guestIdNumber;
	}

	public String getGuestFirstname() {
		return guestFirstname;
	}

	public void setGuestFirstname(String guestFirstname) {
		this.guestFirstname = guestFirstname;
	}

	public String getGuestLastname() {
		return guestLastname;
	}

	public void setGuestLastname(String guestLastname) {
		this.guestLastname = guestLastname;
	}

	public String getGuestNationality() {
		return guestNationality;
	}

	public void setGuestNationality(String guestNationality) {
		this.guestNationality = guestNationality;
	}

	public String getGuestEmail() {
		return guestEmail;
	}

	public void setGuestEmail(String guestEmail) {
		this.guestEmail = guestEmail;
	}

	public String getGuestAddress() {
		return guestAddress;
	}

	public void setGuestAddress(String guestAddress) {
		this.guestAddress = guestAddress;
	}

	public String getGuestPhone() {
		return guestPhone;
	}

	public void setGuestPhone(String guestPhone) {
		this.guestPhone = guestPhone;
	}

	public String getGuestGender() {
		return guestGender;
	}

	public void setGuestGender(String guestGender) {
		this.guestGender = guestGender;
	}

	public int getGuestAge() {
		return guestAge;
	}

	public void setGuestAge(int guestAge) {
		this.guestAge = guestAge;
	}

	@OneToMany(mappedBy = "guest", cascade = { CascadeType.ALL })
	private List<Reservation> resevation;

	private List<Reservation> getReservation() {
		return resevation;
	}

	private List<Reservation> setReservation() {
		return resevation;
	}
}
