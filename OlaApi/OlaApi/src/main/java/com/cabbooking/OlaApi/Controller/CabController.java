package com.cabbooking.OlaApi.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cabbooking.OlaApi.Entity.Cab;
import com.cabbooking.OlaApi.Exception.CabException;
import com.cabbooking.OlaApi.Service.CabService;

@RestController
@RequestMapping("api/cabs")
public class CabController {
   
   @Autowired
   private CabService cabService; 
   
   //http://localhost:8282/api/cabs/register
   
   @PostMapping("/register")
   public ResponseEntity<Cab> register(@RequestBody Cab cab) throws CabException{
	     
	   return new ResponseEntity<Cab>(this.cabService.insertCab(cab),HttpStatus.CREATED);
	   
   }
   
   
    
}
