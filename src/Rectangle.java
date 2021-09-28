public class Rectangle implements Comparable<Rectangle>{
    private int width;
    private int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle() {
    }

    public int CalculateArea(){
        return width*length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                "Area =" + CalculateArea()+
                '}';
    }
    @Override
    public int compareTo(Rectangle o) {
        int result = Double.compare(CalculateArea(), o.CalculateArea());
        return result;
    }


}