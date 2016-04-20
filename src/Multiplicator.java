public class Multiplicator {
    public static int mul(int x, int y){
        int accumulator = 0;
        for(int i = 0; i < y; i++) {
            accumulator = add(accumulator, x);
        }
        return accumulator;
    }
    public static int add(int x, int y) {
        return x + y;
    }
}
