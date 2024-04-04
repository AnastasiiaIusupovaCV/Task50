/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task50;

/**
 *
 * @author a.yusupova
 */
public class Task50 {
    
    
    public static class NestedClass{
        NestedClass(){
            
        }
        
        public String nestedClassMethod()
        {
            return "It's working!";
        }
    };

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NestedClass c = new NestedClass();
        
        System.out.println(c.nestedClassMethod());
    }
    
}
