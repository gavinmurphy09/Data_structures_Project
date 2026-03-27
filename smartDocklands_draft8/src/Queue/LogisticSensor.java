/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue;

/**
 *
 * @author pi
 */
public class LogisticSensor {
    private int carbonEmissions;
    private int trafficDensity;
    private int airPollution;
    private boolean trafficLight;
    
    public LogisticSensor(){
        this.carbonEmissions=0;
        this.trafficDensity=0;
        this.trafficLight=false;
        this.airPollution=0;
    }

    public int getCarbonEmissions() {
        return carbonEmissions;
    }

    public void setCarbonEmissions(int carbonEmissions) {
        this.carbonEmissions = carbonEmissions;
    }

    public int getTrafficDensity() {
        return trafficDensity;
    }

    public void setTrafficDensity(int trafficDensity) {
        this.trafficDensity = trafficDensity;
    }

    public int getAirPollution() {
        return airPollution;
    }

    public void setAirPollution(int airPollution) {
        this.airPollution = airPollution;
    }

    public boolean isTrafficLight() {
        return trafficLight;
    }

    public void setTrafficLight(boolean trafficLight) {
        this.trafficLight = trafficLight;
    }
    public void printSensor(){
        System.out.println("air Pollution "+airPollution+ " trafficDensity " +trafficDensity+ " carbon emissions "+carbonEmissions);
    }
}
