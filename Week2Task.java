import java.util.Scanner;
public class Week2Task{
    Scanner sc= new Scanner(System.in);

    void vote(){
        System.out.println("enter your age:");
        int age = sc.nextInt();

        String output;
        output=(age>=18 ? "eligible to vote":"not eligible to vote");
        System.out.println(output);
    }

    void simpleInterest(){
        System.out.println("enter principal amount:");
        float PrincipalAmount = sc.nextFloat();

        System.out.println("enter time:");
        float Time = sc.nextFloat();

        System.out.println("enter interest rate:");
        float Rate = sc.nextFloat();

        System.out.println("The Simple Interest is:"+((PrincipalAmount*Time*Rate)/100));
    }

    void areaTriangle(){

        System.out.println("enter breadth of triangle: ");
        float b = sc.nextFloat();
    
        System.out.println("enter height of triangle: ");
        float h = sc.nextFloat();

        System.out.println("Area of traingle is: "+(0.5*b*h));

    }

    void volumnCube(){

        System.out.println("enter side of cube: ");
        float side = sc.nextFloat();

        System.out.println("Volumn of cube is: "+(side*side*side));

    }

    void volumnCuboid(){

        System.out.println("enter length of cuboid: ");
        float length = sc.nextFloat();

        System.out.println("enter width of cuboid: ");
        float width = sc.nextFloat();

        System.out.println("enter height of cuboid: ");
        float height = sc.nextFloat();

        System.out.println("Area of traingle is: "+(length*width*height));

    }

    void votingRule(){
        System.out.println("enter your age: ");
        int age = sc.nextInt();
        String check;
        check= (age>=18 ? "eligible to vote": "not eligible to vote");
        System.out.println("You are "+ check);
    }

    void sumProduct(){
        System.out.println("enter first number: ");
        int num1 = sc.nextInt();

        System.out.println("\nenter second number: ");
        int num2 = sc.nextInt();

        int sum= num1+num2;
        System.out.println("Sum of numbers "+num1+" and "+num2+" is: "+sum);
        
        float product= num1+num2;
        System.out.println("Product of numbers '"+num1+"'' and '"+num2+"'' is: "+product);
    }


    void divisionTwo(){

        System.out.println("enter first number: ");
        float num1= sc.nextFloat();

        System.out.println("enter second number: ");
        float num2= sc.nextFloat();

        float sum = num1+num2;
        float product = num1*num2;
        float division= product/sum;

        System.out.println("The division of summed value '"+sum+"' and product value '"+product+"' is : "+division);
    }

    void format(){
        System.out.println("enter your name: ");
        String name = sc.nextLine();

        System.out.println("enter your roll number: ");
        int rollNumber= sc.nextInt();
        sc.nextLine();

        System.out.println("enter your field of interest: ");
        String interest = sc.nextLine();

        System.out.println("Hey, my name is "+name+" and my roll number is "+rollNumber+". My field of interst are "+interest+".");
    }

    void areaSquare(){
        System.out.println("enter side of sqaure: ");
        Float side= sc.nextFloat();

        Float area = side*side;
        Float perimeter = 4*side;

        System.out.println("Area of square: "+area);
        System.out.println("Perimeter of square: "+perimeter);

    }

    void areaRectangle(){
        System.out.println("enter length of rectangle: ");
        double length = sc.nextDouble();

        System.out.println("enter breadth of rectangle: ");
        double breadth = sc.nextDouble();

        int area = (int)Math.round(length*breadth);
        System.out.println("Area of rectangle with length "+length+"and breadth "+breadth+" is: "+area);
    }

    void totalMarks(){
        System.out.println("enter marks in Mathematics: ");
        Float Math = sc.nextFloat();

        System.out.println("enter marks in Business: ");
        Float Business = sc.nextFloat();

        System.out.println("enter marks in Software: ");
        Float Software = sc.nextFloat();

        System.out.println("enter marks in Programming: ");
        Float Programming = sc.nextFloat();

        Float Total = Math + Business + Software + Programming;
        Float Percentage = (Total/4);

        String result;

        result = ((Percentage>=70) ? "First Class": (Percentage>59) ? "Upper Second Class": (Percentage>49) ? "Second Class": (Percentage>39)? "Third Class": "Fail");
        System.out.println(result);
    }
    public static void main(String[] args) {
        Week2Task check = new Week2Task();
        check.vote();
        check.simpleInterest();
        check.areaTriangle();
        check.volumnCube();
        check.volumnCuboid();
        check.votingRule();
        check.sumProduct();

        check.divisionTwo();
        check.format();
        check.areaSquare();
        check.areaRectangle();
        check.totalMarks();
        check.sc.close();
    }
}
