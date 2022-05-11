package oop.labor06.labor6_2;


public class Matrix {

    private int rows;
    private int columns;
    double[][] data;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        data = new double[rows][columns];
    }

    public Matrix(double[][] data) {
        this.data = data;
    }

    public Matrix(Matrix matrix) {
        this.rows = matrix.rows;
        this.columns = matrix.columns;
        this.data = matrix.data;
    }

    public void fillRandom(double min, double max) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                data[i][j] = (Math.random() * (max - min)) + max;
            }
        }
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public void printMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static Matrix add(Matrix matrix1, Matrix matrix2) {
        if (matrix1.columns != matrix2.columns || matrix1.rows != matrix2.rows)
            return null;
        Matrix result = new Matrix(matrix1.rows, matrix1.columns);
        for (int i = 0; i < result.rows; i++) {
            for (int j = 0; j < result.columns; j++) {
                result.data[i][j] = matrix1.data[i][j] + matrix2.data[i][j];
            }
        }
        return result;
    }

  public static Matrix multiply(Matrix matrix1, Matrix matrix2){
       if (matrix1.columns != matrix2.rows)
            return null;
        Matrix result = new Matrix(matrix1.rows, matrix2.columns);
       double aux = 0;
       for (int i = 0; i < matrix1.columns; i++) {
            for (int j = 0; j < matrix2.rows; j++) {
                aux += matrix1.data[i][j]*matrix2.data[j][i];
            }

        }
       return result;
    }

    public static Matrix transpose(Matrix matrix){
        Matrix result = new Matrix(matrix.columns, matrix.rows);
        for (int i = 0; i < matrix.rows; i++) {
            for (int j = 0; j < matrix.columns; j++) {
                result.data[j][i] = matrix.data[i][j];
            }
        }
        return result;
    }

}

