package mx.utng.practice.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import mx.utng.practice.model.Car;
import mx.utng.practice.model.Contact;
import mx.utng.practice.model.Customer;
import mx.utng.practice.repository.CarRepository;
import mx.utng.practice.repository.CustomerRepository;

@Named
@ViewScoped
public class CarController {

	@Autowired
	private CarRepository carRepository;
	private Car car = new Car();
	private List<Car> cars;
	private boolean editMode = false;
	
		

	@PostConstruct
	public void init(){
		setCars(carRepository.findAll());
	}
	
	public void save(){
		carRepository.save(car);
		if(!editMode){
			getCars().add(car);
		}
		car = new Car();
		setEditMode(false);
	}
	
	public void delete(Car car){
		carRepository.delete(car);
		cars.remove(car);
	}
	
	public void update (Car car){
		setCar(car);
		setEditMode(true);
	}
	
	public void cancel(){
		car = new Car();
		setEditMode(false);
	}
	
	public CarRepository getCarRepository() {
		return carRepository;
	}

	public void setCarRepository(CarRepository carRepository) {
		this.carRepository = carRepository;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	public boolean isEditMode() {
		return editMode;
	}

	public void setEditMode(boolean editMode) {
		this.editMode = editMode;
	}

	
	
}
