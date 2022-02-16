// Adding two numbers with groovy

class Add{

    def display(int n1, int n2){
        return n1 + n2
    }
    static void main(String[] args){
        int n1 = 10
        int n2 = 20
        Add add = new Add()
        println("Addition of $n1 and $n2 is: "+add.display(n1,n2))
    }
}