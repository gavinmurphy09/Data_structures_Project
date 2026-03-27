/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Queue;

/**
 *
 * @author pi
 */
public interface QueueInterface {
    public boolean isEmpty();
    
    public int size();
    
    public LogisticSensor frontElement();
    
    public void enqueue(LogisticSensor newItem);
    
    public LogisticSensor dequeue();
    
    public String printQueue();
}
