package com.user.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name="property") //To create table
public class Property {
	
	@Id  //To make the field as primary key
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int propid;  //Database entities
	private String propname;
	private String proplocation;
	private String propsize;
	private String propfeatures;
	private String proptype;
	private String image1;
	private String image2;
	private String image3;
	private double price;
	private float ratings;
	@ManyToOne
	Owner owner;  //Foreign key
	
	public Property() { //Default constructor
		
	}

	public Property(int propid, String propname, String proplocation, String propsize, String propfeatures,
			String proptype, String image1, String image2, String image3, double price, float ratings, Owner owner) {
		super();
		this.propid = propid;
		this.propname = propname;
		this.proplocation = proplocation;
		this.propsize = propsize;
		this.propfeatures = propfeatures;
		this.proptype = proptype;
		this.image1 = image1;
		this.image2 = image2;
		this.image3 = image3;
		this.price = price;
		this.ratings = ratings;
		this.owner = owner;
	}
	
	public Property(String propname, String proplocation, String propsize, String propfeatures,
			String proptype, String image1, String image2, String image3, double price, float ratings, Owner owner) {
		super();
		this.propname = propname;
		this.proplocation = proplocation;
		this.propsize = propsize;
		this.propfeatures = propfeatures;
		this.proptype = proptype;
		this.image1 = image1;
		this.image2 = image2;
		this.image3 = image3;
		this.price = price;
		this.ratings = ratings;
		this.owner = owner;
	}

	public int getPropid() {
		return propid;
	}

	public void setPropid(int propid) {
		this.propid = propid;
	}

	public String getPropname() {
		return propname;
	}

	public void setPropname(String propname) {
		this.propname = propname;
	}

	public String getProplocation() {
		return proplocation;
	}

	public void setProplocation(String proplocation) {
		this.proplocation = proplocation;
	}

	public String getPropsize() {
		return propsize;
	}

	public void setPropsize(String propsize) {
		this.propsize = propsize;
	}

	public String getPropfeatures() {
		return propfeatures;
	}

	public void setPropfeatures(String propfeatures) {
		this.propfeatures = propfeatures;
	}

	public String getProptype() {
		return proptype;
	}

	public void setProptype(String proptype) {
		this.proptype = proptype;
	}

	public String getImage1() {
		return image1;
	}

	public void setImage1(String image1) {
		this.image1 = image1;
	}

	public String getImage2() {
		return image2;
	}

	public void setImage2(String image2) {
		this.image2 = image2;
	}

	public String getImage3() {
		return image3;
	}

	public void setImage3(String image3) {
		this.image3 = image3;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public float getRatings() {
		return ratings;
	}

	public void setRatings(float ratings) {
		this.ratings = ratings;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "Property [propid=" + propid + ", propname=" + propname + ", proplocation=" + proplocation
				+ ", propsize=" + propsize + ", propfeatures=" + propfeatures + ", proptype=" + proptype + ", image1="
				+ image1 + ", image2=" + image2 + ", image3=" + image3 + ", price=" + price + ", ratings=" + ratings
				+ ", owner=" + owner + "]";
	}

}
