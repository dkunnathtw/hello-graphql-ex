package com.example.graphql.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloGraphqlApplicationTests {

	@Test
	void one() {
		assertEquals(BigDecimal.ONE, new BigDecimal(1));
	}

}
