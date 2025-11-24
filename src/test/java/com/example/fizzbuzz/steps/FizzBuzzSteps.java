package com.example.fizzbuzz.steps;

import com.example.fizzbuzz.FizzBuzz;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzSteps {
    private int number;
    private String actual;

    @Given("the number {int}")
    public void the_number(Integer n) {
        this.number = n;
    }

    @When("I evaluate FizzBuzz")
    public void i_evaluate_fizzbuzz() {
        this.actual = FizzBuzz.evaluate(number);
    }

    @Then("the output should be \"{string}\"")
    public void the_output_should_be(String expected) {
        assertEquals(expected, actual, () -> "Expected '" + expected + "' but got '" + actual + "' for number " + number);
    }
}
