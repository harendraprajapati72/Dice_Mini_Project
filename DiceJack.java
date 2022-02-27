import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
       int roll1= rollDice();
       int roll2= rollDice();
       int roll3= rollDice();
    

       System.out.println("Enter three numbers between 1 and 6 ");

       int num1 =sc.nextInt();
       int num2 =sc.nextInt();
       int num3 =sc.nextInt();
       if(num1<1||num2<1||num3<1){
           System.out.print("Number should not be less than 1 ,Shutting game down   ");
           System.exit(0);
       }
       if(num1>6||num2>6||num3>6){
        System.out.print("Number can not be higher than 6 ,Shutting game down      ");
        System.exit(0);
        
       }
       int sumOfNumbers=num1+num2+num3;
        int sumOfDiceRolls=roll1+roll2+roll3;
        System.out.println("Dice sum = "+sumOfDiceRolls+ ". Number Sum = " +sumOfNumbers);
        checkWon(sumOfDiceRolls, sumOfNumbers);

       sc.close();


    //    System.out.println(roll1);
    //    System.out.println(roll2);
    //    System.out.println(roll3);

        
    }
    public static int rollDice(){
        double randomnumber=Math.random()*6;
        randomnumber +=1;
        return (int)randomnumber;
    }

    public  static void checkWon(int sumOfDiceRolls,int sumOfNumbers){

        if (sumOfNumbers>sumOfDiceRolls && sumOfNumbers-sumOfDiceRolls<3){
            System.out.println("Congrats you win the Game.....!");

        }else{
            System.out.print("Sorry ! you loose the Game   .");
        }

    }

}
