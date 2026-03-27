/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stack;

import java.util.ArrayList;

/**
 *
 * @author pi
 */
public class Stack implements StackInterface{
    private ArrayList<IOTSensor> theStack;
    
    public Stack(){
        
        theStack=new ArrayList<IOTSensor>();
    }
    @Override
    public int size(){
        return theStack.size();
    }
    @Override
    public boolean isEmpty(){
        return theStack.isEmpty();
    }
    @Override
    public boolean isFull(){
        return false;
    }
    @Override
    public Object pop(){
        if(!(theStack.isEmpty())){
            return theStack.remove(0);
        }else{
            return null;
        }
    }
    @Override
    public String displayStack(){
        
        IOTSensor temp = new IOTSensor();
        String msg="";
        if(theStack.isEmpty()){
            msg=msg.concat("the stack is empty");
        }else{
            msg="the stack Contains Sensors:";
            for(int count=0;count<theStack.size();count++){
                temp=theStack.get(count);
                msg=msg.concat("humidity: "+temp.getHumidity()+ " pressure: "+ temp.getPressure()+" tempeture: "+temp.getTempeture());
                msg=msg.concat("\n");
            }
        }
        return msg;
    }
    @Override
    public void push(IOTSensor temp){
        theStack.add(0,temp);
    }
    @Override
    public void emptyStack(){
        for(int i=0;i<size();i++){
            pop();
        }
    }
    
}
