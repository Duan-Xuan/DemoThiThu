package com.example.appthu2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.AlertDialog;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.example.appthu2.databinding.ActivityMainBinding;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Phương thức get dữ liệu
    private void get() {
        //Gọi interface Retrofit để đẩy dữ liệu lên Nodejs
        ApiRetrofitImage.apiRetrofit.postNasaUrl().enqueue(new Callback<Objects>() {
            @Override
            public void onResponse(Call<Objects> call, Response<Objects> response) {
                //Kết nối thành công
                if (response.isSuccessful()) {
                    //Đẩy thành công gọi handler truyền đối tượng massage mới
                }
            }

            @Override
            public void onFailure(Call<Status> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Call Api Error", Toast.LENGTH_SHORT).show();
            }
        });
    }

}