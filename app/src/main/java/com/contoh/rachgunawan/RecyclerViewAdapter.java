package com.contoh.rachgunawan;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

//Class Adapter ini Digunakan Untuk Mengatur Bagaimana Data akan Ditampilkan
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    private ArrayList<String> arrayList; //Digunakan untuk Judul
    private ArrayList<Integer> produkList; //Digunakan untuk Image/Gambar

    RecyclerViewAdapter(ArrayList<String> arrayList, ArrayList<Integer> produkList){
        this.arrayList = arrayList;
        this.produkList = produkList;
    }

    //ViewHolder Digunakan Untuk Menyimpan Referensi Dari View-View
    class ViewHolder extends RecyclerView.ViewHolder{

        private TextView JudulProduk, SubProduk;
        private ImageView Produk;
        private RelativeLayout ItemList;
        private Context context;

        ViewHolder(View itemView) {
            super(itemView);

            //Untuk Menghubungkan dan Mendapakan Context dari MainActivity
            context = itemView.getContext();

            //Menginisialisasi View-View untuk kita gunakan pada RecyclerView
            JudulProduk = (TextView) itemView.findViewById(R.id.produktitle);
            SubProduk = (TextView) itemView.findViewById(R.id.sub_produk);
            Produk = (ImageView) itemView.findViewById(R.id.produk);
            ItemList = (RelativeLayout) itemView.findViewById(R.id.item_list);
            ItemList.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent();
                    switch (getAdapterPosition()){
                        case 0 :
                            intent = new Intent(context, Produk0Activity.class);
                            break;
                        case 1 :
                            intent = new Intent(context, Produk1Activity.class);
                            break;
                        case 2 :
                            intent = new Intent(context, Produk2Activity.class);
                            break;
                        case 3 :
                            intent = new Intent(context, Produk3Activity.class);
                            break;
                        case 4 :
                            intent = new Intent(context, Produk4Activity.class);
                            break;
                        case 5 :
                            intent = new Intent(context, Produk5Activity.class);
                            break;
                        case 6 :
                            intent = new Intent(context, Produk6Activity.class);
                            break;

                    }
                    context.startActivity(intent);
                }
            });
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //Membuat View untuk Menyiapkan dan Memasang Layout yang Akan digunakan pada RecyclerView
        View V = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_design, parent, false);
        ViewHolder VH = new ViewHolder(V);
        return VH;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        //Memasukan Nilai/Value Pada View-View Yang Telah Dibuat
        final String Nama = arrayList.get(position);//Mengambil data sesuai dengan posisi yang telah ditentukan
        holder.JudulProduk.setText(Nama);
        holder.SubProduk.setText("Gambar Produk Ke: "+position);
        holder.Produk.setImageResource(produkList.get(position)); // Mengambil gambar sesuai posisi yang telah ditentukan
    }

    @Override
    public int getItemCount() {
        //Menghitung Ukuran/Jumlah Data Yang Akan Ditampilkan Pada RecyclerView
        return arrayList.size();
    }

}