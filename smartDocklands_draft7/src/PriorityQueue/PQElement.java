/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PriorityQueue;

/**
 *
 * @author pi
 */
public class PQElement {
    
    private int iKey;
    private environmentDrone drone;
    private int locationX;
    private int locationY;
    private int locationZ;
    
    
    
    public PQElement(int iPriority, environmentDrone drone){
        this.iKey=iPriority;
        this.drone=drone;
    }

    public int getiKey() {
        return iKey;
    }

    public environmentDrone getDrone() {
        return drone;
    }

    public void setiKey(int iKey) {
        this.iKey = iKey;
    }

    public void setDrone(environmentDrone drone) {
        this.drone = drone;
    }
    
    
    public String printDrone(){
        String msg;
        locationX=drone.getLocation()[0];
        locationY=drone.getLocation()[1];
        locationZ=drone.getLocation()[2];
        
        msg="location is "+locationX+" "+ locationY+" "+locationZ+ " tempeture is "+drone.getTempeture()+" humidity is "+drone.getHumidity()+" windspeed is "+ drone.getWindSpeed()+"\n";
        return msg;
    }
    
}
