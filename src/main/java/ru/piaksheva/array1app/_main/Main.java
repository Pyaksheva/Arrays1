package ru.piaksheva.array1app._main;

import ru.piaksheva.array1app.controller.Controller;
import ru.piaksheva.array1app.model.service.ArrayService;
import ru.piaksheva.array1app.view.ResultWriter;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{8, 1, 6, 3, -5, 7, 12, 4, -2, 9};
        ArrayService arrayService = new ArrayService();
        ResultWriter resultWriter = new ResultWriter();
        Controller controller = new Controller(arrayService, resultWriter);
        controller.calculate(arr);
    }
}
