public class main {

 public static void main(String[] args) {
 }}
private class Node?

{?

private Node[] next = new Node[R];?

private boolean end;?

}?
public class StringSET?

{?

private static final int R = 128;?

private Node root = new Node();?

?



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
 
