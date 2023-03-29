import java.util.Scanner;

public class QuadraticEqiation {
    private double a,b,c;
    public QuadraticEqiation(){
    }
    public QuadraticEqiation (double a, double b,double c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double getDiscriminant(){
        return (b*b) -4*a*c;
    }
    public double getRoot1(){
        if (getDiscriminant()>=0)
        return (-b + Math.pow(getDiscriminant(),0.5))/(2*a);
         return 0;
    }
    public double getRoot2() {
        if (getDiscriminant()>=0)
            return (-b - Math.pow(getDiscriminant(),0.5))/(2*a);
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a= sc.nextDouble();
        double b= sc.nextDouble();
        double c=sc.nextDouble();
        QuadraticEqiation myOne= new QuadraticEqiation(a,b,c);
        if (myOne.getDiscriminant()>0) {
            System.out.println(" The equation  has two roots" + myOne.getRoot1() + " and " + myOne.getRoot2());
        } else if (myOne.getDiscriminant()==0) {
            System.out.println(" The equation has one root -1");
        } else System.out.println("The equation has no real roots");
    }
}
