package task3;

public class Line {
    private Point start;
    private Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    
    /** 
     * @return Point
     */
    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public double getLength() {
        double deltaX = end.getX() - start.getX();
        double deltaY = end.getY() - start.getY();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
}
