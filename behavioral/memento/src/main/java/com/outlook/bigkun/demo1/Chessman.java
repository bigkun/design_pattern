package com.outlook.bigkun.demo1;

/**
 * @author zhanghk
 * @since 2019/8/14
 */
public class Chessman {
    private String label;
    private int x;
    private int y;

    public Chessman(String label, int x, int y) {
        this.label = label;
        this.x = x;
        this.y = y;
    }

    public ChessmanMemento save() {
        return new ChessmanMemento(label, x, y);
    }

    public void restore(ChessmanMemento memento) {
        label = memento.getLabel();
        x = memento.getX();
        y = memento.getY();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Chessman{" +
                "label='" + label + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
