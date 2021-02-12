 import java.util.Scanner;
public class game {
public static void main(String args []){
Scanner s = new Scanner(System.in);
int your_point = 0;
int comp_point=0;
System.out.println("Welocome to Rock,Paper,Scissors game!");
System.out.println("1-Rock 2-Paper 3-Scissors");
while(true) {
System.out.println("Your choice: ");
int your_choice = s.nextInt();
int comp_choice = (int)(Math.random()*3);
if (your_choice == 1) {
if (comp_choice == 1) {
System.out.println("You Choice:Rock\nComputer Choice: Rock\nResult: Draw");
System.out.println("Your Point: "+your_point+" Point of Computer:"+comp_point);
} else if (comp_choice == 2) {
System.out.println("You Choice:Rock\nComputer Choice: Paper\nResult: Lose");
comp_point++;
System.out.println("Your Point: "+your_point+" Computer Point:"+comp_point);
} else {
System.out.println("You Choice:Rock\nComputer Choice: Scissors\nResult: Win");
your_point++;
System.out.println("Your Point: " + your_point + " Computer Point:" + comp_point);
}
} else if (your_choice == 2) {
if (comp_choice == 1) {
System.out.println("You Choice:Paper\nComputer Choice: Rock\nResult: Win");
your_point++;
System.out.println("Your Point: "+your_point+" Computer Point:"+comp_point);
} else if (comp_choice == 2) {
System.out.println("You Choice:Paper\nComputer Choice: Paper\nResult: Draw");
System.out.println("Your Point: "+your_point+" Computer Point:"+comp_point);
} else {
System.out.println("You Choice:Paper\nComputer Choice: Scissors\nResult: Lose");
comp_point++;
System.out.println("Your Point: " + your_point + " Computer Point:" + comp_point); }
} else if (your_choice == 3) {
if (comp_choice == 1) {
System.out.println("You Choice:Scissors\nComputer Choice: Rock\nResult: Lose");
comp_point++;
System.out.println("Your Point: "+your_point+" Computer Point:"+comp_point);
} else if (comp_choice == 2) {
System.out.println("You Choice:Scissors\nComputer Choice: Paper\nResult: Win");
your_point++;
System.out.println("Your Point: "+your_point+" Computer Point:"+comp_point);
} else {
System.out.println("You Choice:Scissors\nComputer Choice: Scissors\nResult: Draw");
System.out.println("Your Point: " + your_point + " Computer Point:" + comp_point);
}
} else{
System.out.println("Wrong enterence");
continue;}
if(your_point==3){
System.out.println("Win the Game!,Congratulations");
System.out.println("You "+your_point+"-"+comp_point+" Computer");
break; }
else if(comp_point==3){
System.out.println("Lose the Game!,try again");
System.out.println("Computer "+comp_point+"-"+your_point+" You");
break; }
}
}
}

