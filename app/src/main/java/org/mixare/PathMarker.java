package org.mixare;

import android.location.Location;

import org.mixare.lib.MixContextInterface;
import org.mixare.lib.MixStateInterface;
import org.mixare.lib.gui.Label;
import org.mixare.lib.gui.PaintScreen;
import org.mixare.lib.marker.Marker;
import org.mixare.lib.marker.draw.ParcelableProperty;
import org.mixare.lib.marker.draw.PrimitiveProperty;
import org.mixare.lib.render.Camera;
import org.mixare.lib.render.MixVector;

public class PathMarker implements Marker {

    private long latitude1;
    private long longitude1;

    private long latitude2;
    private long longitude2;

    private long altitude;

    public PathMarker(long latitude1, long longitude1, long latitude2, long longitude2, long altitude) {
        this.latitude1 = latitude1;
        this.longitude1 = longitude1;
        this.latitude2 = latitude2;
        this.longitude2 = longitude2;
        this.altitude = altitude;
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public String getURL() {
        return null;
    }

    @Override
    public double getLatitude() {
        // 중간값?
        return 0;
    }

    @Override
    public double getLongitude() {
        // 중간값?
        return 0;
    }

    @Override
    public double getAltitude() {
        return altitude;
    }

    @Override
    public MixVector getLocationVector() {
        return null;
    }

    @Override
    public void update(Location curGPSFix) {

    }

    @Override
    public void calcPaint(Camera viewCam, float addX, float addY) {

    }

    @Override
    public void draw(PaintScreen dw) {

    }

    @Override
    public double getDistance() {
        return 0;
    }

    @Override
    public void setDistance(double distance) {

    }

    @Override
    public String getID() {
        return null;
    }

    @Override
    public void setID(String iD) {

    }

    @Override
    public boolean isActive() {
        return false;
    }

    @Override
    public void setActive(boolean active) {

    }

    @Override
    public int getColour() {
        return 0;
    }

    @Override
    public void setTxtLab(Label txtLab) {

    }

    @Override
    public Label getTxtLab() {
        return null;
    }

    @Override
    public boolean fClick(float x, float y, MixContextInterface ctx, MixStateInterface state) {
        return false;
    }

    @Override
    public int getMaxObjects() {
        return 0;
    }

    @Override
    public void setExtras(String name, ParcelableProperty parcelableProperty) {

    }

    @Override
    public void setExtras(String name, PrimitiveProperty primitiveProperty) {

    }

    @Override
    public int compareTo(Marker o) {
        return 0;
    }
}
