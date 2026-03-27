/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stack;

/**
 *
 * @author pi
 */
public class IOTSensor {
    private int tempeture;
    private int Humidity;
    private int pressure;
    private int pricipitation;
    
    public IOTSensor(){
        this.tempeture=0;
        this.Humidity=0;
        this.pricipitation=0;
        this.pressure=0;
    }

    public int getTempeture() {
        return tempeture;
    }

    public void setTempeture(int tempeture) {
        this.tempeture = tempeture;
    }

    public int getHumidity() {
        return Humidity;
    }

    public void setHumidity(int Humidity) {
        this.Humidity = Humidity;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getPricipitation() {
        return pricipitation;
    }

    public void setPricipitation(int pricipitation) {
        this.pricipitation = pricipitation;
    }
    public void printSensor(){
        System.out.println("temp is "+tempeture+ " pricipitation is "+pricipitation+ " pressure is "+ pressure + " humidity is "+Humidity);
    }
}
