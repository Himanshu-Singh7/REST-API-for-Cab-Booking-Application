package com.cabbooking.OlaApi.Repository;

import com.cabbooking.OlaApi.Entity.Cab;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CabRepository extends JpaRepository<Cab,Long> {
	
	Optional<Cab> findBycabNumber(String cabNumber);

}
