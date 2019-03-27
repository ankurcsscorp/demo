public class StringConcept

{
  
  public static void main(String [] args)
  
  {
 int count=1;
 
       String st="abcd";
   
     String str[]={"donkey","cab","apple"};
 
       char[] ch=st.toCharArray();
    
    do
 
       {
   
     for(int i=0;i<ch.length;i++)
  
      {
        
    count++;
     
       for(int j=0;j<ch.length;j++)
  
      {
     
       String string=str[j];
   
         char[] chh=string.toCharArray();
    
        if(ch[i]==chh[0])
    
        {
            
    System.out.println(str[j]);

            }
     
   }
      
  }
   
 }
while(true);
 
   }

}