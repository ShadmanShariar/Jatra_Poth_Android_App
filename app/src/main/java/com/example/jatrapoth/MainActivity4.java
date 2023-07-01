package com.example.jatrapoth;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
public class MainActivity4 extends FragmentActivity implements OnMapReadyCallback {
 GoogleMap gMap;
 FrameLayout map;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Removing Title
       requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        map = (FrameLayout) findViewById(R.id.map);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
       mapFragment.getMapAsync(this);
    }
    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {

        this.gMap = googleMap;
       LatLng dhakamap = new LatLng(23.7956, 90.3537);
       this.gMap.addMarker(new MarkerOptions().position(dhakamap).title("Marker in Dhaka"));
      this.gMap.moveCamera(CameraUpdateFactory.newLatLng(dhakamap));

    }
}