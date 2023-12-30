



public class PastryFromStringPastryFactory extends PastryFactory {
    private String pastryName;

    public PastryFromStringPastryFactory(String pastryName) {
        this.pastryName = pastryName;
    }

    @Override
    public Pastry create() {
        switch (pastryName.toUpperCase()) {
            case "CROISSANT":
                return new Croissant();
            case "COOKIE":
                return new Cookie();
            default:
                throw new IllegalArgumentException();
        }
    }
}


