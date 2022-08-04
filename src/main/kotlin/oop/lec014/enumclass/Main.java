package oop.lec014.enumclass;

public class Main {
    public static void main(String[] args) {
        handleCountry(JavaCountry.KOREA);
    }

    private static void handleCountry(JavaCountry country) {
        if (country == JavaCountry.KOREA) {
            // 로직...
        } else if (country == JavaCountry.AMERICA) {
            // 로직...
        }

        switch (country) {
            case KOREA:
                System.out.println(country + "/KR");
                break;
            case AMERICA:
                System.out.println(country + "/USA");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + country);
        }
    }
}
