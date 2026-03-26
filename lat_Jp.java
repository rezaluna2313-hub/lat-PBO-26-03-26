/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.pkg26.pkg03.pkg2026;
import javax.swing.*;
/**
 *
 * @author User
 */
public class lat_Jp {
      public static void main(String[] args) {

        // INPUT (JOptionPane)
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Nilai 1:"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Nilai 2:"));
        int n3 = Integer.parseInt(JOptionPane.showInputDialog("Nilai 3:"));

        // PROSES
        double rata = (n1 + n2 + n3) / 3.0;
        String hasil;

        if (rata > 60) {
            hasil = "Rata-rata: " + rata + " :)";
        } else {
            hasil = "Rata-rata: " + rata + " :(";
        }

        // OUTPUT (JOptionPane)
        JOptionPane.showMessageDialog(null, hasil);
    }
}
