package snippet;

class Super {
int i;
void display() {
System.out.println(i);
}
} 
class Sub extends Super {
int j;
void display() {
System.out.println(j);
}
} 
public class MethodOverriding {
public static void main(String args[]){
Sub obj = new Sub();
obj.i=1;
obj.j=2; 
obj.display(); 
}
}