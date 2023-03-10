package com.kenzie.model;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="totalOrder")
public class TotalOrder {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="totalOrderId")
	private Integer totalOrderId;
	
	@Column(name="orderDate")
	private java.sql.Date orderDate;
	
	@Column(name="trackingId")
	private String trackingId;
	
	@Column(name="totalPrice")
	private Double totalPrice;
	
	@Column(name="orderStatus")
	private String orderStatus;
	
	@JsonIgnore
    @OneToMany(mappedBy="totalOrder", fetch = FetchType.LAZY, cascade = CascadeType.ALL)//orphanRemoval=true leads to error
    private List<Bundle> bundles;
    
	@ManyToOne
	@JoinColumn(name = "userId", nullable=false)
	private User user;

	@OneToOne
	@JoinColumn(name="isShipping")//how to link this if Address field isShipping=true?
	private Address shippingAddress;
	
	@OneToOne
	@JoinColumn(name="isBilling")//how to link this if Address field isBilling=true?
	private Address billingAddress;
	
	
}