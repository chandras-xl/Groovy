//Groovy - To print the sum of array

class SumOfArray{

    def display(def arr){
        def sum = 0
        for(element in arr){
            sum += element
        }
        println("Sum of Array: "+sum)
    }

    static void main(String[] args){
        def arr = [22,31,44,98,4,67]
        SumOfArray soa = new SumOfArray()
        soa.display(arr)
    }
}