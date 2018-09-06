
package encapsulation;


public class car {
    
    private String modal_name,capacity,grade;
    
    public void bugati(String modal_name,String capacity,String grade){
        this.modal_name = modal_name;
        this.capacity = capacity;
        this.grade = grade;
    }
    
    public void printinfo(){
        System.out.println(modal_name +"\n"+ capacity +"\n"+ grade);
    } 
}
