//Groovy - check if a word present in a given string

class CheckString{

    def stringCheck(String str, String wrd){
        String[] lst
        lst = str.split(' ')
        for(item in lst){
            if(item == wrd){
                return true
            }
        }
    }
    static void main(String[] args){
        String str = "Hello welcome to groovy programming" 
        String wrd = "groovy"
        CheckString cs = new CheckString()
        Boolean chk_bool = cs.stringCheck(str,wrd)
        if(!chk_bool){
            println("Match not found for the word $wrd")
        }else{
            println("Match found for the word $wrd")
        }
    }
}