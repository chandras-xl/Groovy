//Groovy - To check if the string is palindrome or not

class Palindrom{

    def checkPalindrom(arr){
        for(element in arr){
            if(element == element.reverse()){
                println("$element is an palindrome")
            }else{
                println("$element is not a palindrom")
            }
        }
    }
    static void main(String[] args){
        def arr = ["madam","hello","malayalam"]
        Palindrom p = new Palindrom()
        p.checkPalindrom(arr)
    }
}