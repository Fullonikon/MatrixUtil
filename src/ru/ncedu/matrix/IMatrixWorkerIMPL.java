package ru.ncedu.matrix;

import static java.lang.Math.max;

public class IMatrixWorkerIMPL implements IMatrixWorker {

    @Override
    public void print(double[][] m) {
        for (double[] doubles : m) {
            for (double aDouble : doubles) {
                System.out.print(aDouble + "\t");
            }
            System.out.println();
        }
    }

    @Override
    public boolean haveSameDimension(double[][] m1, double[][] m2) {
        return m1.length == m2.length && m1[0].length == m2[0].length;
    }

    @Override
    public double[][] add(double[][] m1, double[][] m2) {
        double[][] res = new double[max(m1.length, m2.length)][max(m1[0].length, m2[0].length)];

        for (int i = 0; i < m1.length; i++)
            for (int j = 0; j < m1[0].length; j++){
                res[i][j] += m1[i][j];
            }

        for (int i = 0; i < m2.length; i++)
            for (int j = 0; j < m2[0].length; j++){
                res[i][j] += m2[i][j];
            }

        return res;
    }

    @Override
    public double[][] subtract(double[][] m1, double[][] m2) {
        double[][] res = new double[max(m1.length, m2.length)][max(m1[0].length, m2[0].length)];

        for (int i = 0; i < m1.length; i++)
            for (int j = 0; j < m1[0].length; j++){
                res[i][j] += m1[i][j];
            }

        for (int i = 0; i < m2.length; i++)
            for (int j = 0; j < m2[0].length; j++){
                res[i][j] -= m2[i][j];
            }

        return res;
    }

    @Override
    public double[][] multiply(double[][] m1, double[][] m2) {
        int m1ColLength = m1[0].length;
        int m2RowLength = m2.length;
        if(m1ColLength != m2RowLength) throw new ArithmeticException(); //Can't multiply
        int mRRowLength = m1.length;
        int mRColLength = m2[0].length;
        double[][] res = new double[mRRowLength][mRColLength];
        for(int i = 0; i < mRRowLength; i++) {
            for(int j = 0; j < mRColLength; j++) {
                for(int k = 0; k < m1ColLength; k++) {
                    res[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return res;
    }
}
