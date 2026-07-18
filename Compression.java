class Compression {
    
    public static String stringCompress(String str){
        StringBuilder answer = new StringBuilder("");

        for(int i=0; i<str.length(); i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1) ){
                count++;
                i++;
            }
            answer.append(str.charAt(i));
            if(count>1){
                answer.append(count.toString());
            }
        }
    return answer.toString();
    }

    public static void main(String args[]){
        String str = "aaabccccc";

        System.out.println(stringCompress(str));
    }
}
