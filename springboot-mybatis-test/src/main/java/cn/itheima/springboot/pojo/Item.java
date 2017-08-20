package cn.itheima.springboot.pojo;

public class Item {
	  private int id;//int(11) NOT NULL AUTO_INCREMENT,
	  private String name;//varchar(50) DEFAULT NULL,
	  private double price;//double DEFAULT NULL,
	  private int store;//int(11) DEFAULT NULL,
	  private String brand;//varchar(50) DEFAULT NULL,
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStore() {
		return store;
	}
	public void setStore(int store) {
		this.store = store;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	  
}
