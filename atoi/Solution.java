class Solution {
    public int myAtoi(String str) {
        Integer number = null;
        Boolean negative = null;
        for (char character : str.toCharArray()) {
            if((character >= '0' && character <= '9')){
                if(number == null){
                    number = character - '0';
                } else {
                    long numberTest =  (10 * ((long) number)) + (character - '0');
                    if(numberTest > Integer.MAX_VALUE){
                        return negative != null && negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                    }
                    number = (10 * number) + (character - '0');
                }
            } else if(character == '-'){
                if(number == null){
                    if(negative == null)
                        negative = true;
                    else 
                        return 0;
                } else {
                    break;
                }
            } else if (character == ' '){
                if(number == null && negative == null)
                    continue;
                else
                    break;
            } else if(character == '+'){
                if(negative == null)
                    negative = false;
                else 
                    break;
            } else
                break;
        }

        if(number == null)
            return 0;
        if(negative != null && negative)
            number*= -1;
        return number;
    }
}