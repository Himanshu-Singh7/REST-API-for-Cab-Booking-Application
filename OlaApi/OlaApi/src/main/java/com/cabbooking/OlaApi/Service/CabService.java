package com.cabbooking.OlaApi.Service;

import com.cabbooking.OlaApi.Entity.Cab;
import com.cabbooking.OlaApi.Exception.CabException;

public interface CabService {

   Cab insertCab(Cab cab) throws CabException;
   
   Cab updateCab(Cab cab,long cabId);

}
