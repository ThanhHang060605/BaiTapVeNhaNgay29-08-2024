/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitapvenhangay29_08;

import java.util.Scanner;

public class BaiTapVeNhaNgay29_08 {

    public static float[] importData(float[] arrays) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arrays.length; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            arrays[i] = sc.nextFloat();
        }
        return arrays;

    }

    public static void printData(float[] arrays) {
        System.out.println("Mang vua nhap la: ");
        for (float num : arrays) {
            System.out.println(num + " ");
        }
    }

    public static float finMax2(float[] arrays) {
        if (arrays.length < 2) {
            System.out.println("Mang khong du dieu kien de tim max2");
            return Float.NaN;
        }
        float max1 = Float.MIN_VALUE;
        float max2 = Float.MIN_VALUE;

        for (float num : arrays) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2 && num != max1) {
                max2 = num;
            }
        }

        if (max2 == Float.MIN_VALUE) {
            System.out.println("Khong co gia tri lon thu hai trong mang.");
            return Float.NaN;
        }

        return max2;
    }

    public static float[] deleteOddNumber(float[] arrays) {
        int countEven = 0;

        for (float num : arrays) {
            if (num % 2 == 0) {
                countEven++;
            }
        }

        float[] evenArray = new float[countEven];
        int index = 0;
        for (float num : arrays) {
            if (num % 2 == 0) {
                evenArray[index++] = num;
            }
        }
        return evenArray;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu mang: ");
        int n = sc.nextInt();
        float[] arrays = new float[n];

        arrays = importData(arrays);

        printData(arrays);
        
        float max2 = finMax2(arrays);
        if (!Float.isNaN(max2)) {
            System.out.println("Gia tri lon thu 2 trong mang: " + max2);           
        }
        
        arrays = deleteOddNumber(arrays);
        
        System.out.println("Mang sau khi xoa cac phan tu le");
        printData(arrays);
    }

}
