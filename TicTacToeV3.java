import java.util.*;


public class TicTacToeV3
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
    int winner = 0;
    int move = 0;
    ArrayList<String> arr=new ArrayList<String>();  
    arr.add("a1");
    arr.add("a2");
    arr.add("a3");
    arr.add("b1");
    arr.add("b2");
    arr.add("b3");
    arr.add("c1");
    arr.add("c2");
    arr.add("c3");
    int y;
    Random object = new Random ();
    while (winner == 0)
    {
    //Player 1's turn
    if (move == 9)
    {
      winner=1;
    }
    else if (p==1)
    {
    //The AI
    //Horizontal Wins
    
    if (a1.equals("o") && a2.equals("o") && arr.contains("a3")==true )
    {
    a3 = "o";
    arr.remove("a3");
    p = 2;
    move = move+1;
    }
    else if (a3.equals("o") && a2.equals("o") && arr.contains("a1")==true )
    {
    a1 = "o";
    arr.remove("a1");
    p = 2;
    move = move+1;
    }
    else if (a3.equals("o") && a1.equals("o") && arr.contains("a2")==true )
    {
    a2 = "o";
    arr.remove("a2");
    p = 2;
    move = move+1;
    }
    else if (b1.equals("o") && b2.equals("o") && arr.contains("b3")==true )
    {
    b3 = "o";
    arr.remove("b3");
    p = 2;
    move = move+1;
    }
    else if (b3.equals("o") && b2.equals("o") && arr.contains("b1")==true )
    {
    b1 = "o";
    arr.remove("b1");
    p = 2;
    move = move+1;
    }
    else if (b3.equals("o") && b1.equals("o") && arr.contains("b2")==true )
    {
    b2 = "o";
    arr.remove("b2");
    p = 2;
    move = move+1;
    }
    else if (c1.equals("o") && c2.equals("o") && arr.contains("c3")==true )
    {
    c3 = "o";
    arr.remove("c3");
    p = 2;
    move = move+1;
    }
    else if (c3.equals("o") && c2.equals("o") && arr.contains("c1")==true )
    {
    c1 = "o";
    arr.remove("c1");
    p = 2;
    move = move+1;
    }
    else if (c3.equals("o") && c1.equals("o") && arr.contains("c2")==true )
    {
    c2 = "o";
    arr.remove("c2");
    p = 2;
    move = move+1;
    }
    else if (a1.equals("x") && a2.equals("x") && arr.contains("a3")==true )
    {
    a3 = "o";
    arr.remove("a3");
    p = 2;
    move = move+1;
    }
    else if (a3.equals("x") && a2.equals("x") && arr.contains("a1")==true )
    {
    a1 = "o";
    arr.remove("a1");
    p = 2;
    move = move+1;
    }
    else if (a3.equals("x") && a1.equals("x") && arr.contains("a2")==true )
    {
    a2 = "o";
    arr.remove("a2");
    p = 2;
    move = move+1;
    }
    else if (b1.equals("x") && b2.equals("x") && arr.contains("b3")==true )
    {
    b3 = "o";
    arr.remove("b3");
    p = 2;
    move = move+1;
    }
    else if (b3.equals("x") && b2.equals("x") && arr.contains("b1")==true )
    {
    b1 = "o";
    arr.remove("b1");
    p = 2;
    move = move+1;
    }
    else if (b3.equals("x") && b1.equals("x") && arr.contains("b2")==true )
    {
    b2 = "o";
    arr.remove("b2");
    p = 2;
    move = move+1;
    }
    else if (c1.equals("x") && c2.equals("x") && arr.contains("c3")==true )
    {
    c3 = "o";
    arr.remove("c3");
    p = 2;
    move = move+1;
    }
    else if (c3.equals("x") && c2.equals("x") && arr.contains("c1")==true )
    {
    c1 = "o";
    arr.remove("c1");
    p = 2;
    move = move+1;
    }
    else if (c3.equals("x") && c1.equals("x") && arr.contains("c2")==true )
    {
    c2 = "o";
    arr.remove("c2");
    p = 2;
    move = move+1;
    }
    //Vertical Wins
    
    else if (a1.equals("o") && b1.equals("o") && arr.contains("c1")==true )
    {
    c1 = "o";
    arr.remove("c1");
    p = 2;
    move = move+1;
    }
    else if (a1.equals("o") && c1.equals("o") && arr.contains("b1")==true )
    {
    b1 = "o";
    arr.remove("b1");
    p = 2;
    move = move+1;
    }
    else if (b1.equals("o") && c1.equals("o") && arr.contains("a1")==true )
    {
    a1 = "o";
    arr.remove("a1");
    p = 2;
    move = move+1;
    }
    else if (a2.equals("o") && b2.equals("o") && arr.contains("c2")==true )
    {
    c2 = "o";
    arr.remove("c2");
    p = 2;
    move = move+1;
    }
    else if (a2.equals("o") && c2.equals("o") && arr.contains("b2")==true )
    {
    b2 = "o";
    arr.remove("b2");
    p = 2;
    move = move+1;
    }
    else if (b2.equals("o") && c2.equals("o") && arr.contains("a2")==true )
    {
    a2 = "o";
    arr.remove("a2");
    p = 2;
    move = move+1;
    }
    else if (a3.equals("o") && b3.equals("o") && arr.contains("c3")==true )
    {
    c3 = "o";
    arr.remove("c3");
    p = 2;
    move = move+1;
    }
    else if (a3.equals("o") && c3.equals("o") && arr.contains("b3")==true )
    {
    b3 = "o";
    arr.remove("b3");
    p = 2;
    move = move+1;
    }
    else if (b3.equals("o") && c3.equals("o") && arr.contains("a3")==true )
    {
    a3 = "o";
    arr.remove("a3");
    p = 2;
    move = move+1;
    }
    else if (a1.equals("x") && b1.equals("x") && arr.contains("c1")==true )
    {
    c1 = "o";
    arr.remove("c1");
    p = 2;
    move = move+1;
    }
    else if (a1.equals("x") && c1.equals("x") && arr.contains("b1")==true )
    {
    b1 = "o";
    arr.remove("b1");
    p = 2;
    move = move+1;
    }
    else if (b1.equals("x") && c1.equals("x") && arr.contains("a1")==true )
    {
    a1 = "o";
    arr.remove("a1");
    p = 2;
    move = move+1;
    }
    else if (a2.equals("x") && b2.equals("x") && arr.contains("c2")==true )
    {
    c2 = "o";
    arr.remove("c2");
    p = 2;
    move = move+1;
    }
    else if (a2.equals("x") && c2.equals("x") && arr.contains("b2")==true )
    {
    b2 = "o";
    arr.remove("b2");
    p = 2;
    move = move+1;
    }
    else if (b2.equals("x") && c2.equals("x") && arr.contains("a2")==true )
    {
    a2 = "o";
    arr.remove("a2");
    p = 2;
    move = move+1;
    }
    else if (a3.equals("x") && b3.equals("x") && arr.contains("c3")==true )
    {
    c3 = "o";
    arr.remove("c3");
    p = 2;
    move = move+1;
    }
    else if (a3.equals("x") && c3.equals("x") && arr.contains("b3")==true )
    {
    b3 = "o";
    arr.remove("b3");
    p = 2;
    move = move+1;
    }
    else if (b3.equals("x") && c3.equals("x") && arr.contains("a3")==true )
    {
    a3 = "o";
    arr.remove("a3");
    p = 2;
    move = move+1;
    }
    
    //Diagonal Wins
    
    else if (a1.equals("o") && c3.equals("o") && arr.contains("b2")==true )
    {
    b2 = "o";
    arr.remove("b2");
    p = 2;
    move = move+1;
    }
    else if (a3.equals("o") && c1.equals("o") && arr.contains("b2")==true )
    {
    b2 = "o";
    arr.remove("b2");
    p = 2;
    move = move+1;
    }
    else if (a1.equals("o") && b2.equals("o") && arr.contains("c3")==true )
    {
    c3 = "o";
    arr.remove("c3");
    p = 2;
    move = move+1;
    }
    else if (c3.equals("o") && b2.equals("o") && arr.contains("a1")==true )
    {
    a1 = "o";
    arr.remove("a1");
    p = 2;
    move = move+1;
    }
    else if (a3.equals("o") && c1.equals("o") && arr.contains("b2")==true )
    {
    b2 = "o";
    arr.remove("b2");
    p = 2;
    move = move+1;
    }
    else if (a3.equals("o") && b2.equals("o") && arr.contains("c1")==true )
    {
    c1 = "o";
    arr.remove("c1");
    p = 2;
    move = move+1;
    }
    else if (c1.equals("o") && b2.equals("o") && arr.contains("a3")==true )
    {
    a3 = "o";
    arr.remove("a3");
    p = 2;
    move = move+1;
    }
    else if (a1.equals("x") && c3.equals("x") && arr.contains("b2")==true )
    {
    b2 = "o";
    arr.remove("b2");
    p = 2;
    move = move+1;
    }
    else if (a3.equals("x") && c1.equals("x") && arr.contains("b2")==true )
    {
    b2 = "o";
    arr.remove("b2");
    p = 2;
    move = move+1;
    }
    else if (a1.equals("x") && b2.equals("x") && arr.contains("c3")==true )
    {
    c3 = "o";
    arr.remove("c3");
    p = 2;
    move = move+1;
    }
    else if (c3.equals("x") && b2.equals("x") && arr.contains("a1")==true )
    {
    a1 = "o";
    arr.remove("a1");
    p = 2;
    move = move+1;
    }
    else if (a3.equals("x") && c1.equals("x") && arr.contains("b2")==true )
    {
    b2 = "o";
    arr.remove("b2");
    p = 2;
    move = move+1;
    }
    else if (a3.equals("x") && b2.equals("x") && arr.contains("c1")==true )
    {
    c1 = "o";
    arr.remove("c1");
    p = 2;
    move = move+1;
    }
    else if (c1.equals("x") && b2.equals("x") && arr.contains("a3")==true )
    {
    a3 = "o";
    arr.remove("a3");
    p = 2;
    move = move+1;
    }
    //Random Play
    else
    {
      y = object.nextInt(arr.size());
      if (arr.get(y).equals("a2"))
      {
        a2 = "o";
        p = 2;
        move = move+1;
        arr.remove("a2");
      }
      else if (arr.get(y).equals("a3"))
      {
        a3 = "o";
        p = 2;
        move = move+1;
        arr.remove("a3");
      }
      else if (arr.get(y).equals("a1"))
      {
        a1 = "o";
        p = 2;
        move = move+1;
        arr.remove("a1");
      }
      else if (arr.get(y).equals("b1"))
      {
        b1 = "o";
        p = 2;
        move = move+1;
        arr.remove("b1");
      }
      else if (arr.get(y).equals("b2"))
      {
        b2 = "o";
        p = 2;
        move = move+1;
        arr.remove("b2");
      }
      else if (arr.get(y).equals("b3"))
      {
        b3 = "o";
        p = 2;
        move = move+1;
        arr.remove("b3");
      }
      else if (arr.get(y).equals("c1"))
      {
        c1 = "o";
        p = 2;
        move = move+1;
        arr.remove("c1");
      }
      else if (arr.get(y).equals("c2"))
      {
        c2 = "o";
        p = 2;
        move = move+1;
        arr.remove("c2");
      }
      else if (arr.get(y).equals("c3"))
      {
        c3 = "o";
        p = 2;
        move = move+1;
        arr.remove("c3");
      }
    }
    }
      
      
      
      
      
      
    //Player 1 winning
    if (arr.equals("o") && a2.equals("o") && a3.equals("o") || b1.equals("o") && b2.equals("o") && b3.equals("o") || c1.equals("o") && c2.equals("o") && c3.equals("o"))
    {
      winner=1;
    }
    else if (a1.equals("o") && b1.equals("o") && c1.equals("o") || a2.equals("o") && b2.equals("o") && c2.equals("o") || a3.equals("o") && b3.equals("o") && c3.equals("o"))
    {
      winner=1;
    }
    else if (a1.equals("o") && b2.equals("o") && c3.equals("o") || a3.equals("o") && b2.equals("o") && c1.equals("o"))
    {
      winner=1;
    }
    
    
    if (winner == 0)
    {
    //If there is a tie
    if (move == 9)
    {
      winner=1;
    }
    else if (p==2)
    {
    //The AI
    //Horizontal Wins
    if (a1.equals("x") && a2.equals("x") && arr.contains("a3")==true )
    {
    a3 = "x";
    arr.remove("a3");
    p = 1;
    move = move+1;
    }
    else if (a3.equals("x") && a2.equals("x") && arr.contains("a1")==true )
    {
    a1 = "x";
    arr.remove("a1");
    p = 1;
    move = move+1;
    }
    else if (a3.equals("x") && a1.equals("x") && arr.contains("a2")==true )
    {
    a2 = "x";
    arr.remove("a2");
    p = 1;
    move = move+1;
    }
    else if (b1.equals("x") && b2.equals("x") && arr.contains("b3")==true )
    {
    b3 = "x";
    arr.remove("b3");
    p = 1;
    move = move+1;
    }
    else if (b3.equals("x") && b2.equals("x") && arr.contains("b1")==true )
    {
    b1 = "x";
    arr.remove("b1");
    p = 1;
    move = move+1;
    }
    else if (b3.equals("x") && b1.equals("x") && arr.contains("b2")==true )
    {
    b2 = "x";
    arr.remove("b2");
    p = 1;
    move = move+1;
    }
    else if (c1.equals("x") && c2.equals("x") && arr.contains("c3")==true )
    {
    c3 = "x";
    arr.remove("c3");
    p = 1;
    move = move+1;
    }
    else if (c3.equals("x") && c2.equals("x") && arr.contains("c1")==true )
    {
    c1 = "x";
    arr.remove("c1");
    p = 1;
    move = move+1;
    }
    else if (c3.equals("x") && c1.equals("x") && arr.contains("c2")==true )
    {
    c2 = "x";
    arr.remove("c2");
    p = 1;
    move = move+1;
    }
    else if (a1.equals("o") && a2.equals("o") && arr.contains("a3")==true )
    {
    a3 = "x";
    arr.remove("a3");
    p = 1;
    move = move+1;
    }
    else if (a3.equals("o") && a2.equals("o") && arr.contains("a1")==true )
    {
    a1 = "x";
    arr.remove("a1");
    p = 1;
    move = move+1;
    }
    else if (a3.equals("o") && a1.equals("o") && arr.contains("a2")==true )
    {
    a2 = "x";
    arr.remove("a2");
    p = 1;
    move = move+1;
    }
    else if (b1.equals("o") && b2.equals("o") && arr.contains("b3")==true )
    {
    b3 = "x";
    arr.remove("b3");
    p = 1;
    move = move+1;
    }
    else if (b3.equals("o") && b2.equals("o") && arr.contains("b1")==true )
    {
    b1 = "x";
    arr.remove("b1");
    p = 1;
    move = move+1;
    }
    else if (b3.equals("o") && b1.equals("o") && arr.contains("b2")==true )
    {
    b2 = "x";
    arr.remove("b2");
    p = 1;
    move = move+1;
    }
    else if (c1.equals("o") && c2.equals("o") && arr.contains("c3")==true )
    {
    c3 = "x";
    arr.remove("c3");
    p = 1;
    move = move+1;
    }
    else if (c3.equals("o") && c2.equals("o") && arr.contains("c1")==true )
    {
    c1 = "x";
    arr.remove("c1");
    p = 1;
    move = move+1;
    }
    else if (c3.equals("o") && c1.equals("o") && arr.contains("c2")==true )
    {
    c2 = "x";
    arr.remove("c2");
    p = 1;
    move = move+1;
    }
    
    //Vertical Wins
    else if (a1.equals("x") && b1.equals("x") && arr.contains("c1")==true )
    {
    c1 = "x";
    arr.remove("c1");
    p = 1;
    move = move+1;
    }
    else if (a1.equals("x") && c1.equals("x") && arr.contains("b1")==true )
    {
    b1 = "x";
    arr.remove("b1");
    p = 1;
    move = move+1;
    }
    else if (b1.equals("x") && c1.equals("x") && arr.contains("a1")==true )
    {
    a1 = "x";
    arr.remove("a1");
    p = 1;
    move = move+1;
    }
    else if (a2.equals("x") && b2.equals("x") && arr.contains("c2")==true )
    {
    c2 = "x";
    arr.remove("c2");
    p = 1;
    move = move+1;
    }
    else if (a2.equals("x") && c2.equals("x") && arr.contains("b2")==true )
    {
    b2 = "x";
    arr.remove("b2");
    p = 1;
    move = move+1;
    }
    else if (b2.equals("x") && c2.equals("x") && arr.contains("a2")==true )
    {
    a2 = "x";
    arr.remove("a2");
    p = 1;
    move = move+1;
    }
    else if (a3.equals("x") && b3.equals("x") && arr.contains("c3")==true )
    {
    c3 = "x";
    arr.remove("c3");
    p = 1;
    move = move+1;
    }
    else if (a3.equals("x") && c3.equals("x") && arr.contains("b3")==true )
    {
    b3 = "x";
    arr.remove("b3");
    p = 1;
    move = move+1;
    }
    else if (b3.equals("x") && c3.equals("x") && arr.contains("a3")==true )
    {
    a3 = "x";
    arr.remove("a3");
    p = 1;
    move = move+1;
    }
    else if (a1.equals("o") && b1.equals("o") && arr.contains("c1")==true )
    {
    c1 = "x";
    arr.remove("c1");
    p = 1;
    move = move+1;
    }
    else if (a1.equals("o") && c1.equals("o") && arr.contains("b1")==true )
    {
    b1 = "x";
    arr.remove("b1");
    p = 1;
    move = move+1;
    }
    else if (b1.equals("o") && c1.equals("o") && arr.contains("a1")==true )
    {
    a1 = "x";
    arr.remove("a1");
    p = 1;
    move = move+1;
    }
    else if (a2.equals("o") && b2.equals("o") && arr.contains("c2")==true )
    {
    c2 = "x";
    arr.remove("c2");
    p = 1;
    move = move+1;
    }
    else if (a2.equals("o") && c2.equals("o") && arr.contains("b2")==true )
    {
    b2 = "x";
    arr.remove("b2");
    p = 1;
    move = move+1;
    }
    else if (b2.equals("o") && c2.equals("o") && arr.contains("a2")==true )
    {
    a2 = "x";
    arr.remove("a2");
    p = 1;
    move = move+1;
    }
    else if (a3.equals("o") && b3.equals("o") && arr.contains("c3")==true )
    {
    c3 = "x";
    arr.remove("c3");
    p = 1;
    move = move+1;
    }
    else if (a3.equals("o") && c3.equals("o") && arr.contains("b3")==true )
    {
    b3 = "x";
    arr.remove("b3");
    p = 1;
    move = move+1;
    }
    else if (b3.equals("o") && c3.equals("o") && arr.contains("a3")==true )
    {
    a3 = "x";
    arr.remove("a3");
    p = 1;
    move = move+1;
    }
    
    
    //Diagonal Wins
    else if (a1.equals("x") && c3.equals("x") && arr.contains("b2")==true )
    {
    b2 = "x";
    arr.remove("b2");
    p = 1;
    move = move+1;
    }
    else if (a3.equals("x") && c1.equals("x") && arr.contains("b2")==true )
    {
    b2 = "x";
    arr.remove("b2");
    p = 1;
    move = move+1;
    }
    else if (a1.equals("x") && b2.equals("x") && arr.contains("c3")==true )
    {
    c3 = "x";
    arr.remove("c3");
    p = 1;
    move = move+1;
    }
    else if (c3.equals("x") && b2.equals("x") && arr.contains("a1")==true )
    {
    a1 = "x";
    arr.remove("a1");
    p = 1;
    move = move+1;
    }
    else if (a3.equals("x") && c1.equals("x") && arr.contains("b2")==true )
    {
    b2 = "x";
    arr.remove("b2");
    p = 1;
    move = move+1;
    }
    else if (a3.equals("x") && b2.equals("x") && arr.contains("c1")==true )
    {
    c1 = "x";
    arr.remove("c1");
    p = 1;
    move = move+1;
    }
    else if (c1.equals("x") && b2.equals("x") && arr.contains("a3")==true )
    {
    a3 = "x";
    arr.remove("a3");
    p = 1;
    move = move+1;
    }
    else if (a1.equals("o") && c3.equals("o") && arr.contains("b2")==true )
    {
    b2 = "x";
    arr.remove("b2");
    p = 1;
    move = move+1;
    }
    else if (a3.equals("o") && c1.equals("o") && arr.contains("b2")==true )
    {
    b2 = "x";
    arr.remove("b2");
    p = 1;
    move = move+1;
    }
    else if (a1.equals("o") && b2.equals("o") && arr.contains("c3")==true )
    {
    c3 = "x";
    arr.remove("c3");
    p = 1;
    move = move+1;
    }
    else if (c3.equals("o") && b2.equals("o") && arr.contains("a1")==true )
    {
    a1 = "x";
    arr.remove("a1");
    p = 1;
    move = move+1;
    }
    else if (a3.equals("o") && c1.equals("o") && arr.contains("b2")==true )
    {
    b2 = "x";
    arr.remove("b2");
    p = 1;
    move = move+1;
    }
    else if (a3.equals("o") && b2.equals("o") && arr.contains("c1")==true )
    {
    c1 = "x";
    arr.remove("c1");
    p = 1;
    move = move+1;
    }
    else if (c1.equals("o") && b2.equals("o") && arr.contains("a3")==true )
    {
    a3 = "x";
    arr.remove("a3");
    p = 1;
    move = move+1;
    }
    
    //Random Play
    else
    {
      y = object.nextInt(arr.size());
      if (arr.get(y).equals("a2"))
      {
        a2 = "x";
        p = 1;
        move = move+1;
        arr.remove("a2");
      }
      else if (arr.get(y).equals("a3"))
      {
        a3 = "x";
        p = 1;
        move = move+1;
        arr.remove("a3");
      }
      else if (arr.get(y).equals("a1"))
      {
        a1 = "x";
        p = 1;
        move = move+1;
        arr.remove("a1");
      }
      else if (arr.get(y).equals("b1"))
      {
        b1 = "x";
        p = 1;
        move = move+1;
        arr.remove("b1");
      }
      else if (arr.get(y).equals("b2"))
      {
        b2 = "x";
        p = 1;
        move = move+1;
        arr.remove("b2");
      }
      else if (arr.get(y).equals("b3"))
      {
        b3 = "x";
        p = 1;
        move = move+1;
        arr.remove("b3");
      }
      else if (arr.get(y).equals("c1"))
      {
        c1 = "x";
        p = 1;
        move = move+1;
        arr.remove("c1");
      }
      else if (arr.get(y).equals("c2"))
      {
        c2 = "x";
        p = 1;
        move = move+1;
        arr.remove("c2");
      }
      else if (arr.get(y).equals("c3"))
      {
        c3 = "x";
        p = 1;
        move = move+1;
        arr.remove("c3");
      }
    }
    }
    }
    //Writing the board
    System.out.println(" "+a1+" | "+a2+" | "+a3+" ");
    System.out.println("---|---|---");
    System.out.println(" "+b1+" | "+b2+" | "+b3+" ");
    System.out.println("---|---|---");
    System.out.println(" "+c1+" | "+c2+" | "+c3+" ");
    System.out.println("");
    
    //If there is a tie
    if (move == 9)
    {
      System.out.println("Tie!");
      winner=1;
    }
    if (arr.equals("o") && a2.equals("o") && a3.equals("o") || b1.equals("o") && b2.equals("o") && b3.equals("o") || c1.equals("o") && c2.equals("o") && c3.equals("o"))
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
    else if (a1.equals("x") && b1.equals("x") && c1.equals("x") || a2.equals("x") && b2.equals("x") && c2.equals("x") || a3.equals("x") && b3.equals("x") && c3.equals("x"))
    {
      winner=1;
      System.out.println("Player 2 has won!");
    }
    else if (a1.equals("x") && b2.equals("x") && c3.equals("x") || a3.equals("x") && b2.equals("x") && c1.equals("x"))
    {
      winner=1;
      System.out.println("Player 2 has won!");
    }
    }
  }
}