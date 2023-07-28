package com.abrianus201103648.login;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.abrianus201103648.login.ForexMainActivity;
import com.abrianus201103648.login.R;
import com.abrianus201103648.login.TampilMahasiswaActivity;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import cz.msebera.android.httpclient.Header;

public class MenuActivity extends AppCompatActivity {

    private Button _tampilMahasiswaButton, _btnForex, _btnCuaca, _btnImplicitIntent, _btnTabLayout, _btnHotelApp , _btnWebView;
    private Intent _tampilMahasiswaIntent, _tampilForexIntent, _tampilCuacaIntent, _tampilImplicitIntent, _tampilTabLayout, _tampilHotelApp, _tampilWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);

        initTampilMahasiswaButton();
        initTampilForexButton();
        initTampilCuacaButton();
        initTampilImplicitIntent();
        initTampilTabLayout();
        initTampilHotelApp();
        initTampilWebView();
    }

    private void initTampilMahasiswaButton() {
        _tampilMahasiswaButton = (Button) findViewById(R.id.tampilMahasiswaButton);
        _tampilMahasiswaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AsyncHttpClient asyncHttpClient;
                String url = "https://stmikpontianak.net/011100862/tampilMahasiswa.php";
                asyncHttpClient = new AsyncHttpClient();

                asyncHttpClient.get(url, new AsyncHttpResponseHandler() {
                    @Override
                    public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                        Toast.makeText(getApplicationContext(), "Selamat Datang, di Menu Mahasiswa", Toast.LENGTH_SHORT).show();
                        _tampilMahasiswaIntent = new Intent(getApplicationContext(), TampilMahasiswaActivity.class);
                        startActivity(_tampilMahasiswaIntent);
                    }

                    @Override
                    public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                        Toast.makeText(getApplicationContext(), error.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }


    private void initTampilForexButton() {
        _btnForex = (Button) findViewById(R.id.btnForex);

        _btnForex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _tampilForexIntent = new Intent(getApplicationContext(), ForexMainActivity.class);
                startActivity(_tampilForexIntent);
            }
        });
    }

    private void initTampilCuacaButton() {
        _btnCuaca = (Button) findViewById(R.id.btnCuaca);

        _btnCuaca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _tampilCuacaIntent = new Intent(getApplicationContext(), CuacaMainActivity.class);
                startActivity(_tampilCuacaIntent);
            }
        });
    }

    private void initTampilImplicitIntent() {
        _btnImplicitIntent = (Button) findViewById(R.id.btnImplicitIntent);

        _btnImplicitIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _tampilImplicitIntent = new Intent(getApplicationContext(), ImplicitIntentActivity.class);
                startActivity(_tampilImplicitIntent);
            }
        });
    }
    private void initTampilTabLayout() {
        _btnTabLayout = (Button) findViewById(R.id.btnTabLayout);

        _btnTabLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _tampilTabLayout = new Intent(getApplicationContext(), TabLayoutActivity.class);
                startActivity(_tampilTabLayout);
            }
        });
    }
    private void initTampilHotelApp() {
        _btnHotelApp = (Button) findViewById(R.id.btnHotelApp);

        _btnHotelApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _tampilHotelApp = new Intent(getApplicationContext(), HotelActivity.class);
                startActivity(_tampilHotelApp);
            }
        });
    }
    private void initTampilWebView() {
        _btnWebView = (Button) findViewById(R.id.btnWebView);

        _btnWebView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _tampilWebView = new Intent(getApplicationContext(), WebViewActivity.class);
                startActivity(_tampilWebView);
            }
        });
    }
}



