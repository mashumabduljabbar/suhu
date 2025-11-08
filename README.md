# 🌡️ Program Konversi Suhu (Celsius → Fahrenheit & Kelvin)

## 👤 Identitas
- **Nama:** [Isi Nama]  
- **NIM:** [Isi NIM]  
- **Mata Kuliah:** Algoritma dan Pemrograman  

---

## 🧠 Deskripsi
Program ini mengonversi suhu dari **Celsius** ke **Fahrenheit** dan **Kelvin** menggunakan **JOptionPane** untuk input dan output.  
Langkah program:
1. Pengguna memasukkan suhu dalam °C  
2. Program menghitung konversi  
3. Hasil ditampilkan dalam kotak dialog  

---

## 💻 Cuplikan Kode
```java
import javax.swing.JOptionPane;

public class KonversiSuhu {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Masukkan suhu (°C):");
        double c = Double.parseDouble(input);
        double f = (c * 9 / 5) + 32;
        double k = c + 273.15;
        String hasil = "Fahrenheit: " + f + "\nKelvin: " + k;
        JOptionPane.showMessageDialog(null, hasil, "Hasil Konversi", JOptionPane.INFORMATION_MESSAGE);
    }
}
```

---

## 🔍 Hasil Uji Coba

### 💡 Input
![Input Dialog](sc1.jpg)

### 📊 Output
![Output Dialog](sc2.jpg)

---

## ✅ Kesimpulan
Program berhasil dijalankan dan menampilkan hasil konversi dengan benar.  
Penggunaan **JOptionPane** mempermudah interaksi dengan pengguna tanpa console.

---

📘 *Contoh ini dijadikan referensi untuk tugas berikutnya: Kalkulator BMI dengan JOptionPane.*
