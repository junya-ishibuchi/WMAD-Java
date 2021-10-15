package Lab2;

import java.util.Arrays;

public class Province {
    private final String[] PROVINCE = {
            "Alberta",
            "British Columbia",
            "Manitoba",
            "New Brunswick",
            "Newfoundland and Labrador",
            "Nova Scotia",
            "Ontario",
            "Prince Edward Island",
            "Quebec",
            "Saskatchewan",
    };
    private final String[] CAPITAL = {
            "Edmonton",
            "Victoria",
            "Winnipeg",
            "Fredericton",
            "St. John’s",
            "Halifax",
            "Toronto",
            "Charlottetown",
            "Québec",
            "Regina",
    };

    private final long DEFAULT_POPULATION = 4_648_055;
    private final String DEFAULT_PROVINCE = "British Columbia";
    private final String DEFAULT_CAPITAL = "Victoria";


    private String name;
    private String capital;
    private long population;


    public Province(String name, String capital, long population) {
        if (isValidProvince(name) && isValidCapitalCity(capital) && isValidPopulation(population)) {
            this.name = name;
            this.capital = capital;
            this.population = population;
        } else {
            this.population = DEFAULT_POPULATION;
            this.name = DEFAULT_PROVINCE;
            this.capital = DEFAULT_CAPITAL;
        }
    }

    private boolean isValidPopulation(long population) {
        return population >= 30_000 && population <= 15_000_000;
    }

    private boolean isValidProvince(String province) {
        return Arrays.asList(PROVINCE).contains(province);
    }

    private boolean isValidCapitalCity(String capital) {
        return Arrays.asList(CAPITAL).contains(capital);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public String getDetails() {
        return "The capital of " + getName() + " (population. " + getPopulation() + ") is " + getCapital() + ".";
    }
}
