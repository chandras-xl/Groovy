// Groovy - Find the largest element in the array

class LargestArrayElement{

    def display(def arr){
        def max = arr[0]
        for(int i=0; i<arr.size;i++){
            if(arr[i] > max){
                max = arr[i]
            }
        }
        return max
    }

    static void main(String[] args){
        def arr = [23,202,41,53,76,101,3]
        LargestArrayElement lae = new LargestArrayElement()
        println("The max element of array is: "+lae.display(arr))
    }
}