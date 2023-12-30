



import java.util.Random;

public class RandomPastryFactory extends PastryFactory {
    @Override
    public Pastry create() {
        int randomNumber = new Random().nextInt(3) + 1;

        switch (randomNumber) {
            case 1:
                return new Croissant();
            case 2:
                return new Cookie();
            default:
                throw new IllegalArgumentException();
        }
    }
}
