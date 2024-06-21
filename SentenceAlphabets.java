public class SentenceAlphabets {
    public static void main(String[] args) {
        String sentence1 = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println("Is \"" + sentence1 + "\" a pangram? " + checkIfPangram(sentence1)); // Output: true
    }

    public static boolean checkIfPangram(String sentence){
        //each letter in an array of size 26
        boolean[] alphabetsPresent = new boolean[26];
        
        //Iterating through each character in the senetence

        for(int i=0; i<sentence.length(); i++){
            char ch = sentence.charAt(i); //ch is current character being examined
            // If character is a lowercase letter, mark its presence in the array
            if ('a' <= ch && ch <= 'z') {
                alphabetsPresent[ch - 'a'] = true; // a represents ascii value 97 
                //returns index that corresponds to where this character should be marked in array.
            }
        }
        //check if all letters are present or not
        for( boolean present: alphabetsPresent){
            if(!present){
                return false;
            }
        }
        return true; //if all leteters are present.

    }
}
