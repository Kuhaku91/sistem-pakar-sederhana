main package aplikasi.mobile.sistempakar;

//import android.support.v4.app.AppCompatActivity;
import android.support.v4.app.*;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    CheckBox Chckbatuk,
            ChckbatukLbhdari3minggu,
            Chckbatukberdahakmukoid,
            Chckbatukberdahakpurulen,
            Chckbatukdarah,
            Chcksesaknafas,
            Chcksesaknafasketikamengerahkantenaga,
            Chckbatukmunculbersamaansesaknafas,
            Chckdemam,
            Chckmenggigil,
            Chckkeringatmalam,
            Chckmalaise,
            Chcknafsumakanberkurang,
            Chckberatbadanmenurun,
            Chckmengi,
            Chckdadaterasapenuh,
            Chckkeluhanmenjelangpagiataumalam,
            Chckasmanokturnal,
            Chckbatukmemberatpadamalamhari,
            Chckadariwayatasma,
            Chckcepatlelah,
            Chckradangparuparuberulang,
            Chcksuaraparau,
            Chcknyerididaerahdada,
            Chcknyerididaerahbahuataupunggung,
            Chckpembengkakandileher,
            Chckpembengkakandiwajah;

    Button btnProsesDeteksi;
    TextView tvOutputNamaPenyakit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Chckbatuk = (CheckBox) findViewById(R.id.checkBox);
        ChckbatukLbhdari3minggu = (CheckBox) findViewById(R.id.checkBox2);
        Chckbatukberdahakmukoid = (CheckBox) findViewById(R.id.checkBox3);
        Chckbatukberdahakpurulen = (CheckBox) findViewById(R.id.checkBox4);
        Chckbatukdarah = (CheckBox) findViewById(R.id.checkBox5);
        Chcksesaknafas = (CheckBox) findViewById(R.id.checkBox6);
        Chcksesaknafasketikamengerahkantenaga = (CheckBox) findViewById(R.id.checkBox7);
        Chckbatukmunculbersamaansesaknafas = (CheckBox) findViewById(R.id.checkBox8);
        Chckdemam = (CheckBox) findViewById(R.id.checkBox9);
        Chckmenggigil = (CheckBox) findViewById(R.id.checkBox10);
        Chckkeringatmalam = (CheckBox) findViewById(R.id.checkBox11);
        Chckmalaise = (CheckBox) findViewById(R.id.checkBox12);
        Chcknafsumakanberkurang = (CheckBox) findViewById(R.id.checkBox13);
        Chckmengi = (CheckBox) findViewById(R.id.checkBox14);
        Chckdadaterasapenuh = (CheckBox) findViewById(R.id.checkBox15);
        Chckkeluhanmenjelangpagiataumalam = (CheckBox) findViewById(R.id.checkBox16);
        Chckasmanokturnal = (CheckBox) findViewById(R.id.checkBox17);
        Chckbatukmemberatpadamalamhari = (CheckBox) findViewById(R.id.checkBox18);
        Chckadariwayatasma = (CheckBox) findViewById(R.id.checkBox19);
        Chckcepatlelah = (CheckBox) findViewById(R.id.checkBox20);
        Chckradangparuparuberulang = (CheckBox) findViewById(R.id.checkBox21);
        Chcksuaraparau = (CheckBox) findViewById(R.id.checkBox22);
        Chcknyerididaerahdada = (CheckBox) findViewById(R.id.checkBox23);
        Chcknyerididaerahbahuataupunggung = (CheckBox) findViewById(R.id.checkBox25);
        Chckpembengkakandileher = (CheckBox) findViewById(R.id.checkBox26);
        Chckpembengkakandiwajah = (CheckBox) findViewById(R.id.checkBox27);



        btnProsesDeteksi = (Button) findViewById(R.id.button);
        tvOutputNamaPenyakit = (TextView) findViewById(R.id.textView);

        tvOutputNamaPenyakit.setText(""); // Kosongkan textView / Nama Penyakit Saat membuka program Sisitem Pakar

        btnProsesDeteksi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String NamaPenyakit = "Anda Menderita penyakit : ";


                // Jenis Gejala Untuk Output Penyakit : TBC
                if (Chckbatuk.isChecked() && ChckbatukLbhdari3minggu.isChecked() && Chckbatukberdahakmukoid.isChecked() && Chckbatukdarah.isChecked()
                        && Chcksesaknafas.isChecked() && Chckdemam.isChecked() && Chckkeringatmalam.isChecked() && Chckmalaise.isChecked() && Chcknafsumakanberkurang.isChecked()
                        && Chckberatbadanmenurun.isChecked()) {

                    NamaPenyakit += "\nTBC";
                }
                // Jenis Gejala Untuk Output Penyakit : Paru Obstruktif Kronik
                if (Chckbatuk.isChecked() && ChckbatukLbhdari3minggu.isChecked() && Chckbatukberdahakmukoid.isChecked() &&  Chckbatukberdahakpurulen.isChecked()
                        &&  Chcksesaknafas.isChecked() &&  Chcksesaknafasketikamengerahkantenaga.isChecked()) {
                    NamaPenyakit += "\nParu Obstruktif Kronik";
                }

                // Jenis Gejala Untuk Output Penyakit : Asma Bronkial
                if (Chckbatuk.isChecked() && ChckbatukLbhdari3minggu.isChecked() && Chcksesaknafas.isChecked() && Chckmengi.isChecked()
                        && Chckdadaterasapenuh.isChecked() && Chckkeluhanmenjelangpagiataumalam.isChecked()&& Chckasmanokturnal.isChecked()&& Chckbatukmemberatpadamalamhari.isChecked()
                        &&  Chckadariwayatasma.isChecked()) {
                    NamaPenyakit += "\nAsma Bronkial";
                }

                // Jenis Gejala Untuk Output Penyakit : Kanker Paru
                if (Chckbatuk.isChecked() && ChckbatukLbhdari3minggu.isChecked() && Chckbatukdarah.isChecked() && Chcksesaknafas.isChecked()
                        && Chcknafsumakanberkurang.isChecked()&& Chckmengi.isChecked()&& Chckcepatlelah.isChecked()&& Chckradangparuparuberulang.isChecked()&& Chcksuaraparau.isChecked()
                        && Chcknyerididaerahdada.isChecked() && Chcknyerididaerahbahuataupunggung.isChecked() && Chckpembengkakandileher.isChecked() && Chckpembengkakandiwajah.isChecked())
                {
                    NamaPenyakit += "\nKanker Paru";
                }

                // Jenis Gejala Untuk Output Penyakit : Pneumonia
                if (Chckbatuk.isChecked() && ChckbatukLbhdari3minggu.isChecked() && Chckbatukberdahakpurulen.isChecked() && Chckbatukdarah.isChecked()
                        && Chcksesaknafas.isChecked() && Chckdemam.isChecked() && Chckmenggigil.isChecked() && Chcknyerididaerahdada.isChecked() ) {
                    NamaPenyakit += "\nPneumonia";
                }
                // Tampilkan Hasil Nama Penyakit di textView
                tvOutputNamaPenyakit.setText(""+NamaPenyakit);
            }
        });
    }


    // Baris dibawah ini dihapus juga tidak masalah : inti codingnya hanya berada di tombol proses
