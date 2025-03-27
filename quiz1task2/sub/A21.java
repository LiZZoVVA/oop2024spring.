package sub;

public class A21 {
    private int length;
    private int width;

    public A21(int length, int width) {
        this.length = length;
        this.width = width;
    }
    public int calculateArea() {
        return length * width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
}
