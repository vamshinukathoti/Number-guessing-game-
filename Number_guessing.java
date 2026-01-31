import java.util.Scanner;
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int random_num = (int)(Math.random()*101);
    int user_given_num;
    int attempts = 0;
    System.out.println("Welcome to Number guessing game.");
    System.out.println("I have picked a number from 0 to 100 can you guess it, Good luck");

    do{
        user_given_num = sc.nextInt();
        if (user_given_num < random_num) {
            System.out.println("It's too low, Try again");
            attempts++;
        }else if (user_given_num > random_num) {
            System.out.println("It's too high, Try agian");
            
        }

    }while(user_given_num != random_num);

    System.out.println("Congratulations you got it " + random_num +" in "+ attempts+" attemps");
    sc.close();
}