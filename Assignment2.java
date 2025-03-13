package day3;

import java.util.Scanner;

/* Question 1: Create a class Car with instance variables brand, model, and price. Create an object
and print its details.*/

class Car {
    String brand;
    String model;
    double price;

    public void displayCarDetails() {
        System.out.println("Car Details: ");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car c1 = new Car();

        System.out.println("Enter Car Brand: ");
        c1.brand = sc.next();

        System.out.println("Enter Car Model: ");
        c1.model = sc.next();

        System.out.println("Enter Car Price: ");
        c1.price = sc.nextDouble();

        c1.displayCarDetails();
    }
}

/* Question 2: Write a program to create a class Student with instance variables name, age, and
marks. Create multiple student objects and display their details.*/

class Student {
    String name;
    int age;
    double marks;

    public void displayStudentDetails() {
        System.out.println("Student Details: "+
        "\nName of Student: "+name+
        "\nAge of Student: "+age+
        "\nMarks out of 500: "+marks);
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Student s1 = new Student();
        Student s2 =  new Student();

        System.out.println("Enter Student 1 Name: ");
        s1.name = sc.next();
        System.out.println("Enter Student 1 age: ");
        s1.age = sc.nextInt();
        System.out.println("Enter Student 1 marks out of 500:");
        s1.marks = sc.nextDouble();

        System.out.println("Enter Student 2 Name: ");
        s2.name = sc.next();
        System.out.println("Enter Student 2 age: ");
        s2.age = sc.nextInt();
        System.out.println("Enter Student 2 marks out of 500: ");
        s2.marks = sc.nextDouble();

        s1.displayStudentDetails();
        s2.displayStudentDetails();

    }
}

/* Question 3: Use Scanner to take input for Employee details (id, name, salary) and display the data.*/

class Employee {
    int id;
    String name;
    double salary;

    public void displayEmployeeDetails() {
        System.out.println("Employee Details:"+
        "\nEmployee ID: "+id+
        "\nEmployee Name: "+name+
        "\nEmployee Salary: "+salary);
    }  

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();

        System.out.print("Enter Employee ID: ");
        emp.id = sc.nextInt();

        System.out.print("Enter Employee Name: ");
        emp.name = sc.next();

        System.out.print("Enter Employee Salary: ");
        emp.salary = sc.nextDouble();

        emp.displayEmployeeDetails();
    }
}

/* Question 4: Create a class Rectangle with length and width. Add a method area() to return the
area. Use Scanner to take input and calculate the area.*/

class Rectangle {
    double length, width;

    public void area() {
        double area  = length * width;
        System.out.println("Area of rectangle: "+area);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rect = new Rectangle();

        System.out.print("Enter Length: ");
        rect.length = sc.nextDouble();

        System.out.print("Enter Width: ");
        rect.width = sc.nextDouble();

        rect.area();
    }
}

/* Question 5: Write a program that reads a user's name, age, and city using Scanner and displays
them in a formatted message.*/

class UserDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Your Age: ");
        int age = sc.nextInt();
        sc.nextLine();  

        System.out.print("Enter Your City: ");
        String city = sc.nextLine();

        System.out.println("Hello " + name + "! You are " + age + " years old from " + city + ".");
    }
}

/* Question 6: Create a class BankAccount with attributes accountNumber, holderName, and balance.
Create a method deposit(amount) to add money and withdraw(amount) to deduct
money (with a check for insufficient funds). */

class BankAccount {
    int accountNumber;
    String holderName;
    double balance;

    public BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void displayDetails() {
        System.out.println("\nAccount No.: " + accountNumber +
                "\nName of Account Holder: " + holderName +
                "\nBalance: " + balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully. New Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Funds.");
        } else if (amount > 0) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully. New Balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        System.out.print("Enter Name of Account Holder: ");
        String name = sc.next();
        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        BankAccount member = new BankAccount(accNo, name, balance);

        member.displayDetails();

        System.out.print("\nEnter amount to deposit: ");
        double depositAmount = sc.nextDouble();
        member.deposit(depositAmount);

        System.out.print("\nEnter amount to withdraw: ");
        double withdrawAmount = sc.nextDouble();
        member.withdraw(withdrawAmount);

    }
}

/* Question 7: Write a program to input a temperature in Celsius using Scanner and convert it to
Fahrenheit using a method in a class. */

class Temperature{
    Double Celsius;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Temp. in Celsius: ");
        double Celsius = sc.nextDouble();

        double Fahrenheit = (Celsius*9/5) + 32;

        System.out.println("Celsius to Fahrenheit: "+Fahrenheit);
    }
}

/* Question 8: Create a class Circle with an attribute radius and a method circumference() to
return the circumference. Use Scanner for input. */

class Circle{
    double radius;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Radius of Circle:  ");
        double radius = sc.nextDouble();

        double Circ = 2*3.14*radius;

        System.out.println("Circumference of Circle: "+Circ);
    }
}


/* Question 9: Write a class Book with title, author, and price. Ask the user to enter book details
and print them. */

class Book{
    String Title;
    String Author;
    Double Price;

    void PrintDetails(){
        System.out.println("Book Details: ");
        System.out.println("Title: "+Title+"\nAuthor: "+Author+"\nPrice: "+Price);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Book b1 = new Book();

        System.out.println("Enter Title of Book: ");
        b1.Title = sc.nextLine();

        System.out.println("Enter Author of Book: ");
        b1.Author = sc.nextLine();

        System.out.println("Enter Price of Book: ");
        b1.Price = sc.nextDouble();

        b1.PrintDetails();

    }
}

