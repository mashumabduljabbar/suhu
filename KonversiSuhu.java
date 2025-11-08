// Contoh dasar (JOptionPane)
import javax.swing.JOptionPane;

public class KonversiSuhu {
    public static void main(String[] args) {
        String inputCelsius = JOptionPane.showInputDialog("Masukkan suhu dalam Celsius:");
        double suhuC = Double.parseDouble(inputCelsius);
        double suhuF = (suhuC * 9 / 5) + 32;
        double suhuK = suhuC + 273.15;
        String hasil = "Suhu dalam Fahrenheit: " + suhuF + "\nSuhu dalam Kelvin: " + suhuK;
        JOptionPane.showMessageDialog(null, hasil, "Hasil Konversi", JOptionPane.INFORMATION_MESSAGE);
    }
}
