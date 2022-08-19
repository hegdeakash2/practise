package com.datapack.model;

public class DataPack {
	
	 private  String brand;
	 private String type;
	 private Integer duration;
	 private Integer price;
	public DataPack() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DataPack(String brand, String type, Integer duration, Integer price) {
		super();
		this.brand = brand;
		this.type = type;
		this.duration = duration;
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "DataPack [brand=" + brand + ", type=" + type + ", duration=" + duration + ", price=" + price + "]";
	}
	 

}
