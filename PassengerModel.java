package com.trips.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "passenger_details")
@Component
public class PassengerModel {
	
	@Id
	private long passengerId;
	private String passengerName;
	private String passengerGender;
	private long passengerPhoneNumber;
	private String passengerEmail;
	private String paymentMode;
	private double passengerLatitude;
	private double passengerLongitude;
	private String passengerLocationCityName;
	private boolean passengerHasTrip;

}
