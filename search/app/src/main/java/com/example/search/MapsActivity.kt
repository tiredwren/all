package com.example.search

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.search.databinding.ActivityMapsBinding
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
//import com.google.android.gms.maps.model.
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

        val zoomlevel=9f
        // Goodwill Locations
        val GoodwillSammamish = LatLng(47.608482, -122.046928)
        val markerOptions = MarkerOptions()
            .position(GoodwillSammamish)
            .title("Sammamish Goodwill")
            .snippet("Address: 625 228th Ave NE, Sammamish, WA 98074\nHours: 9am - 5pm")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
        val marker = mMap.addMarker(markerOptions)
        //marker.showInfoWindow()
        //marker.infoWindow.isMultiLine = true
        //mMap.addMarker(markerOptions)
        mMap.moveCamera(CameraUpdateFactory.newLatLng(GoodwillSammamish))

        val GoodwillRedmond = LatLng(47.634797, -122.132335)
        mMap.addMarker(MarkerOptions()
            .position(GoodwillRedmond)
            .title("Redmond Goodwill")
            .snippet("Address: 625 228th Ave NE, Redmond, WA 98074\nHours: 9am - 5pm")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(GoodwillRedmond))

        val GoodwillRenton = LatLng(47.504620, -122.178190)
        mMap.addMarker(MarkerOptions()
            .position(GoodwillRenton)
            .title("Renton Goodwill")
            .snippet("gh")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(GoodwillRenton))

        val GoodwillWoodinville = LatLng(47.754507, -122.157742)
        mMap.addMarker(MarkerOptions()
            .position(GoodwillWoodinville)
            .title("Woodinville Goodwill")
            .snippet("gh")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(GoodwillWoodinville))

        val GoodwillJuanita = LatLng(47.707735, -122.198863)
        mMap.addMarker(MarkerOptions()
            .position(GoodwillJuanita)
            .title("Juanita Goodwill")
            .snippet("gh")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(GoodwillJuanita))

        val GoodwillKent = LatLng(47.383976, -122.239829)
        mMap.addMarker(MarkerOptions()
            .position(GoodwillKent)
            .title("Kent Goodwill")
            .snippet("gh")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(GoodwillKent))

        val GoodwillAuburn = LatLng(47.296623, -122.222536)
        mMap.addMarker(MarkerOptions()
            .position(GoodwillAuburn)
            .title("Auburn Goodwill")
            .snippet("gh")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(GoodwillAuburn))

        val GoodwillFederalWay = LatLng(47.308254, -122.315566)
        mMap.addMarker(MarkerOptions()
            .position(GoodwillFederalWay)
            .title("Federal Way Goodwill")
            .snippet("gh")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(GoodwillFederalWay))

        val GoodwillPuyallup = LatLng(47.191512, -122.292633)
        mMap.addMarker(MarkerOptions()
            .position(GoodwillPuyallup)
            .title("Puyallup Goodwill")
            .snippet("gh")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(GoodwillPuyallup))

        val GoodwillBonneyLake = LatLng(47.177889, -122.171853)
        mMap.addMarker(MarkerOptions()
            .position(GoodwillBonneyLake)
            .title("Bonney Lake Goodwill")
            .snippet("gh")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(GoodwillBonneyLake))

        val GoodwillSumner = LatLng(47.206278, -122.237679)
        mMap.addMarker(MarkerOptions()
            .position(GoodwillSumner)
            .title("Sumner Goodwill")
            .snippet("gh")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(GoodwillSumner))

        // Value Village Locations
        val ValueIssaquah = LatLng(47.554133, -122.060372)
        mMap.addMarker(MarkerOptions()
            .position(ValueIssaquah)
            .title("Issaquah Value Village")
            .snippet("gh")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ValueIssaquah))

        val ValueWoodnville = LatLng(47.755983753433604,  -122.15089202347497)
        mMap.addMarker(MarkerOptions()
            .position(ValueWoodnville)
            .title("Woodnville Value Village")
            .snippet("gh")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ValueWoodnville))

        val ValueKent = LatLng(47.3862690670405, -122.20063680999802)
        mMap.addMarker(MarkerOptions()
            .position(ValueKent)
            .title("Kent Value Village")
            .snippet("gh")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ValueKent))

        val ValueLynwood = LatLng(47.84232297920507, -122.29858396209954)
        mMap.addMarker(MarkerOptions()
            .position(ValueLynwood)
            .title("Lynwood Value Village")
            .snippet("gh")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ValueLynwood))

        val ValueEverett = LatLng(47.94147736344533, -122.21862158168027)
        mMap.addMarker(MarkerOptions()
            .position(ValueEverett)
            .title("Everett Value Village")
            .snippet("gh")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ValueEverett))

        val ValuePuyallup = LatLng(47.20228373478941, -122.30968690260543)
        mMap.addMarker(MarkerOptions()
            .position(ValuePuyallup)
            .title("Puyallup Value Village")
            .snippet("gh")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ValuePuyallup))

        //Other locations
        val Hopelink = LatLng(47.62237087107349, -122.14219857627313)
        mMap.addMarker(MarkerOptions()
            .position(Hopelink)
            .title("Hopelink")
            .snippet("gh")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Hopelink))

        val Jubilee = LatLng(47.63501762621738, -122.30352672203573)
        mMap.addMarker(MarkerOptions()
            .position(Jubilee)
            .title("Jubilee Women's Center")
            .snippet("gh")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Jubilee))

        val KidVantage = LatLng(47.62273537675142, -122.62849445843956)
        mMap.addMarker(MarkerOptions()
            .position(KidVantage)
            .title("KidVantage Bremerton")
            .snippet("gh")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(KidVantage))

        val T2P2 = LatLng(47.73705696109788, -122.34549124031129)
        mMap.addMarker(MarkerOptions()
            .position(T2P2)
            .title("T2P2")
            .snippet("gh")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(T2P2))

        val IssaquahFood = LatLng(47.53156081333957, -122.03547623142943)
        mMap.addMarker(MarkerOptions()
            .position(IssaquahFood)
            .title("Issaquah Food and Clothing Bank")
            .snippet("gh")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(IssaquahFood))

        val REACH = LatLng(47.60310129575931, -122.15201897325481)
        mMap.addMarker(MarkerOptions()
            .position(REACH)
            .title("Jubilee REACH")
            .snippet("gh")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(REACH))

        val Vision = LatLng(47.493782231529025, -122.1716728545493)
        mMap.addMarker(MarkerOptions()
            .position(Vision)
            .title("Vision House Thrift Store")
            .snippet("gh")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Vision))

        val Bridge = LatLng(47.63475016637949, -122.17536410394223)
        mMap.addMarker(MarkerOptions()
            .position(Bridge)
            .title("Bridge Disability Ministries")
            .snippet("gh")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Bridge))

        val Match = LatLng(47.614964328455706, -122.33858430459559)
        mMap.addMarker(MarkerOptions()
            .position(Match)
            .title("Be The Match Collection Center Seattle")
            .snippet("gh")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Match))

        val Gateway = LatLng(47.42937242685027, -122.22858123906539)
        mMap.addMarker(MarkerOptions()
            .position(Gateway)
            .title("Gateway Medical Alliance")
            .snippet("gh")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Gateway))

        val Bloodworks = LatLng(47.6314815783299, -122.16351475858495)
        mMap.addMarker(MarkerOptions()
            .position(Bloodworks)
            .title("Bloodworks Northwest Bellevue Donor Center")
            .snippet("gh")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Bloodworks))

        val Dembi = LatLng(47.589851320365455, -122.16926082211256)
        mMap.addMarker(MarkerOptions()
            .position(Dembi)
            .title("Dembi Dollo Hospital Foundation")
            .snippet("gh")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Dembi))

        val Books = LatLng(47.70369389129993, -122.11983094842093)
        mMap.addMarker(MarkerOptions()
            .position(Books)
            .title("Books of Joy")
            .snippet("gh")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Books))

        val Mona = LatLng(47.625981404399845, -122.14886701767897)
        mMap.addMarker(MarkerOptions()
            .position(Mona)
            .title("Mona Foundation")
            .snippet("gh")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Mona))

        val WaterTrust = LatLng(47.63425661906568, -122.34053604874765)
        mMap.addMarker(MarkerOptions()
            .position(WaterTrust)
            .title("Washington Water Trust")
            .snippet("gh")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(WaterTrust))

        val WaterFirst = LatLng(47.61387473092212, -122.34007465781177)
        mMap.addMarker(MarkerOptions()
            .position(WaterFirst)
            .title("Water First")
            .snippet("gh")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(WaterFirst))

        val Cascade = LatLng(47.45077226824943, -120.30912071445127)
        mMap.addMarker(MarkerOptions()
            .position(Cascade)
            .title("Cascade Columbia Fisheries")
            .snippet("gh")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Cascade))

        val ValueTukwila = LatLng(47.461235, -122.255821)
        mMap.addMarker(MarkerOptions()
            .position(ValueTukwila)
            .title("Tukwila Value Village")
            .snippet("gh")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)))
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(ValueTukwila,zoomlevel))
    }
}