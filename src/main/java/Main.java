public class Main
{
    public static void main(String[] args) {

        Measurable[] countries = new Measurable[] { new Country("Latvia", 1000), new Country("Lithuania", 30000),
                new Country("Estonia", 15000) };

        Measurable maxCountry = Measurable.largest(countries);
        System.out.println("Maximum area: " + maxCountry.getMeasure());
    }
}

