package com.example.recyclewithdetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private String title = "Mode List";

    private ArrayList<String> nName = new ArrayList<>();
    private ArrayList<String> nDescrip = new ArrayList<>();
    private ArrayList<String> nImgUrl = new ArrayList<>();
    private ArrayList<String> nDetailDesc = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate:started.");
        initImageBitmaps();
    }

    private void initImageBitmaps() {
        nImgUrl.add("https://www.google.com/url?sa=i&source=images&cd=&ved=2ahUKEwjO7Z2i1NnhAhXb7HMBHXWJC94QjRx6BAgBEAU&url=%2Furl%3Fsa%3Di%26source%3Dimages%26cd%3D%26ved%3D%26url%3Dhttp%253A%252F%252Fgalerypng.blogspot.com%252F2016%252F06%252Flogo-bank-mandiri.html%26psig%3DAOvVaw3KTY69_ygnnXf03UKGuvf0%26ust%3D1555667725024455&psig=AOvVaw3KTY69_ygnnXf03UKGuvf0&ust=1555667725024455");
        nName.add("Mandiri");
        nDetailDesc.add("Bank Mandiri merupakan bank terbesar di Indonesia dalam hal aset, pinjaman, dan deposit. Bank Mandiri berdiri pada tanggal 2 Oktober 1998 sebagai bagian dari program restrukturisasi perbankan yang dilaksanakan oleh Pemerintah Indonesia. Pada bulan Juli 1999, empat bank milik Pemerintah yaitu, Bank Bumi Daya (BBD), Bank Dagang Negara (BDN), Bank Ekspor Impor Indonesia (Bank Exim), dan Bank Pembangunan Indonesia (Bapindo), digabungkan ke dalam Bank Mandiri");
        nDescrip.add("Bank Mandiri berdiri sejak tahun 1998");

        nImgUrl.add("https://www.google.com/url?sa=i&source=images&cd=&cad=rja&uact=8&ved=2ahUKEwig9KvR09nhAhXk8XMBHSO1DqgQjRx6BAgBEAU&url=http%3A%2F%2Finfobanknews.com%2Flogo-bni-46-2%2F&psig=AOvVaw3D7sYUtTIrT55CFmX8Qqzz&ust=1555668091605385");
        nName.add("BRI");
        nDetailDesc.add("Bank Rakyat Indonesia (BRI) adalah salah satu bank milik pemerintah yang terbesar di Indonesia. Pada awalnya Bank Rakyat Indonesia (BRI) didirikan di Purwokerto, Jawa Tengah oleh Raden Bei Aria Wirjaatmadja dengan nama De Poerwokertosche Hulp en Spaarbank der Inlandsche Hoofden atau \"Bank Bantuan dan Simpanan Milik Kaum Priyayi Purwokerto\", suatu lembaga keuangan yang melayani orang-orang berkebangsaan Indonesia (pribumi). Lembaga tersebut berdiri tanggal 16 Desember 1895, yang kemudian dijadikan sebagai hari kelahiran BRI. Pada periode setelah kemerdekaan RI, berdasarkan Peraturan Pemerintah No. 1 tahun 1946 Pasal 1 disebutkan bahwa BRI adalah sebagai Bank Pemerintah pertama di Republik Indonesia.");
        nDescrip.add("BRI berdiri sejak tahun 1895");

        nImgUrl.add("https://www.google.com/url?sa=i&source=images&cd=&cad=rja&uact=8&ved=2ahUKEwig9KvR09nhAhXk8XMBHSO1DqgQjRx6BAgBEAU&url=http%3A%2F%2Finfobanknews.com%2Flogo-bni-46-2%2F&psig=AOvVaw3D7sYUtTIrT55CFmX8Qqzz&ust=1555668091605385");
        nName.add("BNI");
        nDetailDesc .add("Bank Negara Indonesia adalah sebuah institusi bank milik pemerintah, dalam hal ini adalah perusahaan BUMN di Indonesia. Dalam struktur manajemen organisasinya, Bank Negara Indonesia (BNI), dipimpin oleh seorang Direktur Utama yang saat ini dijabat oleh Achmad Baiquni. BNI adalah bank komersial tertua dalam sejarah Republik Indonesia dan Bank ini didirikan pada tanggal 5 Juli tahun 1946.");
        nDescrip.add("BNI berdiri sejak tahun 1946");

        nImgUrl.add("https://www.google.com/url?sa=i&source=images&cd=&cad=rja&uact=8&ved=2ahUKEwjv3rCn09nhAhXe63MBHVmFBR4QjRx6BAgBEAU&url=https%3A%2F%2Fvectorlogo4u.com%2Fbank-bca-vector-logo%2F&psig=AOvVaw0-keRrLhajQE9IVIIMLYo4&ust=1555668138127849");
        nName.add("BCA");
        nDetailDesc.add("Bank Central Asia adalah bank swasta terbesar di Indonesia. Bank ini didirikan pada 21 Februari 1957 dengan nama Bank Central Asia NV yang berkantor pusat di Jakarta dan pernah menjadi bagian penting dari Salim Group. Salim Group adalah salah satu perusahaan konglomerat yang didirikan pada tanggal 4 Oktober 1972 di Indonesia yang didirikan oleh Sudono Salim. Perusahaan ini memiliki beberapa anak perusahaan, termasuk Indofood, produsen mie instan terbesar dunia dan Bogasari, perusahaan operasi tepung terbesar.\n" +
                "\n ");
        nDescrip.add("BCA berdiri sejak tahun 1957");

        nImgUrl.add("https://www.google.com/url?sa=i&source=images&cd=&cad=rja&uact=8&ved=2ahUKEwjR45Lr0tnhAhWp7XMBHUvHDrcQjRx6BAgBEAU&url=https%3A%2F%2Findonesia.go.id%2Fkementerian-lembaga%2Fbank-indonesia&psig=AOvVaw3WArePMlTY6y-zi9aboPbn&ust=1555668194605343");
        nName.add("Bank Indonesia");
        nDetailDesc.add("Bank Indonesia (BI) adalah bank sentral Republik Indonesia. Sebelum dinasionalisasikan bank ini bernama De Javasche Bank yang dipergunakan pada masa Hindia Belanda. Sebagai bank sentral, BI mempunyai satu tujuan tunggal yaitu mencapai dan memelihara kestabilan nilai rupiah. Kestabilan nilai rupiah ini mengandung dua aspek, yaitu kestabilan nilai mata uang terhadap barang dan jasa, serta kestabilan terhadap mata uang negara lain.\n" +
                "\n" +
                "Untuk mencapai tujuan tersebut BI didukung oleh tiga pilar yang merupakan tiga bidang tugasnya. Ketiga bidang tugas ini adalah menetapkan dan melaksanakan kebijakan moneter, mengatur dan menjaga kelancaran sistem pembayaran, serta mengatur dan mengawasi perbankan di Indonesia. Ketiganya perlu diintegrasi agar tujuan mencapai dan memelihara kestabilan nilai rupiah dapat dicapai secara efektif dan efisien.");
        nDescrip.add("Bank Indonesia berdiri sejak tahun 1953");

        nImgUrl.add("https://www.google.com/url?sa=i&source=images&cd=&cad=rja&uact=8&ved=2ahUKEwix3ou40tnhAhWIfH0KHasIAx8QjRx6BAgBEAU&url=https%3A%2F%2Fgudrilogo.blogspot.com%2F2017%2F11%2Flogo-bank-danamon-format-cdr-png.html&psig=AOvVaw27TfFtK8wpeGCaRobe-iuP&ust=1555668279095744");
        nName.add("Bank Danamon");
        nDetailDesc.add("Bank Danamon didirikan pada tanggal 16 Juli 1956 dengan nama PT Bank Kopra Indonesia. Pada tahun 1976 nama bank ini berubah menjadi PT Bank Danamon Indonesia. Bank ini menjadi bank pertama yang memelopori pertukaran mata uang asing pada tahun 1976 dan tercatat sahamnya di bursa sejak tahun 1989. Sejak tahun 2008, Bank Danamon yang kemudian dikenal dengan nama Danamon mulai menggerakan masyarakat Indonesia lewat kampanye Untuk Anda, Bisa. Bahkan sejak 2010, Danamon meluncurkan program Semangat Bisa.");
        nDescrip.add("Bank Danamon berdiri sejak tahun 1956");

        nImgUrl.add("https://www.google.com/url?sa=i&source=images&cd=&cad=rja&uact=8&ved=2ahUKEwigv5yxstnhAhVRfH0KHSd7DzsQjRx6BAgBEAU&url=https%3A%2F%2Fkeuangan.kontan.co.id%2Fnews%2Fmaybank-indonesia-resmikan-logo-baru&psig=AOvVaw1Vm0oM0FIQdTZgMx0KZGqv&ust=1555668355898019");
        nName.add("Maybank");
        nDetailDesc.add("PT Bank Maybank Indonesia Tbk adalah salah satu bank swasta terkemuka di Indonesia yang merupakan bagian dari grup Malayan Banking Berhad (Maybank), salah satu grup penyedia layanan keuangan terbesar di ASEAN.\n" +
                "\n" +
                "Sebelumnya, bank ini bernama Bank Internasional Indonesia (BII) yang didirikan pada 15 Mei 1959, mendapatkan izin sebagai bank devisa pada 1988 dan mencatatkan sahamnya sebagai perusahaan terbuka di Bursa Efek Jakarta dan Surabaya (sekarang telah merger menjadi Bursa Efek Indonesia) pada 1989. Pada 2008 Bank Internasional Indonesia (BII) diakuisisi oleh Maybank melalui anak perusahan yang dimiliki sepenuhnya yaitu Maybank Offshore Corporate Services (Labuan) Sdn. Bhd. (MOCS) dan Sorak Financial Holdings Pte. Ltd. (Sorak). Melalui persetujuan Otoritas Jasa Keuangan (OJK) pada 23 September 2015, Bank Internasional Indonesia (BII) berubah nama menjadi Bank Maybank Indonesia, mengukuhkan Identitasnya sebagai Entitas utuh yang tidak terpisahkan dari Grup Maybank serta senantiasa berusaha untuk menghadirkan Humanising Financial Services kepada semua pemangku kepentingan.");
        nDescrip.add("Bank Maybank berdiri sejak tahun 1960");

        nImgUrl.add("https://www.google.com/url?sa=i&source=images&cd=&cad=rja&uact=8&ved=2ahUKEwjb4ef_uNvhAhUG63MBHUwZB6MQjRx6BAgBEAU&url=https%3A%2F%2F237desain.blogspot.com%2F2013%2F03%2Flogo-bank-mega.html&psig=AOvVaw35pRG9n2MOBOw5SKWYVMmi&ust=1555738851422799");
        nName.add("Bank Mega");
        nDetailDesc.add("Berawal dari sebuah usaha milik keluarga bernama Bank Karman yang didirikan pada tanggal 15 April 1969 dan berkedudukan di Surabaya, selanjutnya pada tahun 1992 berubah nama menjadi Mega Bank dan melakukan relokasi kantor pusat ke Jakarta.\n" +
                "\n" +
                "Seiring dengan perkembangannya Mega Bank pada tahun 1996 diambil alih oleh CT Corp (d/h Para Group) (PT Para Global Investindo dan PT. Para Rekan Investama). Untuk lebih meningkatkan citra Mega Bank.\n" +
                "\n" +
                "Pada bulan Juni 1997 melakukan perubahan logo dengan tujuan bahwa sebagai lembaga keuangan kepercayaan masyarakat dengan akan lebih mudah dikenal melalui logo perusahaan yang baru berubah nama menjadi Bank Mega.");
        nDescrip.add("Bank Mega berdiri sejak tahun 1969");

        initRecyclerView();

    }

    private void initRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecycleViewAdapter adapter = new RecycleViewAdapter(this, nName, nImgUrl, nDescrip, nDetailDesc);
        recyclerView.setAdapter(adapter);
    }

    private void showRecyleList() {
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ListActivity adapter = new ListActivity(this, nName, nImgUrl, nDescrip, nDetailDesc);
        recyclerView.setAdapter(adapter);

    }

    private void showRecyclerGrid() {
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        GridActivity adapter = new GridActivity(this, nName, nImgUrl, nDescrip, nDetailDesc);
        recyclerView.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_list:
                setActionBarTitle("Mode List");
                showRecyleList();
                break;
            case R.id.action_grid:
                setActionBarTitle("Mode Grid");
                showRecyclerGrid();
                break;
            case R.id.action_cardview:
                setActionBarTitle("Mode Card View");
                initRecyclerView();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);

    }
}