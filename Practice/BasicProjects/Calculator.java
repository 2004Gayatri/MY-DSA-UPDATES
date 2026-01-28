import java.util.Scanner;

class Complex {
    double real;
    double imag;
    void readComplex() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter real part: ");
        real = sc.nextDouble();
        System.out.print("Enter imaginary part: ");
        imag = sc.nextDouble();
    }
    // Method to add two complex numbers
    Complex add(Complex c) {
        Complex result = new Complex();
        result.real = this.real + c.real;
        result.imag = this.imag + c.imag;
        return result;
    }

    // Method to subtract two complex numbers
    Complex subtract(Complex c) {
        Complex result = new Complex();
        result.real = this.real - c.real;
        result.imag = this.imag - c.imag;
        return result;
    }

    // Method to multiply two complex numbers
    Complex multiply(Complex c) {
        Complex result = new Complex();
        result.real = this.real * c.real - this.imag * c.imag;
        result.imag = this.real * c.imag + this.imag * c.real;
        return result;
    }

    // Method to display complex number
    void display() {
        System.out.println(real + " + " + imag + "i");
    }
}

public class Calculator {
    public static void main(String[] args) {
        Complex c1 = new Complex();
        Complex c2 = new Complex();

        System.out.println("Enter first complex number:");
        c1.readComplex();

        System.out.println("Enter second complex number:");
        c2.readComplex();

        Complex sum = c1.add(c2);
        Complex diff = c1.subtract(c2);
        Complex prod = c1.multiply(c2);

        System.out.print("Sum: ");
        sum.display();
        System.out.print("Difference: ");
        diff.display();
        System.out.print("Product: ");
        prod.display();
    }
}
