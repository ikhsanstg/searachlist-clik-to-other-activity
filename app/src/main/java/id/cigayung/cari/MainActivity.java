package id.cigayung.cari;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import static android.widget.Toast.makeText;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ListViewAdapter adapter;
    String[] title;
    String[] description;


    private Toast backToast;
    private long backPressed;

    ArrayList<Model> arrayList = new ArrayList<Model>();


    @Override
    public void onBackPressed (){
        if (backPressed + 2000 > System.currentTimeMillis()){
                backToast.cancel ();
                super.onBackPressed();
                return;
        } else  {
        backToast = makeText(getBaseContext(), "Press back again to Exit", Toast.LENGTH_SHORT);
        backToast.show();
         }
        backPressed = System.currentTimeMillis();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Cari SDKI");

        title = new String[]{"Battery", "Cpu", "Display", "Memory", "Sensor"};
        description = new String[]{"Battery detail...", "Cpu detail...", "Display detail...", "Memory detail...", "Sensor detail..."};


        listView = findViewById(R.id.listView);

        for (int i =0; i<title.length; i++){
            Model model = new Model(title[i], description[i]);
            //bind all strings in an array
            arrayList.add(model);
        }

        //pass results to listViewAdapter class
        adapter = new ListViewAdapter(this, arrayList);

        //bind the adapter to the listview
        listView.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);

        MenuItem myActionMenuItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView)myActionMenuItem.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                if (TextUtils.isEmpty(s)){
                    adapter.filter("");
                    listView.clearTextFilter();
                }
                else {
                    adapter.filter(s);
                }
                return true;
            }
        });
        return true;
    }


}