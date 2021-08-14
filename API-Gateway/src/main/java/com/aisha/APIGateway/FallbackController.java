package com.aisha.APIGateway;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class FallbackController {
	@RequestMapping("/orderServiceCallback")
	public Mono<String> orderServiceCallback(){
		return Mono.just("Order service is taking too much time to respond or it is down. please try after sometime");
	}

	@RequestMapping("/paymentServiceCallback")
	public Mono<String> paymentServiceCallback(){
		return Mono.just("Payment service is taking too much time to respond or it is down. please try after sometime");
	}
}
