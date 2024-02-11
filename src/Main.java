import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        boolean exitProgram = false;
        while (!exitProgram) {
            switch (mainChoice()) {
                case 1: optionOne();
                    break;
                case 2: optionTwo();
                    break;
                case 3: optionThree();
                    break;
                case 4: optionFour();
                    break;
                case 5: optionFive();
                    break;
                case 6: optionSix();
                    break;
                case 7: optionSeven();
                    break;
                case 8: optionEight();
                    break;
                case 9: optionNine();
                    break;
                case 10: optionTen();
                    break;
                case 11: optionEleven();
                    break;
                case 12: optionTwelve();
                    break;
                case 0:
                    exitProgram = true;
                    break;
                default:
                    System.out.println(RED + "Invalid option, please try again." + RESET);
                    break;
            }
        }
    }

    public static int mainChoice() {
        System.out.println(CYAN + "\nChoose one of the following options: " + RESET + """
                \n1. Circle area and circumference calculator.
                2. Temperatures convertor.
                3. Factorial calculator.
                4. Sum of the natural numbers in the range.
                5. Prime number test.
                6. Palindrome five-digit number test.
                7. Prime numbers in users range.
                8. GCD calculator.
                9. Quadratic equation calculator.
                10. Compound interest calculator.
                11. Fibonacci series test.
                12. Closest Narcissistic number test.""" + RED +
                "\n0. Exit program." + RESET);
        return scanner.nextInt();
    }

    public static void optionOne(){
        System.out.println(CYAN + "Size of the radius: " + RESET);
        double radius = scanner.nextDouble();
        double circumference = 2*(radius * 3.14);
        double area = 3.14 * (radius*radius);
        System.out.println(GREEN + "Circle circumference is " + circumference + " and area is " + area + RESET);
    }

    public static void optionTwo(){
        System.out.println(CYAN + "\nPlease choose Temperature scale: " + RESET + """
                \n1 - for Celsius
                2 - for Fahrenheit""");
        int scaleType = scanner.nextInt();
        if (0 < scaleType && scaleType < 3){
            System.out.println("Enter the temperature: ");
            double userTemperature = scanner.nextDouble();
            double convertedTemperature;
            if (scaleType == 1){
                convertedTemperature = ((userTemperature * 1.8) + 32);
                System.out.println(GREEN + "Temperature in Fahrenheit is: " + convertedTemperature + RESET);
            } else {
                convertedTemperature = (((userTemperature -32) * 5) / 9);
                System.out.println(GREEN + "Temperature in Celsius is: " + convertedTemperature + RESET);
            }
        } else {
            System.out.println(RED + "Invalid option, please try again." + RESET);
            optionTwo();
        }
    }

    public static void optionThree(){
        System.out.println(CYAN + "Please enter a whole positive number: " + RESET);
        int num = scanner.nextInt();
        double factorial = 1;
        if (num > 0){
            for (int i = num; i > 0; i--){
                factorial *= i;
            }
            System.out.println(GREEN + "Factorial of your number is: " + factorial + RESET);
        } else {
            System.out.println(RED + "Incorrect number." + RESET);
            optionThree();
        }
    }

    public static void optionFour() {
        System.out.println(CYAN + "Enter a starting number: " + RESET);
        int num1 = scanner.nextInt();
        System.out.println(CYAN + "Enter an ending number: " + RESET);
        int num2 = scanner.nextInt();
        int sum = 0;
        int min = Math.min(num1,num2);
        int max = Math.max(num1,num2);
        if (num1 == num2) {
            System.out.println(RED + "Please enter numbers that are not equal!" + RESET);
            optionFour();
        } else if (min < 1) {
            System.out.println(RED + "Natural numbers only." + RESET);
            optionFour();
        } else {
            for (int i = min; i<=max; i++){
                sum += i;
            }
            System.out.println(GREEN + "Total sum of numbers is: " + sum + RESET);
        }
    }

    public static void optionFive(){
        System.out.println(CYAN + "Enter a whole positive number: " + RESET);
        int num = scanner.nextInt();

        if (num > 1){
            boolean isPrime = false;
            for (int i = 2; i < num; i++){
                if (num % i == 0){
                    isPrime = true;
                    break;
                }
            }
            if (isPrime){
                System.out.println(GREEN + "Not a prime number." + RESET);
            } else {
                System.out.println(GREEN + "Number " + num + " is prime." + RESET);
            }
        } else if (num == 1){
            System.out.println(RED + "Number 1 is neither prime nor composite." + RESET);
        } else {
            System.out.println(RED + "Not a positive number" + RESET);
        }

    }

    public static void optionSix(){
        System.out.println(CYAN + "Enter a five-digit positive number: " + RESET);
        int userNumber = scanner.nextInt();
        int origNumber = userNumber;
        int reversedNumber = 0;

        if (9999 < userNumber && userNumber <100000){
            for (int i=0; i<5; i++){
                reversedNumber=reversedNumber*10 + userNumber%10;
                userNumber= userNumber/10;
            }
            if (origNumber == reversedNumber){
                System.out.println(GREEN + "Number " + origNumber + " is a palindrome." + RESET);
            } else {
                System.out.println(GREEN + "Number " + origNumber + " is not a palindrome." + RESET);
            }
        } else {
            System.out.println(RED + "Wrong number." + RESET);
            optionSix();
        }
    }

    public static void optionSeven(){
        System.out.println(CYAN + "Enter starting number: " + RESET);
        int num1 = scanner.nextInt();
        System.out.println(CYAN + "Enter ending number: " + RESET);
        int num2 = scanner.nextInt();
        int min = Math.min(num1,num2);
        int max = Math.max(num1,num2);

        boolean foundPrime = false;

        for (int i = min; i<=max; i++) {
            boolean isPrime = true;
            if (i <= 1){
                isPrime = false;
            } else {
                for (int j = 2; j < i; j++){
                    if (i % j == 0){
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime){
                System.out.println(GREEN + i + " " + RESET);
                foundPrime = true;
            }
        }
        if (!foundPrime){
            System.out.println(GREEN + "No prime numbers in range." + RESET);
        }
    }

    public static void optionEight(){
        System.out.println(CYAN + "Enter a number: " + RESET);
        int num1 = scanner.nextInt();
        System.out.println(CYAN + "Enter second number: " + RESET);
        int num2 = scanner.nextInt();
        int min = Math.min(num1,num2);
        int max = Math.max(num1,num2);
        for (int i=max; i > 0; i--) {
            if (max%i == 0 && min%i == 0) {
                System.out.println(GREEN + "Common divisor of those numbers is: " + i + RESET);
                break;
            }
        }
    }

    public static void optionNine(){
        System.out.println(CYAN + "Enter the coefficients a,b and c." + RESET);
        double numA = scanner.nextDouble();
        double numB = scanner.nextDouble();
        double numC = scanner.nextDouble();
        double discriminant = Math.sqrt(Math.pow(numB, 2) - (4 * numA * numC) );
        if (discriminant == 0){
            double solution1 = ((-numB + discriminant)) / (2 * numA);
            System.out.println(GREEN + "Solution is x = " + solution1 + RESET);
        } else if (discriminant > 0) {
            double solution1 = ((-numB + discriminant)) / (2 * numA);
            double solution2 = ((-numB - discriminant)) / (2 * numA);
            System.out.println(GREEN + "Formula has two solutions: \nx1 = " + solution1 + "\nx2 = " + solution2+ RESET);
        }else{
            System.out.println(RED + "No real solution." + RESET);
        }
    }

    public static void optionTen(){
        System.out.println(CYAN + "Enter investment amount: " + RESET);
        float investment = scanner.nextFloat();
        System.out.println(CYAN + "Enter percent of your monthly interest: " + RESET);
        float userInterest = scanner.nextFloat() / 100;

        for (int i=3 ; i <= 36; i +=3){
            float withdrawalAmount = investment;
            for (int j = 0; j < i; j +=3){
                withdrawalAmount += withdrawalAmount * userInterest;
            }
            System.out.println("After " + i + " months your amount of money would be: " + withdrawalAmount);
        }

        System.out.println(CYAN + "Choose withdrawal month: " + RESET);
        int withdrawalMonth = scanner.nextInt();
        float withdrawalFinal = investment;

        for (int i = 3; i <= withdrawalMonth; i += 3) {
            withdrawalFinal += withdrawalFinal * userInterest;
        }
        if (withdrawalMonth %12==0){
            System.out.println(GREEN + "Your withdrawal amount is: " + withdrawalFinal + RESET);
        } else {
            float withdrawalFinalOffset = ((withdrawalFinal-investment)/2 + investment);
            System.out.println(GREEN + "Your withdrawal amount including offset is: " + withdrawalFinalOffset + RESET);
        }
    }


    public static void optionEleven(){
        System.out.println(CYAN + "Enter a number to check if it is a part of the Fibonacci series: " + RESET);
        int number = scanner.nextInt();
        boolean isFibonacci = false;
        int a = 0;
        int b = 1;
        while (a <= number){
            if( a == number){
                isFibonacci = true;
                break;
            }
            int nextNumber = b;
            b += a;
            a = nextNumber;
        }
        if (isFibonacci){
            System.out.println(GREEN + "Number " + number + " is part of the Fibonacci series.");
        } else {
            System.out.println(GREEN + "Number " + number + " is not a part of the Fibonacci series.");
        }
    }

    public static void optionTwelve(){
        System.out.println(CYAN + "Enter a whole positive number: " + RESET);
        int userNumber = scanner.nextInt();
        int closestNarcissistic;

        if (userNumber < 1){
            System.out.println(RED + "Incorrect number." + RESET);
            optionTwelve();
            return;
        }

        for (int i = userNumber + 1, j =userNumber -1; ; i++, j--){
            if (isNarcissistic(userNumber)) {
                System.out.println(GREEN + userNumber + " is a Narcissistic number.");
                break;
            }

            if (isNarcissistic(i)){
                closestNarcissistic = i;
                System.out.println( GREEN + "Closest Narcissistic number to " + userNumber + " is: " + closestNarcissistic + RESET );
                break;
            } else if (isNarcissistic(j)) {
                closestNarcissistic = j;
                System.out.println( GREEN + "Closest Narcissistic number to " + userNumber + " is: " + closestNarcissistic + RESET );
                break;
            }
        }

    }

    public static boolean isNarcissistic(int number) {
        int numDigits = String.valueOf(number).length();
        int sum = 0;
        int tempNumber = number;
        while (tempNumber > 0){
            int digit = tempNumber % 10;
            sum += (int) Math.pow(digit, numDigits);
            tempNumber /= 10;
        }
        return sum == number;
    }



    public static final String RESET = "\u001B[0m";
    public static final String GREEN = "\u001B[32m";
    public static final String CYAN = "\u001B[36m";
    public static final String RED = "\u001B[31m";

    public static Scanner scanner = new Scanner(System.in);
}
