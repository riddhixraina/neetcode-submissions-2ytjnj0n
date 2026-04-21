class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        for(String strings : strs){
            encoded.append(strings.length()).append("#").append(strings);
        }
        return encoded.toString();

    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int index = 0;

        while(index < str.length()){
            int j = index;
            while (str.charAt(j) != '#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(index,j));
            index = j+1;
            j = index + length;
            res.add(str.substring(index,j));
            index = j;
        }
        return res;
    }
}

//character bby character in the input, once the word ends split each word with a #
// but what happens if we have special characters or # in the middle of the string
//single special character demiliter doesn't work. 

//maintain a separate array list with length of each word, but where to store it? 
//Cannot store that list in a separate data structure (in description its given that encode and decode should be stateless)
//is it possible to store in the string itself? ex. ["neet", "code"] -> [4#neet, 5#co#de]length of the word at the very start of the word (solves the problem where the word contains numbers/ special characters)