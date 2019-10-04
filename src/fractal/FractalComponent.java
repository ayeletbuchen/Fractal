package fractal;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class FractalComponent extends JComponent {

    ArrayList<Vector2D> vectors = new ArrayList<>();

    public FractalComponent() {
        vectors.add(new Vector2D(0, 700));
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);

        double x1 = 50;
        double y1 = getHeight() / 2;
        double x2;
        double y2;
        for (Vector2D v : vectors) {
            x2 = x1 + Math.cos(Math.toRadians(v.direction)) * v.magnitude;
            y2 = y1 + Math.sin(Math.toRadians(v.direction)) * v.magnitude;;
            graphics.drawLine((int) x1, (int) y1, (int) x2, (int) y2);
        }
    }
}
