
import java.util.*;
 class percentage{
           float total;
           float marks;
          // use getter 
           public void settotal(float tot){
                total=tot;
           }
           public void setmarks(float mar){
                marks=mar;
           }
           public float perc(){
                  float tot=(float)(total/marks)*100;
                  return tot;
           }}
public class per {
   

    
    public static void main(String args[])
    {
        percentage ob=new percentage();
        ob.settotal(300);
        ob.setmarks(500);
        System.out.println(ob.perc());

    }
}
