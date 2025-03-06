
import java.util.TreeSet;

public class SpellCheck {

	protected TreeSet <String> Dictionary;

	public SpellCheck(TreeSet<String> Dictionary) {
	
		this.Dictionary = Dictionary;
		}
	
	
	
	public TreeSet<String> checker (String str) {
		
		TreeSet<String> suggestedList = new TreeSet<>();
		
		
	
		
		//if  the word is in the dictionary, it is spelled correctly
		if(Dictionary.contains(str)) {
			
			suggestedList.add(str);
			
		}
		
		//if the word is not in the dictionary, check for common misspellings
		
		else {
				//first Check for swapped adjacent characters
			
			 for(int i = 0; i < str.length()-1; i++) {
				 
                 String swapped = swappedAdjacent(str, i , i+1);					 //for example   "Ali" change "AÝL"
                 
                 if(Dictionary.contains(swapped)==true) {
                	 
                         suggestedList.add(swapped+" -Became SwappedMethod-");
                 }
         }
			 //Check for inserted characters
			 
			 for(int i=0; i<str.length()+1;i++) {
				 
				 for(char c = 'a'; c <= 'z'; c++){
					 
					 String inserted = InsertC(str, c, i);					 //for example   "Ali" change "Alim"
					 
					 if(Dictionary.contains(inserted)==true) {
						 
						 suggestedList.add(inserted+" -Became InsertedMethod-");
						 
					 }
					
			    	 
			        
			     }
				 
			 }
			//Check for deleted characters
			 for(int i=0 ; i<str.length();i++) {
				 
				 String deleted = Deleted(str, i, i+1);					 //for example   "Ali" change "Al"
				 
				 if(Dictionary.contains(deleted)==true)
				 {
				 
					 suggestedList.add(deleted+" -Became DeletedMethod-");
				 }
				 
				 
				 
			 }
			 
			 //Check for replaced characters
			 for(int i = 0; i<str.length();i++) {
				 
			    	for(char c = 'a'; c <= 'z'; c++){       
			    		
			    		String replaced = Replaced(str, i, c);			 //for example   "Ali" change "All"
			    		
			    		if(Dictionary.contains(replaced)==true) {
			    			
			    			suggestedList.add(replaced+" -Became ReplaceMethod-");
			    			
			    		}
			    					    	}
			    	
			    }
				 
				 
			
				
				
			}
		
			
		return suggestedList;
		
	}
	
	
	
	//Function to swapped a character
	private String swappedAdjacent (String str, int i , int j) {
		
		StringBuilder sb = new StringBuilder(str);
		
        sb.setCharAt(i, str.charAt(j));     //ali   to ail
        
        sb.setCharAt(j, str.charAt(i));
        
        return sb.toString();    //string
		}
	
	//Function to insert a character
	private  String InsertC(String str, char c, int i){
	    
	    StringBuilder sb1 = new StringBuilder(str);
	    
	    sb1.insert(i,c);
	    
	    return sb1.toString();
	    
	  }
	//Function to delete a character
	private  String Deleted(String str,int inital , int offset) {
		
		StringBuilder sb2 = new StringBuilder(str);
		
		sb2.delete(inital,offset);
		
		return sb2.toString();
		
		
		
		
	}
	
	private  String Replaced(String str , int index , char c) {
		
		StringBuilder sb3 = new StringBuilder(str);
		
		 sb3.setCharAt(index,c);					//ali  convert to alt
		 
		return sb3.toString() ;
		
	}
	
	
	
	
	
}