//    public void onCheckboxClicked123 (View view) {
//        boolean checked = ((CheckBox) view).isChecked();
//        String str = "";
//
//        switch (view.getId()) {
//            case R.id.checkBox:
//                str = checked ? "Gejala Gatal Ringan Diseleksi " : "Gejala Gatal Ringan Tidak Diseleksi";
//                break;
//            case R.id.checkBox2:
//                str = checked ? "Gejala Gatal Berat Diseleksi " : "Gejala Gatal Berat Tidak Diseleksi";
//                break;
//            case R.id.checkBox3:
//                str = checked ? "Gejala Terasa Terbakar Diseleksi " : "Gejala Terasa Terbakar Tidak Diseleksi";
//                break;
//            case R.id.checkBox4:
//                str = checked ? "Gejala Terkena Matahari Diseleksi " : "Gejala Terkena Matahari Tidak Diseleksi";
//                break;
//            case R.id.checkBox5:
//                str = checked ? "Gejala Kondisi Stres Diseleksi " : "Gejala Kondisi Stres Tidak Diseleksi";
//                break;
//            case R.id.checkBox6:
//                str = checked ? "Gejala Berkeringat Diseleksi " : "Gejala Berkeringat Tidak Diseleksi";
//                break;
//            case R.id.checkBox7:
//                str = checked ? "Gejala Kelupansan Kulit Ketombe Terjadi Di Kepala Diseleksi " : "Gejala Kelupansan Kulit Ketombe Terjadi Di Kepala Tidak Diseleksi";
//                break;
//            case R.id.checkBox8:
//                str = checked ? "Gejala Penebalan Kulit Secara Lebar Diseleksi " : "Gejala Penebalan Kulit Secara Lebar Tidak Diseleksi";
//                break;
//            case R.id.checkBox9:
//                str = checked ? "Gejala Bintil Kecil Kering Diseleksi " : "Gejala Bintil Kecil Kering Tidak Diseleksi";
//                break;
//            case R.id.checkBox10:
//                str = checked ? "Gejala Banyak Bergerombol Diseleksi " : "Gejala Banyak Bergerombol Tidak Diseleksi";
//                break;
//            case R.id.checkBox11:
//                str = checked ? "Gejala Banyak Menyebar Terpisah Diseleksi " : "Gejala Banyak Menyebar Terpisah Tidak Diseleksi";
//                break;
//            case R.id.checkBox12:
//                str = checked ? "Gejala Tunggal Diseleksi " : "Gejala Tunggal Tidak Diseleksi";
//                break;
//        }
//
//        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
//    }


//    void showMessage(String message){
//        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
//    }
}
