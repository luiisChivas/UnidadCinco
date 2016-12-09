package mx.utng.practice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Car {
	@Id @GeneratedValue
	private Long id;
	private String name;
	private String color;
	private int model;
	public Car(String name, String color, int model) {
		super();
		this.name = name;
		this.color = color;
		this.model = model;
	}
	public Car() {
		this("","",0);
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	
	
	
	

}
