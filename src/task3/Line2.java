package task3;

public class Line2 {
    private int startx;
    private int starty;
    private int endx;
    private int endy;
    private int[] start;
    private int[] end;

    public Line2(int startx, int starty, int endx, int endy) {
        this.startx = startx;
        this.starty = starty;
        this.endx = endx;
        this.endy = endy;
        start = new int[]{startx, starty};
        end = new int[]{endx, endy};
    }

    
    /** 
     * @return int[]
     */
    public int[] getStart() {
        return start;
    }

    public int[] getEnd() {
        return end;
    }

    public void setStart(int startX, int startY) {
        start[0] = startX;
        start[1] = startY;

        this.startx = startX;
        this.starty = startY;
    }
    
    public void setEnd(int endX, int endY) {
        end[0] = endX;
        end[1] = endY;

        this.endx = endX;
        this.endy = endY;
    }

    public void setStartx(int startx) {
        this.startx = startx;

        start[0] = startx;
    }

    public void setStarty(int starty) {
        this.starty = starty;

        start[1] = starty;
    }

    public void setEndx(int endx) {
        this.endx = endx;

        end[0] = endx;
    }

    public void setEndy(int endy) {
        this.endy = endy;

        end[1] = endy;
    }

    public double getLength() {
        double deltaX = endx - startx;
        double deltaY = endy - starty;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
}
