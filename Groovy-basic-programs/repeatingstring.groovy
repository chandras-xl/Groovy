//Groovy - Repeating string for n times

class StringRepeat{

    def display(String str, int n){
        return str*n
    }
    static void main(String[] args){
        String str = "Hello! "
        int n = 3
        StringRepeat sr = new StringRepeat()
        println("Repeating $str $n times: "+sr.display(str,n))
    }
}