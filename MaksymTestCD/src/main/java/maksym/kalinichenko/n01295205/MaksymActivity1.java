//Maksym Kalinichenko N01295205 CENG258 RNC
package maksym.kalinichenko.n01295205;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MaksymActivity1 extends AppCompatActivity {
    int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void NextPage(View f){
        EditText login =(EditText) findViewById(R.id.mkslogin);
        String login1 = login.getText().toString();
        String name1 = "MAKSYM";
        if(login1.equalsIgnoreCase(name1)) {
            Intent intent = new Intent(f.getContext(), MaksymActivity2.class);
            startActivity(intent);
            i = 0;
        }
        else{
            if (i == 3){
                android.os.Process.killProcess(android.os.Process.myPid());
            }
            else {
                new AlertDialog.Builder(this)
                        .setIcon(android.R.drawable.ic_dialog_alert)
                        .setTitle(R.string.app_name)
                        .setMessage(R.string.question)
                        .setNegativeButton(R.string.txtonbtn, null)
                        .show();
                i++;
            }
    }
    }
}