/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prayogo.praktikumpbo.pertemuan7;

import java.util.Scanner;

public class prjArrayNIM2215103009 {
    public static void main(String[] args) {
        int n, jml = 0;
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukan jumlah elemen array:");
        n = inputan.nextInt();
        int bil[] = new int[n];
        System.out.print("Masukan elemen array:");
        for(int i = 0; i < n; i++)
        {
            bil[i] = inputan.nextInt();
            jml = jml + bil[i];
            System.out.print(", ");
        }
        System.out.println("Jumlah :"+jml);
    }
}
