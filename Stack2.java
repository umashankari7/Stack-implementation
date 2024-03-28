class Stack3{
  int size, arr[], top=-1;
  Stack3(int size){
    this.size=size;
    this.arr=new int[size];

  }
boolean isFull(){
  return top==size-1;
}
boolean isEmpty(){
  return top==-1;
}
void push(int n){
  if(isFull()){
    System.out.println("stack overflow");
    return;
  }
  arr[++top]=n;
}
 int pop(){
  if(isEmpty()){
    System.out.println("stack underflow");
    return -1;
  }
  return arr[top--];
}
int getSize(){
  return top+1;
}
int peek(){
  if(isEmpty()){
    System.out.println("stack underflow");
    return -1;
  }
  return arr[top];
}
int search(int n){
  int x=top;
  while(x>=0){
    if(arr[x]==n){
      return top-x+1;
    }
    x--;
  }
  return -1;
}
void display(){
  for(int i=0;i<=top;i++){
    System.out.print(arr[i]+" ");
  }

  System.out.println("");
}
}
public class Stack2 {
  public static void main(String[] args) {
  Stack3 s3=new Stack3(5);
  s3.push(10);
  s3.push(20);
  s3.push(30);
  s3.display();
  s3.pop( );
  s3.display();
  System.out.println(s3.search(50));


  }
}
