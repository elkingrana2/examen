package com.examen.entities;

import javax.persistence.Entity;

@Entity
public class Book {
	
	private int klk;
	private int wawawa;
	
	
	
	public Book(int klk, int wawawa) {
		super();
		this.klk = klk;
		this.wawawa = wawawa;
	}
	
	public int suma()
	{
		return this.klk + this.wawawa;
	}
	
	public int resta()
	{
		return this.klk - this.wawawa;
	}
	
	public int multiplicacion()
	{
		return this.klk * this.wawawa;
	}
	

	public int getKlk() {
		return klk;
	}
	public void setKlk(int klk) {
		this.klk = klk;
	}
	public int getWawawa() {
		return wawawa;
	}
	public void setWawawa(int wawawa) {
		this.wawawa = wawawa;
	}
	
	

}
