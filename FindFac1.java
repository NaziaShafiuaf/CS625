class FindFac1 {
public static void main(String args[]) {
for(int i=2; i <= 100; i++) {
System.out.println("Factorial of " + i + ": ");
for(int j = 2; j < i; j++)
if((i%j) == 0) System.out.println(j + " ");
System.out.println();
}
}
}