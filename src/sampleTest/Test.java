package sampleTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class NameValidator {
	public boolean validateName(String name) throws Exception {
		if(name.isBlank()) 
			return false;
		else 
			return true;
	}
}

public class Test {
    @Tag("dev 1")
    @Test
    public void validateNameValidTest() throws Exception {
        String name = "Sam";
        NameValidator nameValidator = new NameValidator ();
        Assertions.assertTrue(nameValidator.validateName(name));
    }
    @Tag("dev")
    @Test
    public void validateBoothDetailsInvalidTest1() throws Exception {
        String name = "";
        NameValidator nameValidator = new NameValidator ();
        Assertions.assertTrue(nameValidator.validateName(name));
    }
}