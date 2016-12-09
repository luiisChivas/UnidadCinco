package mx.utng.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.utng.practice.model.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long>{

}
