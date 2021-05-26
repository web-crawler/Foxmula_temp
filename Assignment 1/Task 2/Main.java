public class Stack{
  private int s[];
  private int top,max;
  Stack(int i){
    max=i;
    s=new int[max];
    top=-1;
  }
  void push(int data){
    if(top==max){
      System.out.println("Stack overflow");
    }
    else{
      s[++top]=data;
    }
  }
  int pop(){
    if(top==-1)
    {
      System.out.println("Stack overflow");
      return 0;
    }
    else{
      return s[top--];
    }
  }
  boolean checkEmpty(){
    if(max==-1){
      return true;
    }
    else{
      return false;
    }
  }
  public int count(){
    if(top>-1)
      return top+1;
    else
      return 0;
  }
}
import java.util.*;
public class StackImp{
  public voi display(Stack st1, Stack st2){
    if(st1.count()==st2.count()){
      System.out.println("Total no. of elements in both stack is:"+st2.count());
    }
  }
public class Main(){
public static void main(String []args){
  Scanner sc=new Scanner(System.in);
  Stack s1=new Stack(20);
  Stack s2=new Stack(20);
  int ch, data;
  StackImp si=new StackImp();
  while(true){
    System.ou.println("\n1. Push in Stack 1");
    System.ou.println("\n2 Push in Stack 2");
    System.ou.println("\n3. Pop in Stack 1");
    System.ou.println("\n4. Push in Stack 2");
    ch=sc.nextInt();
    switch(ch){
      case 1:
        System.out.println("Enter the data");
        data=sc.nextInt();
        s1.push(data);
        si.display(s1,s2);
        break;
      case 2:
        System.out.println("Enter the data");
        data=sc.nextInt();
        s2.push(data);
        si.display(s1,s2);
        break;
      case 3:
        System.out.println(s1.pop());
        si.display(s1,s2);
        break;
      case 4:
        System.out.println(s1.pop());
        si.display(s1,s2);
        break;
    }
  }
}
}
}       
}
