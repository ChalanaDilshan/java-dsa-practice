/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudentGradeManager;

/**
 *
 * @author chala
 */
public class StudentManager {
    int[] studentIDs;
    int[] grades;
    int count;
    
    public StudentManager(){
        studentIDs = new int[15];
        grades = new int[15];
        count = 0;
    }
    
    public boolean isFull(){
        return count == 15;
    }
    
    public void displayAll(){
        System.out.println("=== Enrolled Students ===");
        if(count == 0){
            System.out.println("No Students enrolled..");
            return;
        }
        
        for(int i = 0; i < count; i++){
            System.out.println(studentIDs[i]+" "+grades[i]);
        }
    }
    
    public void searchById(int id){
        
        if(count == 0){
            System.out.println("No Students Enrolled..");
            return;
        }
        
        boolean found = false;
        
        for(int i = 0; i < count;i++){
            if(studentIDs[i] == id){
                System.out.println(id+" exists at index:"+i);
                found = true;
            }
        }
        
        if(!found){
            System.out.println(id+" does not exists.");
            return;
        }
    }
    
    public void enrollStudent(int id,int grade){
        if(isFull()){
            System.out.println("Cannot enroll. Stack is full");
            return;
        }
        
        for(int i = 0; i < count; i++){
            if(studentIDs[i] == id){
                System.out.println("Student "+id+" already exists..");
                return;
            }
        }
        
        studentIDs[count] = id;
        grades[count] = grade;
        count++;
    }
    
    public void enrollAtPosition(int id,int grade,int pos){
        if(isFull() || pos < 0|| pos > count){
            System.out.println("Cannot enroll in that positions");
            return;
        }
        
        for(int i = 0; i < count; i++){
            if(studentIDs[i] == id){
                System.out.println(id+" already exists.");
                return;
            }
        }
        
        for(int i = count; i > pos; i--){
            studentIDs[i] = studentIDs[i - 1];
            grades[i] = grades[i - 1]; 
        }
        
        studentIDs[pos] = id;
        grades[pos] = grade;
        
        count++;
                
    }
    
    public void searchByGradeRange(int min,int max){
        if(count == 0){
            System.out.println("No students enrolled.");
            return;
        }
        
        boolean found = false;
        
        for(int i = 0; i < count; i++){
            if(studentIDs[i] >= min && studentIDs[i] <= max){
                System.out.println(studentIDs[i]+" "+grades[i]);
                found = true;
            }
        }
        
        if(!found){
            System.out.println("Cannot find any grade in that range");
        }
    }
    
    public void deleteById(int id){
        
        if(count == 0){
            System.out.println("No students Enrolled");
            return;
        }
        
        int index = -1;
        
        for(int i = 0; i < count; i++){
            if(studentIDs[i] == id){
                index = i;
                break;
            }
        }
        
        if(index == -1){
            System.out.println("Can not find student id");
            return;
        }
        
        for(int i = index; i < count -1; i++ ){
            studentIDs[i] = studentIDs[i + 1];
            grades[i] = grades[i + 1];
        }
        
        count--;
        System.out.println("Student "+id+ " removed.");
    }
    
    public void deleteByGrade(int grade){
        if(count == 0){
            System.out.println("No students Enrolled.");
            return;
        }
        
        int removed = 0;
        
        for(int i = 0; i < count; i++){
            if(grades[i] == grade){
                for(int j = i; j < count -1; j++){
                    studentIDs[j] = studentIDs[ j + 1];
                    grades[j] = grades[ j + 1];
                }
                
                count--;
                removed++;
                i--;
                
            }
        }
        System.out.println(removed+" records removed.");
    }
}
    


