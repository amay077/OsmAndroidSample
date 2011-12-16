package com.amay077.android.osmandroidsample;

import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapController;
import org.osmdroid.views.MapView;

import android.app.Activity;
import android.os.Bundle;

public class OsmAndroidSampleActivity extends Activity {
    private MapView mapView;
    private MapController mapController;

	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        mapView = (MapView) this.findViewById(R.id.mapview);
        mapView.setBuiltInZoomControls(true);
        mapView.setMultiTouchControls(true);
        mapController = this.mapView.getController();
        mapController.setZoom(15);
        mapController.setCenter(new GeoPoint(35.6813, 139.7669));
    }
}