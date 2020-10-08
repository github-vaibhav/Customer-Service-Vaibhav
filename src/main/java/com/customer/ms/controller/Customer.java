package com.customer.ms.controller;

public class Customer {
	

		private String ID;
		private String Name;
		private String Age;
		private String Phone;
	
		public Customer() {
		
		}
		
		public Customer(String iD, String name, String age, String phone) {
			super();
			ID = iD;
			Name = name;
			Age = age;
			Phone = phone;
		}
		public String getID() {
			return ID;
		}
		public void setID(String iD) {
			ID = iD;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public String getAge() {
			return Age;
		}
		public void setAge(String age) {
			Age = age;
		}
		public String getPhone() {
			return Phone;
		}
		public void setPhone(String phone) {
			Phone = phone;
		}
	

}
