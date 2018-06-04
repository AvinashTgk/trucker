package car.trucker.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TruckerReadings {

    @Id
    @Column(columnDefinition = "VARCHAR(36)")
    private String vin;
    private double latitude;
    private double longitude;
    private String timestamp;
    public double fuelVolume;
    private int speed;
    private int engineHp;
    public boolean checkEngineLightOn;
    public boolean engineCoolantLow;
    private boolean cruiseControlOn;
    public int engineRpm;
    public int tiresfrontLeft;
    public int tiresfrontRight;
    public int tiresrearLeft;
    public int tiresrearRight;

    public int getTiresfrontLeft() {
        return tiresfrontLeft;
    }

    public void setTiresfrontLeft(int tiresfrontLeft) {
        this.tiresfrontLeft = tiresfrontLeft;
    }

    public int getTiresfrontRight() {
        return tiresfrontRight;
    }

    public void setTiresfrontRight(int tiresfrontRight) {
        this.tiresfrontRight = tiresfrontRight;
    }

    public int getTiresrearLeft() {
        return tiresrearLeft;
    }

    public void setTiresrearLeft(int tiresrearLeft) {
        this.tiresrearLeft = tiresrearLeft;
    }

    public int getTiresrearRight() {
        return tiresrearRight;
    }

    public void setTiresrearRight(int tiresrearRight) {
        this.tiresrearRight = tiresrearRight;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public double getFuelVolume() {
        return fuelVolume;
    }

    public void setFuelVolume(double fuelVolume) {
        this.fuelVolume = fuelVolume;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getEngineHp() {
        return engineHp;
    }

    public void setEngineHp(int engineHp) {
        this.engineHp = engineHp;
    }

    public boolean isCheckEngineLightOn() {
        return checkEngineLightOn;
    }

    public void setCheckEngineLightOn(boolean checkEngineLightOn) {
        this.checkEngineLightOn = checkEngineLightOn;
    }

    public boolean isEngineCoolantLow() {
        return engineCoolantLow;
    }

    public void setEngineCoolantLow(boolean engineCoolantLow) {
        this.engineCoolantLow = engineCoolantLow;
    }

    public boolean isCruiseControlOn() {
        return cruiseControlOn;
    }

    public void setCruiseControlOn(boolean cruiseControlOn) {
        this.cruiseControlOn = cruiseControlOn;
    }

    public int getEngineRpm() {
        return engineRpm;
    }

    public void setEngineRpm(int engineRpm) {
        this.engineRpm = engineRpm;
    }

    }
