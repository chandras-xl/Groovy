//Groovy - Reverse a list

class ReverseList{
    static void main(String[] args){
        def lst = [1,2,3,4,5,6]
        def rev = lst.reverse()
        println("The original list: "+lst)
        println("The reversed list: "+rev)
    }
}