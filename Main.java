
public class Main {
    public static void main(String[] args) {
        // Create a RandomPastryFactory
        PastryFactory randomPastryFactory = new RandomPastryFactory();

        // Create a random pastry without baking
        Pastry randomPastry = randomPastryFactory.create();
        System.out.println("Random Pastry Type: " + randomPastry.getClass().getSimpleName());

        // Create and bake a random pastry
        Pastry randomBakedPastry = randomPastryFactory.getBakedPastry(180, 300);
        System.out.println("Random Baked Pastry Type: " + randomBakedPastry.getClass().getSimpleName());

        // Create a PastryFromStringPastryFactory for a cookie
        PastryFactory fromStringPastryFactory = new PastryFromStringPastryFactory("cookie");

        // Create a pastry from the factory
        Pastry pastryFromString = fromStringPastryFactory.create();
        System.out.println("Pastry from String Type: " + pastryFromString.getClass().getSimpleName());

        // Create another pastry from the factory using a one-time syntax
        Pastry anotherPastryFromString = new PastryFromStringPastryFactory("CROISSANT").create();
        System.out.println("Another Pastry from String Type: " + anotherPastryFromString.getClass().getSimpleName());
    }
}
