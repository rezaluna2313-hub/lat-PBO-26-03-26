/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.pkg26.pkg03.pkg2026;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author User
 */
public class lat_BR {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Nilai 1: ");
        double n1 = Double.parseDouble(br.readLine());

        System.out.print("Nilai 2: ");
        double n2 = Double.parseDouble(br.readLine());

        System.out.print("Nilai 3: ");
        double n3 = Double.parseDouble(br.readLine());

        double rata = (n1 + n2 + n3) / 3;

        System.out.println("Rata-rata kamu: " + rata);

        if (rata >= 60) {
            System.out.println("Keren! :-)");
        } else {
            System.out.println("Semangat ya :-(");
        }
    }
}

