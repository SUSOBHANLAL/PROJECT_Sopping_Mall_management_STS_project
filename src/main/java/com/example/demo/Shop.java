package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * 
 * Developed by SUSOBHAN_LAL
 *
 */


@Entity
public class Shop {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="shop_Id", nullable = false, unique = true)
	private Integer shop_Id ;
	private String shop_Category; 
	private Integer shop_EmployeeID; 
	private String shop_Name ; 
	private String customers; 
	private String shop_Status; 
	private String shop_Owner ; 
	private String lease_Status;
	public Shop(Integer shop_Id, String shop_Category, Integer shop_EmployeeID, String shop_Name, String customers,
			String shop_Status, String shop_Owner, String lease_Status) {
		
		this.shop_Id = shop_Id;
		this.shop_Category = shop_Category;
		this.shop_EmployeeID = shop_EmployeeID;
		this.shop_Name = shop_Name;
		this.customers = customers;
		this.shop_Status = shop_Status;
		this.shop_Owner = shop_Owner;
		this.lease_Status = lease_Status;
	}
	public Shop() {
		super();
	}
	
	
	public Integer getShop_Id() {
		return shop_Id;
	}
	public void setShop_Id(Integer shop_Id) {
		this.shop_Id = shop_Id;
	}
	public String getShop_Category() {
		return shop_Category;
	}
	public void setShop_Category(String shop_Category) {
		this.shop_Category = shop_Category;
	}
	public Integer getShop_EmployeeID() {
		return shop_EmployeeID;
	}
	public void setShop_EmployeeID(Integer shop_EmployeeID) {
		this.shop_EmployeeID = shop_EmployeeID;
	}
	public String getShop_Name() {
		return shop_Name;
	}
	public void setShop_Name(String shop_Name) {
		this.shop_Name = shop_Name;
	}
	public String getCustomers() {
		return customers;
	}
	public void setCustomers(String customers) {
		this.customers = customers;
	}
	public String getShop_Status() {
		return shop_Status;
	}
	public void setShop_Status(String shop_Status) {
		this.shop_Status = shop_Status;
	}
	public String getShop_Owner() {
		return shop_Owner;
	}
	public void setShop_Owner(String shop_Owner) {
		this.shop_Owner = shop_Owner;
	}
	public String getLease_Status() {
		return lease_Status;
	}
	public void setLease_Status(String lease_Status) {
		this.lease_Status = lease_Status;
	}
	@Override
	public String toString() {
		return "Shop [shop_Id=" + shop_Id + ", shop_Category=" + shop_Category + ", shop_EmployeeID=" + shop_EmployeeID
				+ ", shop_Name=" + shop_Name + ", customers=" + customers + ", shop_Status=" + shop_Status
				+ ", shop_Owner=" + shop_Owner + ", lease_Status=" + lease_Status + "]";
	}
	
	
	

}

