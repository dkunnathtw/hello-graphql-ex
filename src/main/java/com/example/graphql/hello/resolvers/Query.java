package com.example.graphql.hello.resolvers;

import java.util.Arrays;
import java.util.List;

import com.example.graphql.hello.model.Car;

import org.springframework.stereotype.Component;

import graphql.kickstart.tools.GraphQLQueryResolver;

@Component
public class Query implements GraphQLQueryResolver {

    public List<Car> cars() {

        var car1 = Car.builder()
            .make("Audi")
            .model("RS4")
            .vin("WUARU78E87N903887")
            .build();

        var car2 = Car.builder()
            .make("Mercedes-Benz")
            .model("E63 AMG S Wagon")
            .vin("WDDHH7GB4FB123279")
            .build();

        return Arrays.asList(car1, car2);

    }

}
