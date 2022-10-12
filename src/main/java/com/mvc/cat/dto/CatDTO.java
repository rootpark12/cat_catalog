package com.mvc.cat.dto;

public class CatDTO {
   
   private int cat_id;
   private String cat_name;
   private String cat_breed;
   private int cat_price;
   private int cat_age;
   
   
public int getCat_age() {
	return cat_age;
}
public void setCat_age(int cat_age) {
	this.cat_age = cat_age;
}
public int getCat_id() {
	return cat_id;
}
public void setCat_id(int cat_id) {
	this.cat_id = cat_id;
}
public String getCat_name() {
	return cat_name;
}
public void setCat_name(String cat_name) {
	this.cat_name = cat_name;
}
public String getCat_breed() {
	return cat_breed;
}
public void setCat_breed(String cat_breed) {
	this.cat_breed = cat_breed;
}
public int getCat_price() {
	return cat_price;
}
public void setCat_price(int cat_price) {
	this.cat_price = cat_price;
}
  

}