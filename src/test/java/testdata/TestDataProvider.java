package testdata;

import com.github.javafaker.Faker;


public class TestDataProvider {
    private static final Faker FAKER = new Faker();


    public static String getRandomName() {
        return FAKER.name().name();
    }


    public static String getRandomPassword() {
        return FAKER.internet().password();
    }


    public static String getRandomEmail() {
        return FAKER.internet().emailAddress();
    }

}
