package easy;

public class _454_RectangleArea {
    public int height = 0;
    public int width = 0;

    /*
     * Define a constructor which expects two parameters width and height here.
     */
    // write your code here
    public _454_RectangleArea(int h , int w){
        height = h;
        width = w;
    }
    /*
     * Define a public method `getArea` which can calculate the area of the
     * rectangle and return.
     */
    // write your code here
    public int getArea(){
        return height * width;
    }
}
