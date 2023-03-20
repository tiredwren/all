package com.example.search

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.search.databinding.ActivityMapsBinding
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityMapsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        val zoomlevel=5f
        // Add a marker in Sydney and move the camera
        val ValueVillage = LatLng(47.554133, -122.060372)
        mMap.addMarker(MarkerOptions().position(ValueVillage).title("Issaquah Value Village"))
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(ValueVillage,zoomlevel))

        val GoodwillSammamish = LatLng(47.608482, -122.046928)
        mMap.addMarker(MarkerOptions().position(GoodwillSammamish).title("Sammamish Goodwill"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(GoodwillSammamish))

        val GoodwillRedmond = LatLng(47.634797, -122.132335)
        mMap.addMarker(MarkerOptions().position(GoodwillRedmond).title("Redmond Goodwill"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(GoodwillRedmond))

        val GoodwillRenton = LatLng(47.504620, -122.178190)
        mMap.addMarker(MarkerOptions().position(GoodwillRenton).title("Renton Goodwill"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(GoodwillRedmond))

        val GoodwillWoodinville = LatLng(47.754507, -122.157742)
        mMap.addMarker(MarkerOptions().position(GoodwillWoodinville).title("Woodinville Goodwill"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(GoodwillWoodinville))

        val GoodwillJuanita = LatLng(47.707735, -122.198863)
        mMap.addMarker(MarkerOptions().position(GoodwillJuanita).title("Juanita Goodwill"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(GoodwillJuanita))
    }
}