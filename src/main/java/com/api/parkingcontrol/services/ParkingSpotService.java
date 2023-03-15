package com.api.parkingcontrol.services;

import com.api.parkingcontrol.repositories.ParkingSpotRepository;
import org.springframework.stereotype.Service;

@Service
public class ParkingSpotService {
    //ideal seria criar uma interface para o service primeiro

    //ponto de injeção no construtor, poderia ser @Autowired
    final  ParkingSpotRepository parkingSpotRepository;
    public ParkingSpotService(ParkingSpotRepository parkingSpotRepository){
        this.parkingSpotRepository = parkingSpotRepository;
    }

}
