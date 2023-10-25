package coordinate;

import coordinate.domain.FigureFactory;
import coordinate.domain.Points;
import coordinate.ui.InputUI;
import coordinate.ui.OutputUI;

public class Application {
    public static void main(String[] args) {
        InputUI inputUI = new InputUI();
        // (10,10)-(14,15)
        //(10,10)-(22,10)-(22,18)-(10,18)
        //(10,10)-(14,15)-(20,8)
        Points points = inputUI.outputAndInputPoints();
        OutputUI outputUI = new OutputUI(FigureFactory.generate(points));
        outputUI.drawGraph();
        outputUI.printSize();

    }
}
