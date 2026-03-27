/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue;

import java.util.ArrayList;

/**
 *
 * @author pi
 */
public class Queue implements QueueInterface{
    private ArrayList<LogisticSensor> theQueue;
    
    public Queue(){
        theQueue=new ArrayList<LogisticSensor>();
    }
    @Override
    public boolean isEmpty(){
        return theQueue.isEmpty();
    }
    @Override
    public int size(){
        return theQueue.size();
    }
    @Override
    public LogisticSensor frontElement(){
        if(theQueue.size()>0){
            return theQueue.get(0);
        }else{
            return null;
        }
    }
    
    //adds to the end of the queue, the last index
    @Override
    public void enqueue(LogisticSensor  newItem){
        theQueue.add((LogisticSensor)newItem);
    }
    @Override
    public LogisticSensor dequeue(){
        //removes the first in the queue according to FIFO
        if(theQueue.size()>0){
            return theQueue.remove(0);
        }else{
            return null;
        }
         
    }
    @Override
     public String printQueue(){
         LogisticSensor temp=new LogisticSensor();
         String msg="";
         for(int i=0;i<theQueue.size();i++){
             temp=theQueue.get(i);
             msg=msg.concat("sensor "+i+": Air Pollution = "+temp.getAirPollution()+ " traffic Density = "+temp.getTrafficDensity()+" carbon Emissions = "+temp.getCarbonEmissions()+ "\n");
         }
         return msg;
     }
     @Override
     public String toString(){
         String msg="";
         LogisticSensor temp;
         temp=theQueue.get(0);
         msg=msg.concat("the first sensor is: Air pollution = "+ temp.getAirPollution()+ " traffic Density = " +temp.getTrafficDensity()+ " carbon emissions = "+temp.getCarbonEmissions());
         return msg;
     }
}
