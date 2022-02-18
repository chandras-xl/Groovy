//Groovy - Specify an item to be removed from a list

class RemoveItem{
    def remove(int item,def lst){
       for(int i=0;i<lst.size;i++){
           if(lst[i] == item){
               lst.remove(i)
               println("Removed item $item at index postition $i")
               println("List after removing item $item: "+lst)
           }
       } 
    }
    static void main(String[] args){
        def lst = [1,2,3,4,5,6]
        int item = 3
        RemoveItem ri = new RemoveItem()
        println("List before removing any item: "+lst)
        ri.remove(item,lst)

    }
}