//LEGGERE LE ISTRUZIONI NEL FILE README.md

//Import di Classi Java necessarie al funzionamento del programma
import java.util.Scanner;

// Classe principale, con metodo main
class Esercizio {
    
    private static Random random = new Random();
    private static Scanner input = new Scanner(System.in);

    // Il programma parte con una chiamata a main().
    public static void main(String[] args) {
        int n, i, j, n1;
        
        do {
            n = input.nextInt();
        }
        while (n <= 0);
        i = 0;
        j = 0;
        n1 = 0;
        int[] v = new int[n * 25];
        
        do {
            n1 = insVettore(v, n1, n1, (random.nextInt(8) + 3) * 10);
            while (j < n1) {
                if (v[i] > v[j]) {
                    n1 = eliminaVettore(v, j, n1);
                }
                j = j + 1;
            }
            i = i + 1;
            System.out.println("Stanno bevenedo: " + n1 + " animali");
        }
        while (i < n);
        n1 = rimuoviDuplicati(v, n1);
        visualizzaVettore(v, n1);
    }
    
    public static int eliminaVettore(int[] v, int ie, int n) {
        int i, n2;
        
        n2 = n - 1;
        i = ie;
        while (i <= n - 2) {
            v[i] = v[i + 1];
            i = i + 1;
        }
        
        return n2;
    }
    
    public static int insVettore(int[] v, int n, int ie, int e) {
        int i, n2;
        
        n2 = n + 1;
        i = n2 - 1;
        while (i >= ie + 1) {
            v[i] = v[i - 1];
            i = i - 1;
        }
        v[ie] = e;
        
        return n2;
    }
    
    public static int rimuoviDuplicati(int[] v, int n) {
        int i, j;
        
        i = 0;
        while (i <= n - 2) {
            j = i + 1;
            while (j <= n - 1) {
                if (v[i] == v[j]) {
                    System.out.println("Elimino " + v[j] + " da cella " + j);
                    n = eliminaVettore(v, n, j);
                } else {
                    j = j + 1;
                }
            }
            i = i + 1;
        }
        
        return n;
    }
    
    public static void visualizzaVettore(int[] v, int n) {
        int i;
        
        i = 0;
        while (i < n) {
            System.out.println(Integer.toString(i) + ": " + v[i]);
            i = i + 1;
        }
    }
}

//LEGGERE LE ISTRUZIONI NEL FILE README.md