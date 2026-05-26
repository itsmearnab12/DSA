class Problem3120 {
    public int numberOfSpecialChars(String word) {
        int lower[] = new int['z' - 'a' + 1];
        int upper[] = new int['Z' - 'A' + 1];
        String s = word.toUpperCase();
        String n = word.toLowerCase();
        for(int i=0; i<word.length(); i++){
            if(word.charAt(i) == s.charAt(i)){
                upper[s.charAt(i) - 'A']++;
            }else{
                lower[n.charAt(i) - 'a']++;
            }
        }
        int count = 0;
        for(int i=0; i<upper.length; i++){
            if(upper[i] >= 1 && lower[i] >= 1){
                count++;
            }
        }
        return count;
    }
}