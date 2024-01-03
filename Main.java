// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

class Main {
    public static void main(final String[] args) {
    
     int [] weather = new int[4];
      weather[0] = 80;
      weather[1] = 70;
      weather[2] = 90;
      weather[3] = 25;
      
      weather[2] = weather[2] + 5;
  
      for(int temp : weather){
        System.out.println(temp);
      }
      
      
    }
  
    // @Test
    // void addition() {
    //     assertEquals(2, 1 + 1);
    // }
  }