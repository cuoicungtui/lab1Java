import java.util.ArrayList;

public class App {

    public static int n = 0;

    static public int[] a = new int[1000];

    public static void main(String[] args) throws Exception {

        System.out.print("N = ");

        n = Integer.parseInt(System.console().readLine());

        for (int i = 0; i < n; i++) {

            a[i] = (int) (Math.random() * 100) + 100;
        }

        // tinhtong t1 = new tinhtong(a, n, 0, n/2, "T1");
        // t1.start();

        // tinhtong t2 = new tinhtong(a, n, n/2, n, "T2");
        // t2.start();
        // t1.join();
        // t2.join();

        // System.out.println(t1.name+ " tong: = "+t1.sum+" Sl = "+t1.count);
        // System.out.println(t2.name+ " tong: = "+t2.sum+" Sl = "+t2.count);

        System.out.print("K = ");
        int k = Integer.parseInt(System.console().readLine());
        int n1 = 0;
        int n2 = n / k;
        int step = n / k;

        ArrayList<tinhtong> tinh = new ArrayList<tinhtong>();

       // tinh.add(k, null);   
         
        for (int i = 0; i < k; i++) {

            tinhtong t1 = new tinhtong(a, n, n1, n2, "T"+String.valueOf(i));
            tinh.add(i, t1); 
            n1 = n2;
            n2 += step;

        }
        for(int i=0;i<k;i++){

            tinh.get(i).start();

        }
        for(int i=0;i<k;i++){

            tinh.get(i).join();
        }

        for(int i=0;i<k;i++){

            tinh.get(i).printkq();
        }
    }

}
