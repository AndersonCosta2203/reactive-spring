package com.spring.reactive.controller;

import com.spring.reactive.route.RouteHandles;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;

@RestController
@RequestMapping(path = "/car-reactive")
public class CarController {

/*    @Bean
    RouterFunction<?> routes(RouteHandles routeHandles) {
        return RouterFunctions.route(
                RequestPredicates.GET("/cars"), routeHandles::allCars)
                .andRoute(RequestPredicates.GET("/cars/{carId}"), routeHandles::carById)
                .andRoute(RequestPredicates.GET("/cars/{carId}/events"), routeHandles::events);
    }*/
}
