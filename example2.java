// WAP to accept number and check it is even or odd 
importjava.util.scanner;
class example2{
    
    public static void main(string args[]){
        
        scanners s=new scanners(system.in);
        system.out.println("enter number");
        
        int num=s.nextint();
        
        if(num%2==0){
            system.out.println("even number");
        }
        else{
            system.out.println("odd number");
            
        }
        }
    }
}