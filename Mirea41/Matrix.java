package com.Mirea41;

import java.util.ArrayList;
import java.util.Scanner;

public class Matrix {
    private ArrayList<ArrayList<Double>> ar = new ArrayList<>();
    private int column;
    private int line;

    public Matrix(int column, int line) {
        this.column = column;
        this.line = line;
        for (int i = 0; i < line; i++) {
            ar.add(new ArrayList<>());
        }
        var in = new Scanner(System.in);
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                ar.get(i).add(in.nextDouble());
            }
        }
    }

    public Matrix(ArrayList<ArrayList<Double>> ar, int column, int line) {
        this.ar = ar;
        this.column = column;
        this.line = line;
    }

    public Matrix plusMatrix(Matrix other){
        ArrayList<ArrayList<Double>> array = new ArrayList<>();
        for (int i = 0; i < this.line; i++) {
            array.add(new ArrayList<>());
        }
        for (int i = 0; i < this.line ; i++) {
            for (int j = 0; j < this.column; j++) {
                array.get(i).add(this.ar.get(i).get(j) + other.ar.get(i).get(j));
            }
        }
        return new Matrix(array, this.column, this.line);
    }

    public Matrix multiMatrix(double other){
        ArrayList<ArrayList<Double>> array = new ArrayList<>();
        for (int i = 0; i < this.line; i++) {
            array.add(new ArrayList<>());
        }
        for (int i = 0; i < this.line ; i++) {
            for (int j = 0; j < this.column; j++) {
                array.get(i).add(this.ar.get(i).get(j) * other);
            }
        }
        return new Matrix(array, this.column, this.line);
    }

    public int getColumn() {
        return column;
    }

    public int getLine() {
        return line;
    }

    @Override
    public String toString() {
        return "Matrix{" +
                "ar=" + ar +
                ", column=" + column +
                ", line=" + line +
                '}';
    }
}
