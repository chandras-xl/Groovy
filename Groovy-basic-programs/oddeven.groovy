// Groovy - odd even check

class OddEven{

    def display(arr){
        for(element in arr){
            if(element%2 == 0){
                println("$element is even")
            }else{
                println("$element is odd")
            }
        }
    }
    static void main(String[]  args){
        def arr = [1,2,3,4,5,6,7,8,9,10]
        OddEven oe = new OddEven()
        oe.display(arr)
    }
}