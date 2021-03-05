package maksym.kalinichenko.n01295205;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.util.ArrayList;

public class MaksymActivity2 extends AppCompatActivity {

    String[] names = { "Mobile Programming", "Advanced Java Enterprise", "Cloud Computing", "Software Engineering Project"};
    int i;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ListView lvMain = (ListView) findViewById(R.id.mkslist);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, names);

        lvMain.setAdapter(adapter);

        lvMain.setTextFilterEnabled(true);
        lvMain.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @SuppressLint("SetTextI18n")
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                String value = adapter.getItem(position);
                if(names[0]== value)
                    i = 1;
                else if (names[1]== value)
                    i = 2;
                else if (names[2]== value)
                    i = 3;
                else if (names[3]== value)
                    i = 4;

                TextView text1 = (TextView) findViewById(R.id.mksft1);
                TextView text2 = (TextView) findViewById(R.id.mksft2);
                text1.setText(getString(R.string.item)+ i);
                text2.setText((String.valueOf(value)));
            }
        });
    }

}


