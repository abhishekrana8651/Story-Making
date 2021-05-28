import edu.duke.*;
import java.util.*;

public class Charactersinplay {
    
    private ArrayList<String> myWords;
    private ArrayList<Integer> myFreqs;
    
    public Charactersinplay(){
    
       myWords = new ArrayList<String>();
       myFreqs = new ArrayList<Integer>();
    
    }
    
    public void findtheCharacter() {
           String member = " ";
        FileResource resource = new FileResource();
        for(String line : resource.lines())
        {
            if(  line.indexOf(".") != -1)
            {
            
                 member = line.substring(0, line.indexOf("."));
            
            }
            
            
             int index = myWords.indexOf(member);
        
              if(index == -1)
              {
                    myWords.add(member);
                    myFreqs.add(1);
                
                
                
                }
                  else
                  {
                    
                   int value = myFreqs.get(index);
                   myFreqs.set(index,value+1);
                    
                    
                    
                    }
        
        
        
        
        }
    
    
    }
    
      public void tester1(){
             findtheCharacter();
             System.out.println("Number Of Characters " + myWords.size());
             for(int k = 0; k< myWords.size(); k++)
             {
                System.out.println(myFreqs.get(k) + "\t" + myWords.get(k));
                
                
                }
        
        
        
        }
    
    
    
    

}
