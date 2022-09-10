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
         Arrays.sort(wordOfRoot);
         Arrays.sort(wordOfChild);
         
         return Arrays.equals(wordOfRoot, wordOfChild);
     }
    
    public static boolean checker(String [] x){
        return Arrays.asList(x)
                  .contains(" ");
    }
    
    
}
