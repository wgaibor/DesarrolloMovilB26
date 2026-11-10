package ec.edu.helloworld;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnNextActivity;
    Button btnThirdActivity;
    LinearLayout main;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        main = findViewById(R.id.main);
        btnNextActivity = findViewById(R.id.btn_next_activity);
        btnThirdActivity = findViewById(R.id.btn_third_activity);
        btnNextActivity.setOnClickListener(this);
        btnThirdActivity.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_next_activity) {
            //Toast.makeText(this, "Haz dado click sobre el boton ", Toast.LENGTH_LONG).show();
            Snackbar.make(main, "Estas empleando snackbar", Snackbar.LENGTH_LONG).
                    setAction("Gracias", new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Log.i(getApplicationContext().getPackageName(), "Gracias por usar snackbar");
                        }
                    }).show();
            callAlertDialog();
        } else if (view.getId() == R.id.btn_third_activity) {
            callNextThirdActivity();
        }
    }

    private void callNextThirdActivity() {
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }

    private void callAlertDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Mensaje");
        builder.setMessage("Estas seguro de continuar?");
        builder.setPositiveButton("Aceptar", (dialogInterface, i) -> {
                    callNextActivity();
        });
        builder.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "Usted ha pulsado la opcion cancelar", Toast.LENGTH_LONG).show();
            }
        });
        builder.setCancelable(false);
        builder.show();
    }

    private void callNextActivity() {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }


}