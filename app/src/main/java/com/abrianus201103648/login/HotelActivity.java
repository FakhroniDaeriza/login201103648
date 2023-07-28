package com.abrianus201103648.login;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class HotelActivity extends AppCompatActivity
{
    private ImageView _imageView1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);

        _imageView1 = (ImageView) findViewById(R.id.imageView1);

        String imageUrl ="https://asset.kompas.com/crops/bmqpgynoGCIRVvpo3zHIvum5cNw=/0x0:1196x797/750x500/data/photo/2022/09/13/63208c54dd39d.png";
        Picasso.with(this).load(imageUrl).into(_imageView1);
    }
}
