//Groovy - check if a word present in a given string

class CheckString{

    def stringCheck(String str, String wrd){
        String[] lst
        lst = str.split(' ')
        for(item in lst){
            if(item == wrd){
                println("Match found for word $wrd")
            }
        }
    }
    static void main(String[] args){
        String str = "Hello welcome to groovy programming" 
        String wrd = "groovy"
        CheckString cs = new CheckString()
        cs.stringCheck(str,wrd)
    }
}