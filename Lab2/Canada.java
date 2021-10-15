package Lab2;

public class Canada {
    private final Province[] provinces;

    public Canada() {
        this.provinces = new Province[]{
                new Province("Alberta", "Edmonton", 4_067_175),
                new Province("British Columbia", "Victoria", 4_648_055),
                new Province("Manitoba", "Winnipeg", 1_278_365),
                new Province("New Brunswick", "Fredericton", 747_101),
                new Province("Newfoundland and Labrador", "St. John’s", 519_716),
                new Province("Nova Scotia", "Halifax", 923_598),
                new Province("Ontario", "Toronto", 13_448_494),
                new Province("Prince Edward Island", "Charlottetown", 142_907),
                new Province("Quebec", "Québec", 8_164_361),
                new Province("Saskatchewan", "Regina",1_098_352),
        };
    }

    public void displayAllProvinces() {
        for (Province province: this.provinces) {
            System.out.println(province.getDetails());
        }
    }

    public int getNumOfProvincesBetween(int min, int max) {
        int num = 0;
        for (Province province: this.provinces) {
            if (province.getPopulation() >= (long) min * 1000 * 1000 && province.getPopulation() <= (long) max * 1000 * 1000) {
                num++;
            }
        }

        return num;
    }
}
