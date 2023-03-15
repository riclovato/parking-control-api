package com.api.parkingcontrol.controllers;

import com.api.parkingcontrol.services.ParkingSpotService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
O parâmetro origins especifica uma lista de domínios separados por vírgulas que são permitidos acessar o recurso. O valor "*" significa que todos os domínios são permitidos.

O parâmetro maxAge especifica o tempo em segundos que o navegador deve armazenar em cache as informações sobre as permissões de acesso do recurso.

Essa anotação é útil em situações em que um aplicativo cliente precisa acessar um serviço RESTful em um domínio diferente. Sem essa anotação, o navegador do cliente bloquearia a solicitação devido à política de mesma origem.

 */
@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/parking-spot")
public class ParkingSpotController {

    final ParkingSpotService parkingSpotService;

    public ParkingSpotController(ParkingSpotService parkingSpotService) {
        this.parkingSpotService = parkingSpotService;
    }
}
