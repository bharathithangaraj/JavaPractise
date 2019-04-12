package Coolection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;


public class TestSortedList {

       /**
       * @param args
       */
       public static void main(String[] args) {
              Empl1 e1= new Empl1("sunny","test");
              Empl1 e2= new Empl1("sunny","deol");
              Empl1 e3 = new Empl1("sunny", "day");
              Empl1 e4 = new Empl1("anal", "test1");
              Empl1 e5 = new Empl1("anal", "test2");
              
              List<Empl1> list1 = new ArrayList<Empl1>();
              list1.add(e1);
              list1.add(e2);
              list1.add(e3);
              list1.add(e4);
              list1.add(e5);
              
              //System.out.println(list1);
              
              Collections.sort(list1, new Comparator<Empl1>() {

                  @Override
                  public int compare(Empl1 a1, Empl1 a2) {
                        
                        return a1.getLastname().compareTo(a2.getLastname());
                  }
                  
           });
              System.out.println(list1);
              
              Collections.sort(list1, new Comparator<Empl1>() {

                     @Override
                     public int compare(Empl1 a1, Empl1 a2) {
                           
                           return a1.getFirstName().compareTo(a2.getFirstName());
                     }
                     
              });
              
              System.out.println(list1);
              
              /*LinkedList<Empl1> list2 = new LinkedList<Empl1>(list1);
              
              System.out.println("list1 :"+list2);*/
              
       }

}

class Empl1 {
       String firstName;
       String Lastname ;
       
       public Empl1(String firstName, String Lastname) {
              this.firstName = firstName;
              this.Lastname = Lastname;
       }
       public String getFirstName() {
              return firstName;
       }
       public void setFirstName(String firstName) {
              this.firstName = firstName;
       }
       public String getLastname() {
              return Lastname;
       }
       public void setLastname(String lastname) {
              Lastname = lastname;
       }
       
       public String toString(){
              return this.firstName+":"+this.Lastname;
       }
}
