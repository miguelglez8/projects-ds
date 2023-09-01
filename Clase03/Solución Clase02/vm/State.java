package vm;

// Versión sin control de errores

public class State {

    public int getIP() {
        return ip;
    }

    public void setIP(int ip) {
        this.ip = ip;
    }

    public void push(int value) {
        heap[sp++] = value;
    }

    public int pop() {
        return heap[--sp];
    }

    public int read(int direccion) {
        return memory[direccion];
    }

    public void write(int direction, int value) {
        memory[direction] = value;
    }

    private int[] memory = new int[1024];
    private int[] heap = new int[32];

    private int ip = 0, sp = 0;
}
