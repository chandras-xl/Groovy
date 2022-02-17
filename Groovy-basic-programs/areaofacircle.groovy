// Groovy - To find the area of a circle

class AreaOfCircle{
    def getArea(float pi, float r){
        return pi * r * r
    }
    static void main(String[] args){
        float pi = 3.14
        float r = 23.45f
        AreaOfCircle area = new AreaOfCircle()
        println("The area of a circle is: "+area.getArea(pi,r))
    }
}