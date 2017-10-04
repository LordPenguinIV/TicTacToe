import java.util.Scanner;

public class TicTacToe
{
  public static void main (String [] args)
  {
    Scanner input = new Scanner (System.in);
    String a1 = " ";
    String a2 = " ";
    String a3 = " ";
    String b1 = " ";
    String b2 = " ";
    String b3 = " ";
    String c1 = " ";
    String c2 = " ";
    String c3 = " ";
    int p = 1;
    System.out.println("   |   |   ");
    System.out.println("---|---|---");
    System.out.println("   |   |   ");
    System.out.println("---|---|---");
    System.out.println("   |   |   ");
    String x = input.nextLine();
    int winner = 0;
    int move = 0;
    while (winner == 0)
    {
    //Player 1's turn
    if (x.equals("A1") && p == 1 && a1.equals(" "))
    {
    a1 = "o";
    
    p = 2;
    move = move+1;
    }
    else if (x.equals("A2") && p == 1 && a2.equals(" "))
    {
    a2 = "o";
    
    p = 2;
    move = move+1;
    }
    else if (x.equals("A3") && p == 1 && a3.equals(" "))
    {
    a3 = "o";
    
    p = 2;
    move = move+1;
    }
    else if (x.equals("B1") && p == 1 && b1.equals(" "))
    {
    b1 = "o";
    
    p = 2;
    move = move+1;
    }
    else if (x.equals("B2") && p == 1 && b2.equals(" "))
    {
    b2 = "o";
    
    p = 2;
    move = move+1;
    }
    else if (x.equals("B3") && p == 1 && b3.equals(" "))
    {
    b3 = "o";
    
    p = 2;
    move = move+1;
    }
    else if (x.equals("C1") && p == 1 && c1.equals(" "))
    {
    c1 = "o";
    
    p = 2;
    move = move+1;
    }
    else if (x.equals("C2") && p == 1 && c2.equals(" "))
    {
    c2 = "o";
    
    p = 2;
    move = move+1;
    }
    else if (x.equals("C3") && p == 1 && c3.equals(" "))
    {
    c3 = "o";
    
    p = 2;
    move = move+1;
    }
    //Player 2's turn
    else if (x.equals("A1") && p == 2 && a1.equals(" "))
    {
    a1 = "x";
    
    p = 1;
    move = move+1;
    }
    else if (x.equals("A2") && p == 2 && a2.equals(" "))
    {
    a2 = "x";
    
    p = 1;
    move = move+1;
    }
    else if (x.equals("A3") && p == 2 && a3.equals(" "))
    {
    a3 = "x";
    
    p = 1;
    move = move+1;
    }
    else if (x.equals("B1") && p == 2 && b1.equals(" "))
    {
    b1 = "x";
    
    p = 1;
    move = move+1;
    }
    else if (x.equals("B2") && p == 2 && b2.equals(" "))
    {
    b2 = "x";
    
    p = 1;
    move = move+1;
    }
    else if (x.equals("B3") && p == 2 && b3.equals(" "))
    {
    b3 = "x";
    
    p = 1;
    move = move+1;
    }
    else if (x.equals("C1") && p == 2 && c1.equals(" "))
    {
    c1 = "x";
    
    p = 1;
    move = move+1;
    }
    else if (x.equals("C2") && p == 2 && c2.equals(" "))
    {
    c2 = "x";
    
    p = 1;
    move = move+1;
    }
    else if (x.equals("C3") && p == 2 && c3.equals(" "))
    {
    c3 = "x";
    
    p = 1;
    move = move+1;
    }
    //Writing the board
    System.out.println(" "+a1+" | "+a2+" | "+a3+" ");
    System.out.println("---|---|---");
    System.out.println(" "+b1+" | "+b2+" | "+b3+" ");
    System.out.println("---|---|---");
    System.out.println(" "+c1+" | "+c2+" | "+c3+" ");
    //When there's a winner
    //Player 1 winning
    if (a1.equals("o") && a2.equals("o") && a3.equals("o") || b1.equals("o") && b2.equals("o") && b3.equals("o") || c1.equals("o") && c2.equals("o") && c3.equals("o"))
    {
      winner=1;
      System.out.println("Player 1 has won!");
    }
    else if (a1.equals("o") && b1.equals("o") && c1.equals("o") || a2.equals("o") && b2.equals("o") && c2.equals("o") || a3.equals("o") && b3.equals("o") && c3.equals("o"))
    {
      winner=1;
      System.out.println("Player 1 has won!");
    }
    else if (a1.equals("o") && b2.equals("o") && c3.equals("o") || a3.equals("o") && b2.equals("o") && c1.equals("o"))
    {
      winner=1;
      System.out.println("Player 1 has won!");
    }
    //Player 2 winning
    else if (a1.equals("x") && a2.equals("x") && a3.equals("x") || b1.equals("x") && b2.equals("x") && b3.equals("x") || c1.equals("x") && c2.equals("x") && c3.equals("x"))
    {
      winner=1;
      System.out.println("Player 2 has won!");
    }
    else if (a1.equals("x") && b1.equals("o") && c1.equals("x") || a2.equals("x") && b2.equals("x") && c2.equals("x") || a3.equals("x") && b3.equals("x") && c3.equals("x"))
    {
      winner=1;
      System.out.println("Player 2 has won!");
    }
    else if (a1.equals("x") && b2.equals("x") && c3.equals("x") || a3.equals("x") && b2.equals("x") && c1.equals("x"))
    {
      winner=1;
      System.out.println("Player 2 has won!");
    }
    //If there is a tie
    else if (move >= 9)
    {
      System.out.println("Tie!");
      winner=1;
    }
    //No end result
    else
    {
      x = input.nextLine();
    }
    }
  }
}