/* Question 10: Create a class Triangle that accepts three sides and checks if it forms a valid triangle
using the triangle inequality theorem. */

class Triangle{
    double a;
    double b;
    double c;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Side1, Side2, Side3 of Triangle: ");

       double a= sc.nextDouble();
       double b = sc.nextDouble();
       double c = sc.nextDouble();

       if (a+b>c && b+c>a && a+c>b){
        System.out.println("Sides form a valid Triangle.");
       }
      else{
        System.out.println("Sides do not form a valid Triangle.");
       }
    }
}

/* Question 11: Write a Java program to create a class Person with name and age. Take multiple inputs
using Scanner and store them in an array of objects. */

class Person{
    String Name;
    int Age;

    Person(String Name, int Age){
        this.Name = Name;
        this.Age = Age;
    }
    void printdetails(){
        System.out.println("Name: "+Name+" Age: "+Age);
    }
}    

class TestPerson{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Person p1 = new Person("Tanmay",25);
        Person p2 = new Person("Sahil",23);
        Person p3 = new Person("Avantika",22);

        String NAME[] = new String[3];
        int AGE[] = new int[3];

        NAME[0] = p1.Name;
        NAME[1] = p2.Name;
        NAME[2] = p3.Name;

        AGE[0] = p1.Age;
        AGE[1] = p2.Age;
        AGE[2] = p3.Age;

        int i;
        for (i=0;i<3;i++){
            System.out.println(NAME[i]);
            System.out.println(AGE[i]);
        }   
    }
}

/* Question 12: Create a class Laptop with brand, ram, price. Create an array of Laptop objects and
display details of all. */

class Laptop{
    String brand;
    int ram;
    double price;

    Laptop(String brand, int ram, double price){
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }
    void printdetails(){
        System.out.println("Brand: "+brand+", Ram Size in GB: "+ram+", Price: "+price);
    }
}

class TestLaptop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Laptop l1 = new Laptop("HP",16,50000);
        Laptop l2 = new Laptop("Lenovo",16,40000);
        Laptop l3 = new Laptop("Macbook",8,80000);

        String BRAND[] = new String[3];
        int RAM[] = new int[3];
        double PRICE[] = new double[3];

        BRAND[0] = l1.brand;
        BRAND[1] = l2.brand;
        BRAND[2] = l3.brand;

        RAM[0] = l1.ram;
        RAM[1] = l2.ram;
        RAM[2] = l3.ram;

        PRICE[0] = l1.price;
        PRICE[1] = l2.price;
        PRICE[2] = l3.price;

        int i;
        for (i=0;i<3;i++){
            System.out.println(BRAND[i]);
            System.out.println(RAM[i]);
            System.out.println(PRICE[i]);
        }   
        
        l1.printdetails();
        l2.printdetails();
        l3.printdetails();   
    }
}

/*Question 13: Write a Java program to create a Product class with attributes id, name, and price.
Write a method to apply a discount to the price and display the new price. */


class Product{
    int id;
    String name;
    double price;

    Product(int id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
    void printdata(){
        System.out.println("Product ID: "+id+", Product Name: "+name+", Product Price: "+price);
    }

    void discount(){
        if (price > 1000 && price <= 5000){
            price *= 0.9;           // 10% discount
            System.out.println("New Price after discount (10% discount): "+price);
        }
        else if (price > 5000 && price <=10000){
            price *= 0.85;          // 15% discount
            System.out.println("New Price after discount (15% discount): "+price);
        }
        else if (price > 10000){
            price *= 0.8;           // 20% discount
            System.out.println("New Price after discount (20% discount): "+price);
        }
        else{
            System.out.println("Discount not applicable.");
        }
    }
}

class TestProduct{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product p1 = new Product(101,"Laptop",90000);

        p1.printdata();
        p1.discount();
    }
}

/*Question 14: Write a Java program to create a Calculator class that performs addition, subtraction,
multiplication, and division with user input. */

class Calculator{
    double Num1;
    double Num2;

    void calc(){
        double Add = Num1 + Num2;
        double Sub = Num1 - Num2;
        double Multi = Num1 * Num2;
        double Div = Num1 / Num2;

        System.out.println("Addition: "+Add+
        "\nSubtraction :"+Sub+
        "\nMultiplication :"+Multi+
        "\nDivision :"+Div);
    }
}

class TestCalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calculator c1 = new Calculator();

        System.out.println("Enter Number 1: ");
        c1.Num1 = sc.nextDouble();
        System.out.println("Enter Number 2: ");
        c1.Num2 = sc.nextDouble();

        c1.calc();

    }
}

/*Question 15: Create a class Movie with title, director, rating. Create a constructor to initialize
values and a method to display details. Take user input using Scanner and display the
movie details. */

class Movie{
    String Title;
    String Director;
    Double Rating;

    public Movie(String Title, String Director, Double Rating){
        this.Title = Title;
        this.Director = Director;
        this.Rating = Rating;
    }

    void DisplayDetails(){
        System.out.println("Movie Details: ");
        System.out.println("Title: "+Title+
        "\nDirector: "+Director+
        "\nRating: "+Rating);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Movie Title: ");
        String Title = sc.nextLine();

        System.out.println("Enter Director's Name: ");
        String Director = sc.nextLine();

        System.out.println("Enter Movie Rating: ");
        Double Rating = sc.nextDouble();

        Movie m1 = new Movie(Title,Director,Rating);

        m1.DisplayDetails();
    }
}