public class Rectangle {
    int length,breadth;
    public Rectangle(int length, int breadth) {
        this.length=length;
        this.breadth =breadth;

    }
    public Rectangle square(int length) {
        this.length=length;
        this.breadth =length;
        return  new Rectangle(length,breadth);
    }

    public int Area(){
        return length*breadth;
    }
    public  int Perimeter()
    {
        return (2*(length+breadth));
    }

}
