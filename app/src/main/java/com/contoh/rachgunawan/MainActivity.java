package com.contoh.rachgunawan;

        import android.support.v4.content.ContextCompat;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.support.v7.widget.DefaultItemAnimator;
        import android.support.v7.widget.DividerItemDecoration;
        import android.support.v7.widget.LinearLayoutManager;
        import android.support.v7.widget.RecyclerView;

        import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> JudulProduk;
    private ArrayList<Integer> GambarProduk;
    //Daftar Judul
    private String[] Judul = {"Kain Polos", "Kain Batik", "Kain Sambas", "Kain Songket",
            "Kain Tapis", "Kain Ulos", "Kain Maumere"};
    //Daftar Gambar
    private int[] Gambar = {R.drawable.produk0, R.drawable.produk1, R.drawable.produk2, R.drawable.produk3, R.drawable.produk4, R.drawable.produk5, R.drawable.produk6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        JudulProduk = new ArrayList<>();
        GambarProduk = new ArrayList<>();
        recyclerView = (RecyclerView) findViewById(R.id.recycler);
        DaftarItem();
        //Menggunakan Layout Manager, Dan Membuat List Secara Vertical
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        adapter = new RecyclerViewAdapter(JudulProduk, GambarProduk);
        //Memasang Adapter pada RecyclerView
        recyclerView.setAdapter(adapter);
    }

    //Mengambil data dari Varibale Gambar dan Judul, lalu memasangnya pada list yang terhubung dengan Class Adapter
    private void DaftarItem(){
        for (int w=0; w<Judul.length; w++){
            GambarProduk.add(Gambar[w]);
            JudulProduk.add(Judul[w]);
        }
    }
}