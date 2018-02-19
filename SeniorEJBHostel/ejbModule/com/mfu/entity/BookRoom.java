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
public class BookRoom implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long bookRoomId;
//	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date roomBookingDate;
	private double roomPrice;

	public long getBookRoomId() {
		return bookRoomId;
	}

	public void setBookRoomId(long bookRoomId) {
		this.bookRoomId = bookRoomId;
	}

	public Date getRoomBookingDate() {
		return roomBookingDate;
	}

	public void setRoomBookingDate(Date roomBookingDate) {
		this.roomBookingDate = roomBookingDate;
	}

	public double getRoomPrice() {
		return roomPrice;
	}

	public void setRoomPrice(double roomPrice) {
		this.roomPrice = roomPrice;
	}

	@ManyToOne(fetch=FetchType.EAGER)
	private Rooms rooms;

	public Rooms getRooms() {
		return rooms;
	}

	public void setRooms(Rooms rooms) {
		this.rooms = rooms;
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
