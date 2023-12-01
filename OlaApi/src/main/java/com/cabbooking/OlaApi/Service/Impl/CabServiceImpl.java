package com.cabbooking.OlaApi.Service.Impl;
import com.cabbooking.OlaApi.Entity.Cab;
import com.cabbooking.OlaApi.Payload.CabDto;
import com.cabbooking.OlaApi.Repository.CabRepository;
import com.cabbooking.OlaApi.Service.CabService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CabServiceImpl implements CabService {

    @Autowired
    private CabRepository cabRepository;
    @Autowired
    private ModelMapper modelMapper;



    @Override
    public CabDto createCab(CabDto cabDto) {
        Cab cab = this.modelMapper.map(cabDto,Cab.class);
        Cab saveCab = this.cabRepository.save(cab);
        return this.modelMapper.map(saveCab,CabDto.class);
    }
    
    
}
