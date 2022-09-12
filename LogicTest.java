import java.util.*;

// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        String[] array = {"cook", "save", "taste", "aves", "vase", "state", "map"};
        ArrayList<String[]> result = new ArrayList<String[]>();
        
        for (int i = 0; i < array.length; i++){
            String wordAnagram = array[i];
            for (int j = i; j < array.length-1; j++){
		        if (anagram(array[i], array[j+1])){
                    wordAnagram += ","+array[j+1];
                    array[j+1] = " ";
                }
            }
            String [] temp = wordAnagram.split(",");
            if(!checker(temp)){
                result.add(temp);       
            }          
        }
        
        result.stream().forEach(elem -> System.out.println("element " + Arrays.toString(elem)));
     }
     
     public static boolean anagram(String root, String child){
         char [] wordOfRoot = root.toLowerCase().toCharArray();
         char [] wordOfChild = child.toLowerCase().toCharArray();
         wordOfRoot = sorting(wordOfRoot);
         wordOfChild = sorting(wordOfChild);
         
         return compare(wordOfRoot, wordOfChild);
     }
    
    public static boolean checker(String [] x){
        return Arrays.asList(x)
                  .contains(" ");
    }

    public static char[] sorting(char[] word){
        
        for(int i = 0; i<word.length; i++)   //Holds each element
         {  
             for (int j = i+1; j<word.length; j++)  //Check for remaining elements 
             {  
                //compares each elements of the array to all the remaining elements  
                if( Character.compare(word[i],word[j])>0)   
                {  
                    //swapping array elements  
                    char temp = word[i];  
                    word[i] = word[j];  
                    word[j] = temp;  
                 }  
              }  
           }
           
           return word;
    }
    
    public static boolean compare(char[] word1, char[] word2){
	int counter = 0;
	
	if (word1.length != word2.length){
	    return false;
	}
	
	for (int i = 0; i < word1.length; i++){
		if(word1[i] != word2[i]){
			counter++;
		}
	}

	if(counter != 0){
		return false;
	}else{
		return true;
	}
}
}
