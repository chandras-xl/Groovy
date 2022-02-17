// Groovy - Print the fibonacci serires

class Fibonacci{

    def printSeries(int nterm){
        def count = 0, n1 = 0, n2 = 1
        def nth
        if(nterm == 0){
            println("Fibonacci series of $nterm is: "+n1)
        }else if(nterm == 1){
            println("Fibonacci serires of $nterm is: "+n2)
        }else if(nterm < 0){
            println("Please enter a positive number")
        }else{
            println("The fibonacci serires of $nterm is: ")
            while(count < nterm){
                print("$n1\t")
                nth = n1 + n2
                n1 = n2
                n2 = nth
                count += 1
            }
        }
    }


    static void main(String[] args){
        def nterm = 7
        Fibonacci fibo = new Fibonacci()
        fibo.printSeries(nterm)
    }
}