package id.co.imastudio.lesson1;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    //1 kenalin
    Button btnLinear, btnRelative, btnConstraint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //2 sambungin
        btnLinear = findViewById(R.id.btn_linear);
        btnRelative = findViewById(R.id.btn_relative);
        btnConstraint = findViewById(R.id.btn_constraint);

        //3 ngapain
        btnLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MenuActivity.this, "Ini toast bro", Toast.LENGTH_SHORT).show();
                Intent pindah = new Intent(MenuActivity.this, MainActivity.class);
                startActivity(pindah);
            }
        });

        btnRelative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder pesan = new AlertDialog.Builder(MenuActivity.this);
                pesan.setTitle("Pesan Peringatan");
                pesan.setMessage("hati-hati broo");
                pesan.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //pesan.show();
                        Intent pindah = new Intent(MenuActivity.this, RelativeActivity.class);
                        startActivity(pindah);
                    }
                });
                pesan.setNegativeButton("No", null);
                pesan.setCancelable(false);
                pesan.show();
            }
        });

        btnConstraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //pindah
                Intent pindah = new Intent(MenuActivity.this, ConstraintActivity.class);
                startActivity(pindah);
            }
        });

    }

    public void munculToast(View view){
        Toast.makeText(MenuActivity.this, "Ini toast bro", Toast.LENGTH_SHORT).show();
    }
}
