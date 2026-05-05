/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudentGradeManager;

/**
 *
 * @author chala
 */
public class StudentManagerMain {
    public static void main(String[] args){
        StudentManager manager = new StudentManager();
        
        manager.enrollStudent(101, 85);
        manager.enrollStudent(102, 72);
        manager.enrollStudent(103, 90);
        manager.enrollStudent(104, 55);
        manager.enrollStudent(105, 72);
        
        manager.displayAll();
        System.out.println();
        
        manager.enrollAtPosition(106, 88, 2);
        manager.displayAll();
        
        System.out.println("\nSearch for StudentID 103:");
        manager.searchById(103);
        
        System.out.println("\nSearch students with grade between 70 and ");
        manager.searchByGradeRange(70, 90);
        
        System.out.println("\nDelete student with Id 104: ");
        manager.deleteById(104);
        manager.displayAll();
        
        System.out.println("\nDelete students with grade 72: ");
        manager.deleteByGrade(72);
        manager.displayAll();
        
        System.out.println("\nEnroll Duplicate Student:");
        manager.enrollStudent(101, 60);
    }
}
