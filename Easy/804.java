/*
804. Unique Morse Code Words
International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows: "a" maps to ".-", "b" maps to "-...", "c" maps to "-.-.", and so on.

For convenience, the full table for the 26 letters of the English alphabet is given below:

[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
Now, given a list of words, each word can be written as a concatenation of the Morse code of each letter. For example, "cab" can be written as "-.-.-....-", (which is the concatenation "-.-." + "-..." + ".-"). We'll call such a concatenation, the transformation of a word.

Return the number of different transformations among all words we have.

Example:
Input: words = ["gin", "zen", "gig", "msg"]
Output: 2
Explanation: 
The transformation of each word is:
"gin" -> "--...-."
"zen" -> "--...-."
"gig" -> "--...--."
"msg" -> "--...--."

There are 2 different transformations, "--...-." and "--...--.".
 

Note:

The length of words will be at most 100.
Each words[i] will have length in range [1, 12].
words[i] will only consist of lowercase letters.
*/
//Solution in Java
class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        List<String> stored = new ArrayList<String>();
        for(int i = 0; i< words.length; i++)
        {
            int word_length = words[i].length();
            String morse = "";
            for(int j = 0; j < word_length; j++)
            {
                morse += word_search(String.valueOf(words[i].charAt(j)));
            }
            if(!stored.contains(morse))
                stored.add(morse);
        }
        return stored.size();
    }
    public String word_search(String chara)
    {
        String[] word = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        switch(chara)
        {
            case "a": return word[0];
            case "b": return word[1];
            case "c": return word[2];
            case "d": return word[3];
            case "e": return word[4];
            case "f": return word[5];                
            case "g": return word[6];
            case "h": return word[7];
            case "i": return word[8];
            case "j": return word[9];
            case "k": return word[10];                
            case "l": return word[11];
            case "m": return word[12];
            case "n": return word[13];
            case "o": return word[14];
            case "p": return word[15];
            case "q": return word[16];
            case "r": return word[17];
            case "s": return word[18];
            case "t": return word[19];
            case "u": return word[20];
            case "v": return word[21];
            case "w": return word[22];
            case "x": return word[23];
            case "y": return word[24];
            case "z": return word[25];
        }
        return "a";
    }
}
