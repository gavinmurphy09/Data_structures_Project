/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package PriorityQueue;

/**
 *
 * @author pi
 */
public interface PQInterface {
    
    public void enqueue(int priorityKey, environmentDrone drone);
    
    public Object dequeue();
    
    public int size();
    
    public boolean isEmpty();
    
    public String printQueue();
    
    public PQElement get(int pos);
}
