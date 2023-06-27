package com.hibernate1.HybernatOneToOneMapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User 
{
	
	@Id
	@Column(name="accno")
	String accno;
	
	@Column(name="name")
	String name;
	
	@Column(name="amount")
	String amount;
	
	@Column(name="password")
	String password;
	
	@Column(name="email")
	String email;
	
	@Column(name="phoneno")
	String phoneno;
	
	
	public User() {
		
	}


	public User(String accno, String name, String amount, String password, String email, String phoneno) {
		super();
		this.accno = accno;
		this.name = name;
		this.amount = amount;
		this.password = password;
		this.email = email;
		this.phoneno = phoneno;
	}


	public String getAccno() {
		return accno;
	}


	public void setAccno(String accno) {
		this.accno = accno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAmount() {
		return amount;
	}


	public void setAmount(String amount) {
		this.amount = amount;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhoneno() {
		return phoneno;
	}


	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	
	
	
	@Override
	public String toString() {

		return accno+" "+name;
	}
	
	

}
