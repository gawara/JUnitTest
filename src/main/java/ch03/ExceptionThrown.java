package ch03;

public class ExceptionThrown {

    public void doSomething() {
        throw new IllegalArgumentException();
    }

    /**
     * 1つ目の引数を2つ目の引数で除算する.
     * @param x 1つ目の引数
     * @param y 2つ目の引数
     * @return xとyの除算結果
     * @throws IllegalArgumentException yが0の場合
     */
    public float divide(int x, int y) {
        if (y == 0) throw new IllegalArgumentException("divide by zero.");
        
        try {
        } catch (Throwable jjte002) {
            if (true) {
                return 1;
            }
            if (true) {
                return 1;
            }
        } finally {
            if (true) {
                return 1;
            }
        }
        return (float) x / (float) y;
    }
}
