package com.spring.reactive.controller;

import com.spring.reactive.domain.Car;
import com.spring.reactive.domain.CarEvents;
import com.spring.reactive.service.FluxCarService;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Controller
@RequestMapping(path = "/car-trivial")
public class CarControllerTrivial {

    private final FluxCarService fluxCarService;

    CarControllerTrivial(FluxCarService fluxCarService) {
        this.fluxCarService = fluxCarService;
    }

    @GetMapping("/cars")
    public Flux<Car> all() {
        return fluxCarService.all();
    }

    @GetMapping("/cars/{carId}")
    public Mono<Car> byId(@PathVariable String carId) {
        return fluxCarService.byId(carId);
    }

    @GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE, value = "/cars/{carId}/events")
    public Flux<CarEvents> eventsOsStrams(@PathVariable String carId) {
        return fluxCarService.streams(carId);
    }
}
