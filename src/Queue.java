/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author osmar
 */
public class Queue {
    
    int size;
    int start, end;
    int queue[] = new int [size];

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public Queue() {
        //They must be inicializated at -1
        start = -1; //Start is used for delete an item
        end = -1; //End is used for insert an item.
    }
    
    
    public boolean isEmpty(){
        
        if (end == -1)
        {
            return true;
        }
        
        else 
        {
            return false;
        }
        
        
    }
    
    public void enQueue(int item){
        if (!isEmpty())
        {
            javax.swing.JOptionPane.showMessageDialog(null, "The queue is Full");
        }
        
        else
        {
            if(end == -1)
            {
                end = 0;
                start++;
            }
            queue[start] = item;
                javax.swing.JOptionPane.showMessageDialog(null, "Item "+item+" inserted");
        }
        
    }
    
    public int deQueue(){
    
        int item;
        
        if (isEmpty())
        {
            javax.swing.JOptionPane.showMessageDialog(null, "The queue is Empty");
            return -1;
        }
        
        else
        {
            item = queue[end];
        
        
        if (end >= start)
        {
            start = -1;
            end = -1; //If we only have an only element, we reset the queue
        }
    
        else
        {
            end++;
        }
    javax.swing.JOptionPane.showMessageDialog(null, "Item "+item+" eliminated");
    return item;
    }
    }
}
