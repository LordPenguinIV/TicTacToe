import java.util.*;
public class TicTacToe
{
  public static String[][] b = 
  {
    {" "," "," ","asdgasg"},
    {" "," "," ",},
    {" "," "," "},
    {"sjrtjrtj","sdfhshd","shtsh","aaggdf"}
  };
  public static void printBoard()
  {
    System.out.format("%s | %s | %s%n",b[0][0],b[0][1],b[0][2]);
    System.out.format("---------%n");
    System.out.format("%s | %s | %s%n",b[1][0],b[1][1],b[1][2]);
    System.out.format("---------%n");
    System.out.format("%s | %s | %s%n",b[2][0],b[2][1],b[2][2]);
  }
  public static boolean placeMove(String t, int p)
  {
    int y=3;
    int x=3;
    boolean change = false;
    
    if (t.length()==2)
    {
      if (t.charAt(0)=='A' || t.charAt(0)=='a')
      {
        y = 0;
      }
      else if (t.charAt(0)=='B' || t.charAt(0)=='b')
      {
        y = 1;
      }
      else if (t.charAt(0)=='C' || t.charAt(0)=='c')
      {
        y = 2;
      }
      if (t.charAt(1)=='1')
      {
        x = 0;
      }
      else if (t.charAt(1)=='2')
      {
        x = 1;
      }
      else if (t.charAt(1)=='3')
      {
        x = 2;
      }
      else
      {
        y=3;
        x=3;
      }
    }
    if (p==1 && b[y][x].contains(" ") == true && x!=3 && y!=3)
    {
      b[y][x]="o";
      change = true;
    }
    else if (p==2 && b[y][x].contains(" ") == true && x!=3 && y!=3)
    {
      b[y][x]="x";
      change = true;
    }
    x=3;
    y=3;
    return change;
  }
  
  public static int winner(int player)
  {
    int winner = 0;
    String symbol = "";
    
    if (player==1)
    {
      symbol = "o";
    }
    else if (player==2)
    {
      symbol = "x";
    }
    
    if (b[0][0].equals(symbol) && b[0][1].equals(symbol) && b[0][2].equals(symbol))
    {
      winner = player;
    }
    else if (b[1][0].equals(symbol) && b[1][1].equals(symbol) && b[1][2].equals(symbol))
    {
      winner = player;
    }
    else if (b[2][0].equals(symbol) && b[2][1].equals(symbol) && b[2][2].equals(symbol))
    {
      winner = player;
    }
    else if (b[0][0].equals(symbol) && b[1][0].equals(symbol) && b[2][0].equals(symbol))
    {
      winner = player;
    }
    else if (b[0][1].equals(symbol) && b[1][1].equals(symbol) && b[2][1].equals(symbol))
    {
      winner = player;
    }
    else if (b[0][2].equals(symbol) && b[1][2].equals(symbol) && b[2][2].equals(symbol))
    {
      winner = player;
    }
    else if (b[0][0].equals(symbol) && b[1][1].equals(symbol) && b[2][2].equals(symbol))
    {
      winner = player;
    }
    else if (b[0][2].equals(symbol) && b[1][1].equals(symbol) && b[2][0].equals(symbol))
    {
      winner = player;
    }
    else
    {
      winner = 0;
    }
    return winner;
  }
  
  public static void main (String [] args)
  {
    Scanner in = new Scanner (System.in);
    printBoard();
    String place;
    int player = 1;
    int m;
    boolean change;
    
    for (m = 0; m<9; m++)
    {
      if (player == 1)
      {
        System.out.format("Player 1's Turn: ");
        place = in.nextLine();
        change = placeMove(place,player);
        while (change == false)
        {
          System.out.format("                 ");
          place = in.nextLine();
          change = placeMove(place,player);
        }
        printBoard();
        if (winner(player) == 1)
        {
          m=10;
          System.out.format("Player 1 has won%n");
        }
        player++;
        change = false;
      }
      else if (player == 2)
      {
        System.out.format("Player 2's Turn: ");
        place = in.nextLine();
        change = placeMove(place,player);
        while (change == false)
        {
          System.out.format("                 ");
          place = in.nextLine();
          change = placeMove(place,player);
        }
        printBoard();
        if (winner(player) == 2)
        {
          m=10;
          System.out.format("Player 2 has won%n");
        }
        player--;
        change = false;
      }
    }
    if (m==9)
    {
      System.out.format("Tie!%n");
    }
  }
}