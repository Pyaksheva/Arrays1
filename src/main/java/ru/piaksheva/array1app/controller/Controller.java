package ru.piaksheva.array1app.controller;

import ru.piaksheva.array1app.model.entity.ArrayData;
import ru.piaksheva.array1app.model.service.ArrayService;
import ru.piaksheva.array1app.view.ResultWriter;

public class Controller {
    ArrayService arrayService;
    ResultWriter resultWriter;

    public Controller(ArrayService arrayService, ResultWriter resultWriter) {
        this.arrayService = arrayService;
        this.resultWriter = resultWriter;
    }

    public void calculate(int[] arr) {
        ArrayData arrayData = arrayService.calculate(arr);
        resultWriter.printResult(arrayData);
    }
}
