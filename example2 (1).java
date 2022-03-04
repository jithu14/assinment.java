improtjava.util,scanner;
 // WAP to print n-1 numbers
 class LoopExample{
     
    public static void main (string arys[]){
        
        scanner s=new scanner(system.in);
        
        system.out.println("enter n value");
        int n=s.nextInt();
        
        int i=0;
        for(i=n;i>=1;i--){
            system.out.print(i+"");
            
        }
         
    }
 }