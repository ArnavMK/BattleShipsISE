public class Printing {

    public static void main(String[] args) {
    
      System.out.print( "   0 1 2 3 4 5 6 7 8 9 " );
    
      System.out.print("\n");

    
      for (int i = 0; i <10; i++ ) {
         System.out.print(i + " ");
            for (int j = 0; j < 10; j++) {
               System.out.print( " *" ); 
            }
          
      System.out.print("\n");
      }
    }
    
    Grid grid = new Grid(); 
      
}
