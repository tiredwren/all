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
            .snippet("Address: 625 228th Ave NE, Sammamish, WA 98074")
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
            .snippet("Address: 15301 NE 24th St, Redmond, WA 98052")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(GoodwillRedmond))

        val GoodwillRenton = LatLng(47.504620, -122.178190)
        mMap.addMarker(MarkerOptions()
            .position(GoodwillRenton)
            .title("Renton Goodwill")
            .snippet("Address: 3210 Sunset Blvd NE, Renton, WA 98056")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(GoodwillRenton))

        val GoodwillWoodinville = LatLng(47.754507, -122.157742)
        mMap.addMarker(MarkerOptions()
            .position(GoodwillWoodinville)
            .title("Woodinville Goodwill")
            .snippet("Address: 17524 131st Ave NE, Woodinville, WA 98072")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(GoodwillWoodinville))

        val GoodwillJuanita = LatLng(47.707735, -122.198863)
        mMap.addMarker(MarkerOptions()
            .position(GoodwillJuanita)
            .title("Juanita Goodwill")
            .snippet("Address: 9826 NE 132nd St, Kirkland, WA 98034")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(GoodwillJuanita))

        val GoodwillKent = LatLng(47.383976, -122.239829)
        mMap.addMarker(MarkerOptions()
            .position(GoodwillKent)
            .title("Kent Goodwill")
            .snippet("Address: 315 Washington Ave S, Kent, WA 98032")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(GoodwillKent))

        val GoodwillAuburn = LatLng(47.296623, -122.222536)
        mMap.addMarker(MarkerOptions()
            .position(GoodwillAuburn)
            .title("Auburn Goodwill")
            .snippet("Address: 1519 Auburn Way S, Auburn, WA 98002")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(GoodwillAuburn))

        val GoodwillFederalWay = LatLng(47.308254, -122.315566)
        mMap.addMarker(MarkerOptions()
            .position(GoodwillFederalWay)
            .title("Federal Way Goodwill")
            .snippet("Address: 32521 Pacific Hwy S, Federal Way, WA 98003")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(GoodwillFederalWay))

        val GoodwillPuyallup = LatLng(47.191512, -122.292633)
        mMap.addMarker(MarkerOptions()
            .position(GoodwillPuyallup)
            .title("Puyallup Goodwill")
            .snippet("Address: 12915 Meridian Ave E, Puyallup, WA 98373")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(GoodwillPuyallup))

        val GoodwillBonneyLake = LatLng(47.177889, -122.171853)
        mMap.addMarker(MarkerOptions()
            .position(GoodwillBonneyLake)
            .title("Bonney Lake Goodwill")
            .snippet("Address: 21153 WA-410, Bonney Lake, WA 98391")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(GoodwillBonneyLake))

        val GoodwillSumner = LatLng(47.206278, -122.237679)
        mMap.addMarker(MarkerOptions()
            .position(GoodwillSumner)
            .title("Sumner Goodwill")
            .snippet("Address: 926 Main St #101, Sumner, WA 98390")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(GoodwillSumner))

        // Value Village Locations
        val ValueIssaquah = LatLng(47.554133, -122.060372)
        mMap.addMarker(MarkerOptions()
            .position(ValueIssaquah)
            .title("Issaquah Value Village")
            .snippet("Address: 5530 E Lake Sammamish Pkwy SE, Issaquah, WA 98029")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ValueIssaquah))

        val ValueWoodinville = LatLng(47.755983753433604,  -122.15089202347497)
        mMap.addMarker(MarkerOptions()
            .position(ValueWoodinville)
            .title("Woodinville Value Village")
            .snippet("Address: 17524 131st Ave NE, Woodinville, WA 98072")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ValueWoodinville))

        val ValueKent = LatLng(47.3862690670405, -122.20063680999802)
        mMap.addMarker(MarkerOptions()
            .position(ValueKent)
            .title("Kent Value Village")
            .snippet("Address: 24034 104th Ave SE, Kent, WA 98030")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ValueKent))

        val ValueLynwood = LatLng(47.84232297920507, -122.29858396209954)
        mMap.addMarker(MarkerOptions()
            .position(ValueLynwood)
            .title("Lynwood Value Village")
            .snippet("Address: 17216 Hwy 99, Lynnwood, WA 98037")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ValueLynwood))

        val ValueEverett = LatLng(47.94147736344533, -122.21862158168027)
        mMap.addMarker(MarkerOptions()
            .position(ValueEverett)
            .title("Everett Value Village")
            .snippet("Address: 6220 Evergreen Way, Everett, WA 98203")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ValueEverett))

        val ValuePuyallup = LatLng(47.20228373478941, -122.30968690260543)
        mMap.addMarker(MarkerOptions()
            .position(ValuePuyallup)
            .title("Puyallup Value Village")
            .snippet("Address: 1124 River Rd, Puyallup, WA 98371")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ValuePuyallup))

        //Other locations
        val Hopelink = LatLng(47.61360124963741, -122.14127698762375)
        mMap.addMarker(MarkerOptions()
            .position(Hopelink)
            .title("Hopelink")
            .snippet("Address: 14812 Main St, Bellevue, WA 98007")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Hopelink))

        val Jubilee = LatLng(47.640569691755076, -122.30627330390747)
        mMap.addMarker(MarkerOptions()
            .position(Jubilee)
            .title("Jubilee Women's Center")
            .snippet("Address: 620 18th Ave E, Seattle, WA 98112")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Jubilee))

        val KidVantage = LatLng(47.62273537675142, -122.62849445843956)
        mMap.addMarker(MarkerOptions()
            .position(KidVantage)
            .title("KidVantage Bremerton")
            .snippet("Address: 1463 NE Dawn Rd, Bremerton, WA 98311")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(KidVantage))

        val T2P2 = LatLng(47.73705696109788, -122.34549124031129)
        mMap.addMarker(MarkerOptions()
            .position(T2P2)
            .title("T2P2")
            .snippet("13555 Aurora Ave N, Seattle, WA 98133")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(T2P2))

        val IssaquahFood = LatLng(47.53156081333957, -122.03547623142943)
        mMap.addMarker(MarkerOptions()
            .position(IssaquahFood)
            .title("Issaquah Food and Clothing Bank")
            .snippet("179 1st Ave SE, Issaquah, WA 98027")
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
            .snippet("14200 SE 13th Pl, Bellevue, WA 98007")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Vision))

        val Bridge = LatLng(47.63475016637949, -122.17536410394223)
        mMap.addMarker(MarkerOptions()
            .position(Bridge)
            .title("Bridge Disability Ministries")
            .snippet("12356 Northup Way, Bellevue, WA 98005")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Bridge))

        val Match = LatLng(47.614964328455706, -122.33858430459559)
        mMap.addMarker(MarkerOptions()
            .position(Match)
            .title("Be The Match Collection Center Seattle")
            .snippet("314 Stewart St, Seattle, WA 98101")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Match))

        val Gateway = LatLng(47.42937242685027, -122.22858123906539)
        mMap.addMarker(MarkerOptions()
            .position(Gateway)
            .title("Gateway Medical Alliance")
            .snippet("8247 S 194th St, Kent, WA 98032")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Gateway))

        val Bloodworks = LatLng(47.6314815783299, -122.16351475858495)
        mMap.addMarker(MarkerOptions()
            .position(Bloodworks)
            .title("Bloodworks Northwest Bellevue Donor Center")
            .snippet("1807 132nd Ave NE #2249, Bellevue, WA 98005")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Bloodworks))

        val Dembi = LatLng(47.589851320365455, -122.16926082211256)
        mMap.addMarker(MarkerOptions()
            .position(Dembi)
            .title("Dembi Dollo Hospital Foundation")
            .snippet("13405 SE 59th St, Bellevue, WA 98006")
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
            .snippet("14400 Bel-Red Rd, Bellevue, WA 98007")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Mona))

        val WaterTrust = LatLng(47.63425661906568, -122.34053604874765)
        mMap.addMarker(MarkerOptions()
            .position(WaterTrust)
            .title("Washington Water Trust")
            .snippet("1500 Westlake Ave N #202, Seattle, WA 98109")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(WaterTrust))

        val WaterFirst = LatLng(47.61387473092212, -122.34007465781177)
        mMap.addMarker(MarkerOptions()
            .position(WaterFirst)
            .title("Water First")
            .snippet("1904 3rd Ave #1012, Seattle, WA 98101")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(WaterFirst))

        val Cascade = LatLng(47.45077226824943, -120.30912071445127)
        mMap.addMarker(MarkerOptions()
            .position(Cascade)
            .title("Cascade Columbia Fisheries")
            .snippet("25 N Wenatchee Ave #203, Wenatchee, WA 98801")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Cascade))

        val ValueTukwila = LatLng(47.461235, -122.255821)
        mMap.addMarker(MarkerOptions()
            .position(ValueTukwila)
            .title("Tukwila Value Village")
            .snippet("Address: 16700 Southcenter Pkwy, Tukwila, WA 98188")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)))
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(ValueTukwila,zoomlevel))
    }
}