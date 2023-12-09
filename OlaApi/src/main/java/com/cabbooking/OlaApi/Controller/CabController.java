package com.cabbooking.OlaApi.Controller;
import com.cabbooking.OlaApi.Payload.CabDto;
import com.cabbooking.OlaApi.Service.CabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/cabs")
public class CabController {

    @Autowired
    private CabService cabService;

    // http://localhost:8282/api/cabs/save
    @PostMapping("/save")
    public ResponseEntity<CabDto> createCabDetail(@RequestBody CabDto cabDto){
        CabDto cab = this.cabService.createCab(cabDto);
        return new ResponseEntity<>(cab , HttpStatus.CREATED);
    }
}
