//Groovy - To get the factorial of a number

class Factorial{
    def getFactorial(num){
        if(num == 0 || num == 1){
            return 1
        }else{
            return num * getFactorial(num-1)
        }
    }
    static void main(String[] args){
        int n = 6
        Factorial fact = new Factorial()
        println("The factorial of $n is: "+fact.getFactorial(n))
    }
}