package com.mfu.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class BookSpa implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long bookSpaId;
	private Date spaBookindDate;
	private String personPerBookingSpa;
	private double spaPrice;

	public long getBookSpaId() {
		return bookSpaId;
	}

	public void setBookSpaId(long bookSpaId) {
		this.bookSpaId = bookSpaId;
	}

	public Date getSpaBookindDate() {
		return spaBookindDate;
	}

	public void setSpaBookindDate(Date spaBookindDate) {
		this.spaBookindDate = spaBookindDate;
	}

	public String getPersonPerBookingSpa() {
		return personPerBookingSpa;
	}

	public void setPersonPerBookingSpa(String personPerBookingSpa) {
		this.personPerBookingSpa = personPerBookingSpa;
	}

	public double getSpaPrice() {
		return spaPrice;
	}

	public void setSpaPrice(double spaPrice) {
		this.spaPrice = spaPrice;
	}

	
	@ManyToOne(fetch=FetchType.EAGER)
	private Spa spa;
	

	public Spa getSpa() {
		return spa;
	}

	public void setSpa(Spa spa) {
		this.spa = spa;
	}


	@OneToOne
	private Reservation reservation;

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}


}
