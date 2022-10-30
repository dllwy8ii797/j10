class Caaa 
{ 
private int num; 
 
public Caaa() 
{ 
this(2); // 呼叫 Caaa(int n)建構元
} 
public Caaa(int n) 
{ 
num=n; 
} 
public int get() 
{ 
return num; 
} 
} 
class Cbbb extends Caaa 
{ 
public void show() 
{ 
System.out.println("num="+get()); 
} 
} 
public class j10 
{ 
public static void main(String args[]) 
{ 
Cbbb bb=new Cbbb(); 
bb.show(); 
} 
} 
