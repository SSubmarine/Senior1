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
public class BookTrip implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long bookTripId;
	private Date tripBookingDate;
	private double bookTripPrice;
	private String personPerBookingTrip;

	public long getBookTripId() {
		return bookTripId;
	}

	public void setBookTripId(long bookTripId) {
		this.bookTripId = bookTripId;
	}

	public Date getTripBookingDate() {
		return tripBookingDate;
	}

	public void setTripBookingDate(Date tripBookingDate) {
		this.tripBookingDate = tripBookingDate;
	}

	public double getBookTripPrice() {
		return bookTripPrice;
	}

	public void setBookTripPrice(double bookTripPrice) {
		this.bookTripPrice = bookTripPrice;
	}

	public String getPersonPerBookingTrip() {
		return personPerBookingTrip;
	}

	public void setPersonPerBookingTrip(String personPerBookingTrip) {
		this.personPerBookingTrip = personPerBookingTrip;
	}


	@ManyToOne(fetch = FetchType.EAGER)
	private Trip trip;

	public Trip getTrip() {
		return trip;
	}

	public void setTrip(Trip trip) {
		this.trip = trip;
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
