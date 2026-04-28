/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaStackOperation;

/**
 *
 * @author chala
 */
public class StackApplication {
    public  static void main(String[] args){
        Stack s = new Stack(8);
        
        System.out.println("\n--- pushing 21,74,65,88 ---");
        
        s.push(21);
        s.push(74);
        s.push(65);
        s.push(88);
        
        s.display();
        
        System.out.println("\nPeek: "+s.peek());
        System.out.println("\n=== Pushing 11,55 ===");
        
        s.push(11);
        s.push(55);
        
        s.display();
        System.out.println("\nPeek: "+s.peek());
        
        s.pop();
        
        s.display();
        
        System.out.println("\n=== Pushing 7,3,99 ===");
        
        s.push(7);
        s.push(3);
        s.push(99);
        
        s.push(55);
    }
}
