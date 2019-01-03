package id.cigayung.cari;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ListViewAdapter extends BaseAdapter{

    //variables
    Context mContext;
    LayoutInflater inflater;
    List<Model> modellist;
    ArrayList<Model> arrayList;

    //constructor
    public ListViewAdapter(Context context, List<Model> modellist) {
        mContext = context;
        this.modellist = modellist;
        inflater = LayoutInflater.from(mContext);
        this.arrayList = new ArrayList<Model>();
        this.arrayList.addAll(modellist);
    }

    public class ViewHolder{
        TextView mTitleTv;

    }

    @Override
    public int getCount() {
        return modellist.size();
    }

    @Override
    public Object getItem(int i) {
        return modellist.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int postition, View view, ViewGroup parent) {
        ViewHolder holder;
        if (view==null){
            holder = new ViewHolder();
            view = inflater.inflate(R.layout.row, null);

            //locate the views in row.xml
            holder.mTitleTv = view.findViewById(R.id.mainTitle);



            view.setTag(holder);

        }
        else {
            holder = (ViewHolder)view.getTag();
        }
        //set the results into textviews
        holder.mTitleTv.setText(modellist.get(postition).getTitle());

        //set the result in imageview


        //listview item clicks
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //code later
                if (modellist.get(postition).getTitle().equals("Menghitung Denyut Nadi")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, ukurnadiActivity.class);
                    intent.putExtra("actionBarTitle", "Mengukur Denyut Nadi");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Menghitung Pernafasan")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, ukurnafasActivity.class);
                    intent.putExtra("actionBarTitle", "Mengukur Pernafasan");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Mengukur Tekanan Darah")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, TekDarahActivity.class);
                    intent.putExtra("actionBarTitle", "Mengukur Tekanan Darah");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Mengukur Suhu Tubuh")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, ukursuhuActivity.class);
                    intent.putExtra("actionBarTitle", "Mengukur Suhu Tubuh");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Memberikan Semprit Gliserin")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, gliserinActivity.class);
                    intent.putExtra("actionBarTitle", "Memberikan Semprit Gliserin");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Memberikan Huknah Rendah atau Tinggi")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, huknahActivity.class);
                    intent.putExtra("actionBarTitle", "Memberikan Huknah Rendah atau Tinggi");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Melakukan Pemeriksaan Fisik dengan Cara Inspeksi")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, inspeksiActivity.class);
                    intent.putExtra("actionBarTitle", "Melakukan Pemeriksaan Fisik dengan Cara Inspeksi");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Melakukan Pemeriksaan Fisik dengan Cara Palpasi")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, palpasiActivity.class);
                    intent.putExtra("actionBarTitle", "Melakukan Pemeriksaan Fisik dengan Cara Palpasi");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Mengikat Klien (restraint) Pada Tangan dan Kaki")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, restrainActivity.class);
                    intent.putExtra("actionBarTitle", "Mengikat Klien (restraint) Pada Tangan dan Kaki");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Mencuci Tangan Biasa")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, cucitgnActivity.class);
                    intent.putExtra("actionBarTitle", "Mencuci Tangan Biasa");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Mencuci Tangan Steril")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, cucitgnSterilActivity.class);
                    intent.putExtra("actionBarTitle", "Mencuci Tangan Steril");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Prosedur Memakai Masker")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, maskerActivity.class);
                    intent.putExtra("actionBarTitle", "Prosedur Memakai Masker");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Prosedur Memakai Skort")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, skortActivity.class);
                    intent.putExtra("actionBarTitle", "Prosedur Memakai Skort");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Memakai Sarung Tangan steril")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, sarungtgnsterilActivity.class);
                    intent.putExtra("actionBarTitle", "Memakai Sarung Tangan steril");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Mendesinfeksi Alat")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, desinfeksiActivity.class);
                    intent.putExtra("actionBarTitle", "Mendesinfeksi Alat");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Mendesinfeksi dengan Bahan Kimia")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, desinfeksikimiaActivity.class);
                    intent.putExtra("actionBarTitle", "Mendesinfeksi dengan Bahan Kimia");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Sterilisasi Alat")){
                //start NewActivity with title for actionbar and text for textview
                Intent intent = new Intent(mContext, sterilisasiActivity.class);
                intent.putExtra("actionBarTitle", "Sterilisasi Alat");
                mContext.startActivity(intent);
            }

            }
        });


        return view;
    }

    //filter
    public void filter(String charText){
        charText = charText.toLowerCase(Locale.getDefault());
        modellist.clear();
        if (charText.length()==0){
            modellist.addAll(arrayList);
        }
        else {
            for (Model model : arrayList){
                if (model.getTitle().toLowerCase(Locale.getDefault())
                        .contains(charText)){
                    modellist.add(model);
                }
            }
        }
        notifyDataSetChanged();
    }

}
