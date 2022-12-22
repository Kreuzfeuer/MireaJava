package com.Mirea41;

import java.util.ArrayList;
import java.util.Scanner;

public class MatrixTest {
    public static void main(String[] args) {
        ArrayList<ArrayList<Double>> ar = new ArrayList<>();
        var in = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            ar.add(new ArrayList<>());
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ar.get(i).add(in.nextDouble());
            }
        }
        var mat1 = new Matrix(ar,3,3);
        System.out.println(mat1);
        var mat2 = mat1.multiMatrix(2);
        System.out.println(mat2);
        var mat3 = mat1.plusMatrix(mat2);
        System.out.println(mat3);
    }
}
