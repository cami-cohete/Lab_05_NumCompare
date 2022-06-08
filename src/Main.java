public class Main {

//    num firstNum = 0
//    num secondNum = 0
//    output “Enter your first Number: ”
//    input firstNum
//    output “Enter your second Number: ”
//    input secondNum
//      if firstNum = = secondNum then
//    output “Your numbers are equal!”
//            else if firstNum > secondNum then
//    output “This number is less: ” + secondNum
//      else
//    output “This number is less: ” + firstNum
//            endIf

    public static void main(String[] args)
    {
        int firstNum = 0;
        int secondNum = 0;

        System.out.println("Enter an integer: ");
        firstNum = 2; // user input
        System.out.println("Enter a second integer: ");
        secondNum = 4; // user input

        System.out.println(" the simulated user inputs are " + firstNum + " and " + secondNum);

        if (firstNum == secondNum)
        {
            System.out.println("The numbers are equal!");
        }
        else if (firstNum > secondNum)
        {
            System.out.println("The number that is lesser is: " + secondNum);
        }
        else if (firstNum < secondNum)
        {
            System.out.println("The number that is lesser is: " + firstNum);
        }
        else
        {
            System.out.println("One or both of the inputs is not an integer. For reference, you entered " + firstNum + " and " + secondNum);
        }
    }
}
