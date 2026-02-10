import java.util.*;
import java.io.BufferedReader;
import java.io.*;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.FileReader;

public class spell_checker{
public static void main(String[] args)
{
ArrayList<String>dict = new ArrayList<String>();
  
  Scanner keyboard = new Scanner(System.in);
  String fileName = "tempdictionary.txt"; 
  Scanner inputStream = null;
  
  try
  {
    inputStream = new Scanner(new File(fileName));
  }
  catch (FileNotFoundException e)
  {
    System.out.println ("Error opening the file " + fileName );
    System.exit (0);
  }
  while(inputStream.hasNextLine())
  {
    String line=inputStream.nextLine();
    dict.add(line);
    System.out.println(line);
    
  }
  inputStream.close();
// use a small text file for dictionary test
  for (String s: dict)
  {System.out.print(s+" ");}
//read test document line by line, parse each word from the line  

  BufferedReader br =null;
  //System.out.println(System.getProperty("user.dir"));
  //C:\Users\Juan Pablo\Documents\Hood etxtbk\cs 202\CS202 assignments\mini project 
 try{
   br = new BufferedReader(new FileReader("temptestingdocument.txt"));
   String line;
   while( (line=br.readLine())!= null){
     //System.out.println(line);
     
     //for(int i=0; i> words.length; i++)
     System.out.print(line);
     String[] words =line.split(" ");
     for(int i=0; i< words.length; i++)
       System.out.println(words[i]);
    
   }
   br.close();
 }
 catch (IOException e){
     e.printStackTrace();}
System.out.println("\n Done");
}
}
//------------
/*public class StringSET?

{?

private static final int R = 128;?

private Node root = new Node();?

?

private class Node?

{?

private Node[] next = new Node[R];?

private boolean end;?

}?

?

public boolean contains(String s)?

{ return contains(root, s, 0); }?

?

private boolean contains(Node x, String s, int d)?

{?

if (x == null) return false;?

if (d == s.length()) return x.end;?

char c = s.charAt(d);?

return contains(x.next[c], s, d+1);?

}?
public void add(String s)?

{ root = add(root, s, 0); }?

?

private Node add(Node x, String s, int d)?

{?

if (x == null) x = new Node();?

if (d == s.length()) x.end = true;?

else?

{?

char c = s.charAt(d);?

x.next[c] = add(x.next[c], s, d+1);?

}?

return x;?

}?
?
public class TST{?

{?

private class Node?

{ class Node?

{?

char c;?

Node left, mid, right;?

boolean end;?

}?}?

?

public boolean contains(String s)?

{ return contains(root, s, 0); }?

?

private boolean contains(Node x, String s, int d)?

{?

if (x == null) return false;?

char c = s.charAt(d);?

if (c < x.c) return contains(x.left, s, d);?

else if (c > x.c) return contains(x.right, s, d);?

else if (d < s.length()-1) return contains(x.mid, s, d+1);?

else return x.end;?

}?
 public void add(String s)?

{ root = add(root, s, 0); }?

?

private Node add(Node x, String s, int d)?

{?

char c = s.charAt(d);?

if (x == null) x = new Node(c);?

if (c < x.c) x.left = add(x.left, s, d);?

else if (c > x.c) x.right = add(x.right, s, d);?

else if (d < s.length()-1) x.mid = add(x.mid, s, d+1);?

else x.end = true;?

return x;?

}?

?

}
 
*/