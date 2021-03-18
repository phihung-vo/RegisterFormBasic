package com.example.registerformbasic;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edt_usn, edt_pwd, edt_birth, edt_mail;
    Button btn_register;
    TextView txv_info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setControl();
        setEvent();
    }

    private void setControl() {
        edt_usn = (EditText)findViewById(R.id.edt_usn);
        edt_pwd = (EditText)findViewById(R.id.edt_pwd);
        edt_birth = (EditText)findViewById(R.id.edt_birth);
        edt_mail = (EditText)findViewById(R.id.edt_mail);
        btn_register = (Button) findViewById(R.id.btn_register);
        txv_info = (TextView)findViewById(R.id.txv_info);
    }

    private void setEvent() {
        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edt_usn.getText().length() > 0 && edt_pwd.getText().length() > 0 && edt_birth.getText().length() > 0 && edt_mail.getText().length() > 0){
                    String str = "Thong tin tai khoan";
                    str += "\nTai khoan: " + edt_usn.getText().toString()
                            + "\nMat khau: " + edt_pwd.getText().toString()
                            + "\nNgay sinh: " + edt_birth.getText().toString()
                            + "\nEmail: " + edt_mail.getText().toString();
                    txv_info.setText("");
                    txv_info.setText(str);
                    txv_info.setBackgroundColor(Color.GREEN);
                }
            }
        });
    }
}