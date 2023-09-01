public class MyStringBuffer {
    private char[] buffer;
    private int length;

    public MyStringBuffer() {
        buffer = new char[16];
        length = 0;
    }

    public MyStringBuffer(String str) {
        buffer = new char[str.length() + 16];
        length = str.length();
        System.arraycopy(str.toCharArray(), 0, buffer, 0, length);
    }

    public int length() {
        return length;
    }

    public void append(String str) {
        ensureCapacity(length + str.length());
        System.arraycopy(str.toCharArray(), 0, buffer, length, str.length());
        length += str.length();
    }

    private void ensureCapacity(int capacity) {
        if (capacity > buffer.length) {
            int newCapacity = Math.max(buffer.length * 2, capacity);
            char[] newBuffer = new char[newCapacity];
            System.arraycopy(buffer, 0, newBuffer, 0, length);
            buffer = newBuffer;
        }
    }

    @Override
    public String toString() {
        return new String(buffer, 0, length);
    }

    public static void main(String[] args) {
        MyStringBuffer sb1 = new MyStringBuffer();
        sb1.append("Hello, ");
        sb1.append("World!");

        MyStringBuffer sb2 = new MyStringBuffer("Java ");
        sb2.append("is ");
        sb2.append("awesome!");

        System.out.println("sb1: " + sb1);
        System.out.println("sb2: " + sb2);
    }
}
