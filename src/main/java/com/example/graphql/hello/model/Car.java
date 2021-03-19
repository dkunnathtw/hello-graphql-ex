package com.example.graphql.hello.model;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Car {

    private final String vin;
    private final String make;
    private final String model;
    
}
