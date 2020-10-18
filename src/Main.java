import ru.ncedu.matrix.IMatrixWorkerIMPL;

public class Main {
    public static void main(String[] args) {
        double[][] a = new double[1][3];
        double[][] b = new double[2][1];
        double[][] c;
        double[][] d = new double[3][5];
        for (int i = 0; i<a.length; i++)
            for (int j = 0; j<a[0].length; j++)
            {
                a[i][j]=i+j+1;
            }
        for (int i = 0; i<b.length; i++)
            for (int j = 0; j<b[0].length; j++)
            {
                b[i][j]=i+j+1;
            }
        for (int i = 0; i<d.length; i++)
            for (int j = 0; j<d[0].length; j++)
            {
                d[i][j]=j - i*j + 5;
            }
        IMatrixWorkerIMPL w = new IMatrixWorkerIMPL();
        w.print(a);
        System.out.println("= Matrix a");
        w.print(b);
        System.out.println("= Matrix b");
        w.print(d);
        System.out.println("= Matrix d");
        c = w.add(a, b);
        w.print(c);
        System.out.println("= a+b");
        c = w.subtract(a, b);
        w.print(c);
        System.out.println("= a-b");
        w.print(d);
        c = w.multiply(a, d);
        w.print(c);
        System.out.println("= a*d");
        System.out.println(w.haveSameDimension(a, b) + ": dim(a)=dim(b)");
        //c = w.multiply(a, b);
    }
}
