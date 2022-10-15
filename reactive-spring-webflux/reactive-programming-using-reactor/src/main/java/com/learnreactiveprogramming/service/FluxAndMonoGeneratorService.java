package com.learnreactiveprogramming.service;

import ch.qos.logback.core.net.SyslogOutputStream;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class FluxAndMonoGeneratorService {


    public Mono<String> names(){
        return Mono.just("nehal")
                .map(s->s.toUpperCase())
                .log();
    }

    public Flux<String> getNames(String name){
        var charArray = name.split("");
        return Flux.fromArray(charArray);
    }

    public static void main(String[] args) {
        FluxAndMonoGeneratorService obj = new FluxAndMonoGeneratorService();
        obj.names().subscribe(names->{
            System.out.println("Momno name is"+names);
        });
    }
}
