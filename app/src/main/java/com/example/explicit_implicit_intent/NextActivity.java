package com.example.explicit_implicit_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
    }

    public void callIntent(View view)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:"));
        startActivity(intent);
    }

    public void emailIntent(View view)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("mailto:"));
        startActivity(intent);
    }

    public void webIntent(View view)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com"));
        startActivity(intent);
    }

    public void mapIntent(View view)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("geo:"));
        startActivity(intent);
    }

    public void messageIntent(View view)
    {
        Intent intent = getPackageManager().getLaunchIntentForPackage("com.whatsapp");
        startActivity(intent);
    }

    public void playstoreIntent(View view)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://play.google.com/store?hl=en"));
        startActivity(intent);
    }
}
