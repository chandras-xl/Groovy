// Groovy - Sum of square of n-natural numbers

class SumOfSquare{
    
    def display(int num){
        def res = 0
        for(int i=0;i<=num;i++){
            res = res + (i * i)
        }
        println("The sum of square of $num natural number is: "+res)
    }

    static void main(String[] args){
        def n = 5
        SumOfSquare soq = new SumOfSquare()
        soq.display(n)
    }
}