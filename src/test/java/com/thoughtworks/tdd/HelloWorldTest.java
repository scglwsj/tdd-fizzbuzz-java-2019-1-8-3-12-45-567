package com.thoughtworks.tdd;

import com.thoughtworks.tdd.Dependency;
import com.thoughtworks.tdd.HelloWorld;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class HelloWorldTest {

    @BeforeAll
    static void initTestEnv() {
    }

    @BeforeEach
    void initEveryMethod() {
    }


    @Test
    @DisplayName("try display name")
    public void hello_world_test() {
        //given
        Dependency dependency = new Dependency();
        HelloWorld helloWorld = new HelloWorld(dependency);

        //when
        String actual = helloWorld.beenCalled();

        //then
        assertThat(actual, is("Leave me alone."));
    }

    @Test
    public void should_be_mocked() {
        //given
        Dependency dependency = mock(Dependency.class);
        when(dependency.say()).thenReturn("Hello World");
        HelloWorld helloWorld = new HelloWorld(dependency);

        //when
        String actual = helloWorld.beenCalled();

        //then
        assertThat(actual, is("Hello World"));
    }

    @Test
    public void fizzBuzz_should_return_1_when_give_1() {
        //given
        Dependency dependency = new Dependency();

        //when
        String out = dependency.fizzBuzz(1);

        //then
        assertThat(out, is("1"));
    }

    @Test
    public void fizzBuzz_should_return_2_when_give_2() {
        //given
        Dependency dependency = new Dependency();

        //when
        String out = dependency.fizzBuzz(2);

        //then
        assertThat(out, is("2"));
    }

    @Test
    public void fizzBuzz_should_return_Fizz_when_give_3() {
        //given
        Dependency dependency = new Dependency();

        //when
        String out = dependency.fizzBuzz(3);

        //then
        assertThat(out, is("Fizz"));
    }

    @Test
    public void fizzBuzz_should_return_4_when_give_4() {
        //given
        Dependency dependency = new Dependency();

        //when
        String out = dependency.fizzBuzz(4);

        //then
        assertThat(out, is("4"));
    }

    @Test
    public void fizzBuzz_should_return_Buzz_when_give_5() {
        //given
        Dependency dependency = new Dependency();

        //when
        String out = dependency.fizzBuzz(5);

        //then
        assertThat(out, is("Buzz"));
    }

    @Test
    public void fizzBuzz_should_return_Fizz_when_give_6() {
        //given
        Dependency dependency = new Dependency();

        //when
        String out = dependency.fizzBuzz(6);

        //then
        assertThat(out, is("Fizz"));
    }

    @Test
    public void fizzBuzz_should_return_Whizz_when_give_7() {
        //given
        Dependency dependency = new Dependency();

        //when
        String out = dependency.fizzBuzz(7);

        //then
        assertThat(out, is("Whizz"));
    }

    @Test
    public void fizzBuzz_should_return_Buzz_when_give_10() {
        //given
        Dependency dependency = new Dependency();

        //when
        String out = dependency.fizzBuzz(10);

        //then
        assertThat(out, is("Buzz"));
    }

    @Test
    public void fizzBuzz_should_return_Whizz_when_give_14() {
        //given
        Dependency dependency = new Dependency();

        //when
        String out = dependency.fizzBuzz(14);

        //then
        assertThat(out, is("Whizz"));
    }

    @Test
    public void fizzBuzz_should_return_FizzBuzz_when_give_15() {
        //given
        Dependency dependency = new Dependency();

        //when
        String out = dependency.fizzBuzz(15);

        //then
        assertThat(out, is("FizzBuzz"));
    }

    @Test
    public void fizzBuzz_should_return_FizzWhizz_when_give_21() {
        //given
        Dependency dependency = new Dependency();

        //when
        String out = dependency.fizzBuzz(21);

        //then
        assertThat(out, is("FizzWhizz"));
    }

    @Test
    public void fizzBuzz_should_return_BuzzWhizz_when_give_35() {
        //given
        Dependency dependency = new Dependency();

        //when
        String out = dependency.fizzBuzz(35);

        //then
        assertThat(out, is("BuzzWhizz"));
    }
}
