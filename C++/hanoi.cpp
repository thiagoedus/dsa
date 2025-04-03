#include <iostream>

using namespace std;

void hanoi(int n, char a, char b, char c) {
    if (n > 0) {
        hanoi(n-1, a, c, b);
        cout << "Mover o disco do topo de " << a << " para " << b << endl;
        hanoi(n-1, c, b, a);
    }
}

int main()
{
    hanoi(3, 'A', 'B', 'C');

    return 0;
}
