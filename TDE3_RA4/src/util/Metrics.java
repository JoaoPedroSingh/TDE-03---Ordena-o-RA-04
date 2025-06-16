package util;

public class Metrics {
    public long swaps = 0;
    public long iterations = 0;
    public long timeNano = 0;

    public void reset() {
        swaps = 0;
        iterations = 0;
        timeNano = 0;
    }
}