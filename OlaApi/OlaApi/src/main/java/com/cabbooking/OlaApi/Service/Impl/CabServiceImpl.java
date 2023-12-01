package com.cabbooking.OlaApi.Service.Impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cabbooking.OlaApi.Entity.Cab;
import com.cabbooking.OlaApi.Exception.CabException;
import com.cabbooking.OlaApi.Repository.CabRepository;
import com.cabbooking.OlaApi.Service.CabService;

@Service
public class CabServiceImpl implements CabService {

	@Autowired
	private CabRepository cabRepository;

	@Override
	public Cab insertCab(Cab cab) throws CabException {

		Optional<Cab> findcab = this.cabRepository.findBycabNumber(cab.getCabNumber());

		if (findcab.isEmpty()) {

			return this.cabRepository.save(cab);
		} else {

			throw new CabException("Cab is already Registered");
		}

	}

	@Override
	public Cab updateCab(Cab cab, long cabId) {
		
		return null;
	}

}
