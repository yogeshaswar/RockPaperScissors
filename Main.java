import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.");
        System.out.print("\n");
        System.out.println("Are you ready? Write 'yes' if you are");

        Scanner scan = new Scanner(System.in);
        String responce = scan.nextLine();

        if(responce.equals("Yes") || responce.equals("yes") || responce.equals("y")){
            System.out.println("Great!");
            System.out.println("rock -- paper -- scissors, shoot!");
            String UserChoice = scan.nextLine();
            String computerChoice = randomChoice();
            
            String finalResult = checkWinner(UserChoice, computerChoice);
            
            System.out.println(finalResult);

        }else{
            System.out.println("Darn, some other time...");
            System.exit(0);
        }



    }


    public static String randomChoice(){
        String randomChoice = "";
        int randomNumber = (int) (Math.random()*3);

        switch(randomNumber){
            case 0: randomChoice = "rock"; break;
            case 1: randomChoice = "paper"; break;
            case 2: randomChoice = "scissors"; break;
        }
        return randomChoice;
    }

    public static String checkWinner(String userChoice, String computerChoice){
        String result = "";

        if(userChoice.equals("rock") && computerChoice.equals("rock")){
            result = "Tie";
        }else if(userChoice.equals("paper") && computerChoice.equals("paper")){
            result = "Tie";
        }else if(userChoice.equals("scissor") && computerChoice.equals("scissor")){
            result = "Tie";
        }else if(userChoice.equals("rock") && computerChoice.equals("scissor")){
            result = "You Won.";
        }else if(userChoice.equals("scissor") && computerChoice.equals("paper")){
            result = "You Won.";
        }else if(userChoice.equals("paper") && computerChoice.equals("rock")){
            result = "You Won.";
        }else if(userChoice.equals("paper") && computerChoice.equals("scissor")){
            result = "Computer Won.";
        }else if(userChoice.equals("rock") && computerChoice.equals("paper")){
            result = "Computer Won.";
        }else if(userChoice.equals("scissor") && computerChoice.equals("rock")){
            result = "Computer Won.";
        }

        return "You chose: " + userChoice + "\n" + "Computer chose: " + computerChoice + "\n" + "The Result is: " + result;
    }

}
