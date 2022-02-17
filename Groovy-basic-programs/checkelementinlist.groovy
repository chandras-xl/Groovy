//Groovy - check for element in groovy

class CheckElement{

    def check(int num, def arr){
        for(int i=0;i<arr.size;i++){
            if(arr[i] == num){
                println("$num found in the list at index $i")
            }
        }
    }

    static void main(String[] args){
        def num = 10
        def arr = [1,2,44,30,10,12,15]
        CheckElement ce = new CheckElement()
        ce.check(num, arr)
    }
}