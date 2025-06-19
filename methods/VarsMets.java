class VarsMets{

static int a=1;
static int b=2;
int c=3;
int d=4;

static void sta1(){
System.out.println("1st static method");
System.out.println(a);
}
static void sta2(){
System.out.println("2nd static method");
System.out.println(b);
}

void int1(){
 System.out.println("1st Instance method"+c);
System.out.println(c);
}

void int2(){
 System.out.println("2st Instance method"+d);
System.out.println(d);
}

static public void main(String [] args){
sta1();
sta2();

VarsMets s=new VarsMets();
s.int1();
s.int2();

}
}