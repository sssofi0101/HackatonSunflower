package com.randomname123.sunflower;


import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.PermissionChecker;


import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;

import com.karumi.dexter.Dexter;

public class MainActivity extends AppCompatActivity {

    private LocationListener listener = new LocationListener() {
        @Override
        public void onLocationChanged(Location location) {
        }
        @Override
        public void onStatusChanged(String provider, int status, Bundle extras) {
        }
        @Override
        public void onProviderEnabled(String provider) {
        }
        @Override
        public void onProviderDisabled(String provider) {
        }
    };
    LocationManager manager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
    if (PermissionChecker.checkSelfPermission(context, Manifest.permission.ACCESS_FINE_LOCATION) != Context.getPackageManager.PERMISSION_GRANTED))
    if (ContextCompat.checkSelfPermission(context, Manifest.permission.ACCESS_FINE_LOCATION) != Context.getPackageManager.PERMISSION_GRANTED) {
        // Проверка наличия разрешений
        // Если нет разрешения на использование соответсвующих разркешений выполняем какие-то действия
        return;
    }
manager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0,listener);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}