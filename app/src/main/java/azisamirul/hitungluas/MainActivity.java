package azisamirul.hitungluas;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText input_panjang,input_lebar;
    TextView txt_luas;
    Button btn_hitung;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Hitung Luas Persegi Panjang");
        input_panjang=(EditText) findViewById(R.id.input_panjang);
        input_lebar=(EditText) findViewById(R.id.input_lebar);
        btn_hitung=(Button) findViewById(R.id.btn_hitung);
        txt_luas=(TextView) findViewById(R.id.txt_luas);

        btn_hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String  panjang=input_panjang.getText().toString().trim();
              String  lebar=input_lebar.getText().toString().trim();

                if(!panjang.isEmpty()&&!lebar.isEmpty()){
                    Double p=Double.parseDouble(panjang);
                    Double l=Double.parseDouble(lebar);
                    Double luas= p*l;
                    txt_luas.setText("Luas : "+luas);
                }else{

               AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
                    builder.setMessage("Panjang dan Lebar harus diisi");
builder.setNeutralButton("OK", new DialogInterface.OnClickListener() {
    @Override
    public void onClick(DialogInterface dialog, int which) {

    }
});
                    AlertDialog alertDialog=builder.create();
                    alertDialog.show();
                }

            }
        });


    }



}
