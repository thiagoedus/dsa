public class Main
{
    public static void hanoi(int n, char a , char b, char c) {
        if (n > 0) {
            hanoi(n-1, a, c, b);
            System.out.println("Mover o disco do topo de " + a + " para o topo de " + b);
            hanoi(n-1, c, b, a);
        }
    }
	public static void main(String[] args) {
		hanoi(3, 'A', 'B', 'C');
	}
}

