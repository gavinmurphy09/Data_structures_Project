/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PriorityQueue;

/**
 *
 * @author pi
 */
public class environmentDrone {
    private int tempeture;
    private int humidity;
    private int windSpeed;
    private int[] location ={0,0,0};
    
    public int getTempeture(){
        return tempeture;
    }
    public int getHumidity(){
        return humidity;
    }
    public int getWindSpeed(){
        return windSpeed;
    }
    public int[] getLocation(){
        return location;
    }

    public void setTempeture(int tempeture) {
        this.tempeture = tempeture;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public void setWindSpeed(int windSpeed) {
        this.windSpeed = windSpeed;
    }

    public void setLocation(int[] location) {
        this.location = location;
    }
    
}
