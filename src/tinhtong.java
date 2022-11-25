public class tinhtong extends Thread {
    int[] a = new int[10000];
    int sl = 0;
    int n1 = 0;
    int n2 = 0;
    String name = "";

    Thread t;

    int sum = 0;
    int count = 0;

    tinhtong(int[] x, int n, int nx, int ny, String name1) {
        n1 = nx;
        n2 = ny;
        sl = n;
        name = name1;
        for (int i = 0; i < n; i++) {
            a[i] = x[i];
        }
    }

    public void setdata(int n1, int n) {

        this.sl = n;
        this.n1 = n1;
    }

    public int tong(int n1, int n2) {

        int tong = 0;
        for (int i = n1; i < n2; i++) {
            if (a[i] % 3 == 0) {
                tong += a[i];
                System.out.println(name + ": " + a[i]);
                count++;
            }

        }

        return tong;

    }

    public void printkq() {
        System.out.println(name + " tong: = " + sum + " Sl = " + count);
    }

    public void run() {

        sum = tong(n1, n2);

    }

}
