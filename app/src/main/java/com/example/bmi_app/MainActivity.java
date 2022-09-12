package com.example.bmi_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtTen, edtTuoi, edtChieuCao, edtCanNang;
    Button btnKiemTra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtTen = findViewById(R.id.editTextTen);
        edtTuoi = findViewById(R.id.editTextTuoi);
        edtChieuCao = findViewById(R.id.editTexChieuCao);
        edtCanNang = findViewById(R.id.editTexCanNang);
        btnKiemTra = findViewById(R.id.buttonXacNhan);

        btnKiemTra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtCanNang.getText().toString().trim().length() == 0 || edtChieuCao.getText().toString().trim().length() == 0 || edtTuoi.getText().toString().trim().length() == 0 || edtTen.getText().toString().trim().length() == 0) {
                    Toast.makeText(MainActivity.this, "Vui lòng nhập hết thông tin!!!", Toast.LENGTH_SHORT).show();
                }
                else {
                    int tuoi;
                    double canNang, chieuCao, bmi;
                    String ten = edtTen.getText().toString();
                    tuoi = Integer.parseInt(edtTuoi.getText().toString());
                    chieuCao = Double.parseDouble(edtChieuCao.getText().toString());
                    canNang = Double.parseDouble(edtCanNang.getText().toString());
                    bmi = canNang/(chieuCao*chieuCao);
                    if (bmi < 18.5) {
                        Toast.makeText(MainActivity.this, "Bạn đang khá gầy!", Toast.LENGTH_SHORT).show();
                    }
                    else if (bmi < 24.9) {
                        Toast.makeText(MainActivity.this, "Bạn đang cân đối!", Toast.LENGTH_SHORT).show();
                    }
                    else if (bmi < 29.9) {
                        Toast.makeText(MainActivity.this, "Bạn đang tiền béo phì!", Toast.LENGTH_SHORT).show();
                    }
                    else if (bmi < 34.9) {
                        Toast.makeText(MainActivity.this, "Bạn đang béo phì độ I!", Toast.LENGTH_SHORT).show();
                    }
                    else if (bmi < 39.9) {
                        Toast.makeText(MainActivity.this, "Bạn đang béo phì độ II!", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        Toast.makeText(MainActivity.this, "Bạn đang béo thì độ III!", Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });

    }
}