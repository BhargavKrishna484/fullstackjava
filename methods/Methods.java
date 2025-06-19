class Methods{
 public void add(){
System.out.println(10+20);
}
 public static void sub(){
System.out.println(10+20);
}
 public void mul( int a,int b){
System.out.println(a*b);
}
 public static void div(int a,int b ){
System.out.println(a/b);
}

public static void main(String []args){
Methods s=new Methods();
s.add();
s.sub();
s.mul(10,20);
s.div(10,20);
}
}