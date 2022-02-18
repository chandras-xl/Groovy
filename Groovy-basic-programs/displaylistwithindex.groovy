//Groovy -Display a list along with its index value

class Index{
    static void main(String[] args){
        def lst = ["Hello","Welcome","To","Groovy"]
        println("Index  :   Value")
        println("=================")
        lst.eachWithIndex{ it, index -> println index+"      :   "+it } 
    }
}