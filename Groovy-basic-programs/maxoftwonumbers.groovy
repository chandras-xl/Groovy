//Groovy - To check max of two numbers

class MaxOfTwo{
    def check_max(int n1, int n2){
        println("Max of $n1 and $n2 is: "+Math.max(n1,n2))
    }
    static void main(String[] args){
        MaxOfTwo mx = new MaxOfTwo()
        mx.check_max(10,15)
    }
}