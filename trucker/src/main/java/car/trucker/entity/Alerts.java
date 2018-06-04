package car.trucker.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alerts {
    private int engineRpm;
    private int redlineRpm;
    private double fuelVolume;
    private int maxFuelVolume;
    private int tiresfrontLeft;
    private int tiresfrontRight;
    private int tiresrearLeft;
    private int tiresrearRight;
    private boolean checkEngineLightOn;
    private boolean engineCoolantLow;
    @Id
    @Column(columnDefinition = "VARCHAR(36)")
    private String priority;
    TruckerReadings tr=new TruckerReadings();
    TruckerVehicles tv=new TruckerVehicles();
    public void setEngineRpm(int engineRpm) {

        this.engineRpm = tr.engineRpm;
    }

    public void setRedlineRpm(int redlineRpm) {

        this.redlineRpm = tv.redlineRpm;
    }

    public void setFuelVolume(double fuelVolume) {

        this.fuelVolume = tr.fuelVolume;
    }

    public void setMaxFuelVolume(int maxFuelVolume) {
        this.maxFuelVolume = tv.maxFuelVolume;
    }

    public void setTiresfrontLeft(int tiresfrontLeft) {
        this.tiresfrontLeft = tr.tiresfrontLeft;
    }


    public void setTiresfrontRight(int tiresfrontRight) {
        this.tiresfrontRight = tr.tiresfrontRight;
    }

    public void setTiresrearLeft(int tiresrearLeft) {
        this.tiresrearLeft = tr.tiresrearLeft;
    }

    public void setTiresrearRight(int tiresrearRight) {
        this.tiresrearRight = tr.tiresrearRight;
    }

    public void setCheckEngineLightOn(boolean checkEngineLightOn) {
        this.checkEngineLightOn = checkEngineLightOn;
    }

    public void setEngineCoolantLow(boolean engineCoolantLow) {
        this.engineCoolantLow = engineCoolantLow;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        if(engineRpm>redlineRpm){
            this.priority = "HIGH";
        }
        else if(fuelVolume<(0.1*maxFuelVolume))
            this.priority="MEDIUM";
        else if((tiresfrontLeft<32||tiresfrontLeft>36)||(tiresfrontRight<32||tiresfrontRight>36)||(tiresrearRight<32||tiresrearRight>36)||(tiresrearLeft<32||tiresrearLeft>36))
            this.priority="LOW";
        else if(checkEngineLightOn==true||engineCoolantLow==true)
            this.priority="LOW";
    }

    @Override
    public String toString() {
        return "Alerts{" +
                "engineRpm=" + engineRpm +
                ", redlineRpm=" + redlineRpm +
                ", fuelVolume=" + fuelVolume +
                ", maxFuelVolume=" + maxFuelVolume +
                ", tiresfrontLeft=" + tiresfrontLeft +
                ", tiresfrontRight=" + tiresfrontRight +
                ", tiresrearLeft=" + tiresrearLeft +
                ", tiresrearRight=" + tiresrearRight +
                ", checkEngineLightOn=" + checkEngineLightOn +
                ", engineCoolantLow=" + engineCoolantLow +
                ", priority='" + priority + '\'' +
                ", tr=" + tr +
                ", tv=" + tv +
                '}';
    }
}
