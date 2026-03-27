/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PriorityQueue;

import java.util.ArrayList;

/**
 *
 * @author pi
 */
public class PriorityQueue implements PQInterface{
    private ArrayList<PQElement> thePQueue;

    public PriorityQueue(){
        thePQueue = new ArrayList<PQElement>();
    
    }
    @Override
    public boolean isEmpty(){
        return thePQueue.isEmpty();
    }
    @Override
    public int size(){
        return thePQueue.size();
    }
     @Override
     public void enqueue(int iPriorityKey, environmentDrone drone){
         int index;
         PQElement newElement = new PQElement(iPriorityKey, drone);
         
         index= findInsertPosition(iPriorityKey);
         
         if (index==size()){
             thePQueue.add(newElement);
         }else{
             thePQueue.add(index, newElement);
         }
         
     }
     
     public int findInsertPosition(int newKey){
         boolean bFound=false;
         int iPosition=0;
         PQElement curElement;
         while(iPosition < thePQueue.size() && !bFound){
             curElement= thePQueue.get(iPosition);
             if(curElement.getiKey()> newKey){
                 iPosition=iPosition+1;
             }else{
                 bFound=true;
             }
             
         }
         return iPosition;
     }
     @Override
     public Object dequeue(){
         return thePQueue.remove(0);
     }
     @Override
     public PQElement get(int pos){
         return thePQueue.get(pos);
         
     }
     @Override
     public String printQueue(){
         String msg="";
         PQElement curElement;
         for(int i=0;i<thePQueue.size();i++){
             curElement=thePQueue.get(i);
             msg="data = "+  msg.concat(curElement.printDrone())+ " Priority key = "+curElement.getiKey()+"\n";
         }
         return msg;
     }
     
}