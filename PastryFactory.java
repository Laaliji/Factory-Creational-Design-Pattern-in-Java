


public abstract class PastryFactory {
    public abstract Pastry create();

    public Pastry getBakedPastry(int temperatureInCelsius, int timeInSeconds) {
        Pastry result = create();
        result.bake(temperatureInCelsius, timeInSeconds);
        return result;
    }
}

