package com.example.arun.implicitintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button Call, FriendCall , Map, Web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Call = findViewById(R.id.btCall);
        FriendCall=findViewById(R.id.btFriendCall);
        Map=findViewById(R.id.btMap);
        Web=findViewById(R.id.btWeb);

        Call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_DIAL);
                startActivity(intent);
            }
        });

        FriendCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:9731242650"));
                startActivity(intent);

            }
        });

        Map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=Block C, Sarjapur Main Rd, Doddakannelli, Bengaluru, Karnataka 560035"));
                startActivity(intent);

            }
        });

        Web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
                startActivity(intent);
            }
        });
    }
}
