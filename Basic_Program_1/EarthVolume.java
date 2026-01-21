public class EarthVolume {
    public static void main(String[] args) {

        double radiusKm = 6378;              // radius of Earth in km
        double pi = 3.14159265359;

        // Volume in cubic kilometers
        double volumeKm3 = (4.0 / 3.0) * pi * radiusKm * radiusKm * radiusKm;

        // Convert km³ to miles³ (1 km = 0.621371 miles)
        double kmToMiles = 0.621371;
        double volumeMiles3 = volumeKm3 * Math.pow(kmToMiles, 3);

        System.out.println("The volume of Earth in cubic kilometers is " + volumeKm3);
        System.out.println("The volume of Earth in cubic miles is " + volumeMiles3);
    }
}