package javaprograms;

import com.bridgelabz.kotlinprograms.interoperability.MyCustomKotlinFileName;

public class MyJavaFile {

    public static void main(String[] args) {
        int sum = MyCustomKotlinFileName.add(4, 8);
        System.out.println("The Addition of Two Numbers from Java File " +sum);
    }

    public static int getArea(int length, int breadth) {
        return length * breadth;
    }
}
