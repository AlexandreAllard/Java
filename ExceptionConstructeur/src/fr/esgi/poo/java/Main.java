package fr.esgi.poo.java;

public class Main {
    public static void main (String[] args) throws Exception {

      try {
          EventNumber event1 = new EventNumber(4);
          System.out.println(event1.getValue());
          EventNumber event2 = new EventNumber(2);
          EventNumber event3 = new EventNumber(5);

      } catch(Exception e){
          System.out.println(e.getMessage());
      }

        try {
            EventNumber event1 = new EventNumber(4);
            EventNumber event2 = new EventNumber(2, false);
            EventNumber event3 = new EventNumber(5);
        } catch(RuntimeException z){
            System.out.println(z.getMessage());
        }

    }
}
