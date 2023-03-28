
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anupam_pathak
 */
public class Herd implements Movable{
    private List<Movable> herd;
    
    public Herd(){
        this.herd = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable){
        this.herd.add(movable);
    }
    
    public void move(int dx, int dy){
        for(Movable movable:this.herd){
            movable.move(dx, dy);
        }
    }
    
    public String toString(){
        
        StringBuilder sb = new StringBuilder();
        for(Movable movable:this.herd){
            sb.append(movable.toString()).append("\n");
        }
        return sb.toString();
    }
    
}
