
/**
 * Write a description of wordsinfile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */ 
import edu.duke.*;
import java.util.*;
import java.io.*;

public class wordsinfile {
    
    private HashMap<String,Integer> map;
    DirectoryResource dr;     // here we take the directoryresource as field because we are using it at the two cases and it make the program much efficient.
    
    public wordsinfile(){
     map = new HashMap<String,Integer>();
     dr = new DirectoryResource();
    
    }
    
    public void addwordinfile(){
    
       
        for(File f : dr.selectedFiles())
        {
           FileResource resource = new FileResource(f);
           for(String s : resource.words())
           {
            
             if(map.containsKey(s))
             {
                  map.put(s, map.get(s) + 1);
                
                
                }
            
              else
              {
                map.put(s,1);
                
                }
            }
        
        
        }
    
    
    
    
    
    
    }
    
   public void maxcodon(){   // find the word with most of the occurences
         int k = 0;
         String result = "";
        for(String s : map.keySet())
        {
            int u = map.get(s);
            if(u>k)
            {  k=u;
                result = s;
            }
        
        
        }   System.out.println("The maximum occuence of: " + result); 
    
    System.out.println(" this word occur " + k); 
    }
  
    
    public String dualpurpose(){
         int k = 0;
         String result = "";
        for(String s : map.keySet())
        {
            int u = map.get(s);
            if(u>k)
            {  k=u;
                result = s;
            }
        
        
        }  return result; 
    }
    
    
    public void  findthenameoffile(){  // this is used to fin the name of the file.
        
        for(File f : dr.selectedFiles())
        {
            FileResource fr = new FileResource(f);
            for(String s : fr.words())
          {
                String result = dualpurpose();
                if(result.equals(s)){
                     String name = f.getName();
                    System.out.println("the name of the file with the highest common word is   " + name);
                    break;  // this is very important concept 
                
                }
                
            }
                     
                
                
            
            
            }
            
        
        
        }
        
        
        
    
    
    
    public void tester(){
    
        addwordinfile();
        maxcodon();
        findthenameoffile();
    
    
    }
}
