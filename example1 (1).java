// WAP to read int,float,double,sting values from user and print all the o/p screen

importjava.util.scanner
class exampele1{
    
    public viod main(sting args[]){
        
        int a=0;
        floatb=0;
        double c=0.0;
        string str=null;
        
        scanner s=new scanner(system.in);
        
        system.out.println("enter int value");
        a=s.nextint();
        
        system.out.println("enter float value");
        b=s.nextfloat();
        
        system.out.println("enter double value");
        c=s.nextdouble();
        
        system.out.println("int value is:"+a);
        system.out.println("float value is:"+b);
        system.out.println("double value is":+c);
        
        system.out.println("enter sting value");
        str=s.net();
        system.out.println();
        
        system.out.println("string value is:"+str);
        
    }
}