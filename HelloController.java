package com.example.assiignment1;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HelloController {

    @FXML
    private TextField inputTextField;

    @FXML
    private Label totalLabel;

    @FXML
    private Label averageLabel;

    @FXML
    private Label maxLabel;

    @FXML
    private Label minLabel;

    public void calculateButtonClicked() {
        String inputText = inputTextField.getText();
        List<Double> numbers = Arrays.stream(inputText.split("\\s*,\\s*"))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        double total = Excel.calculateTotal(numbers);
        double average = Excel.calculateAverage(numbers);
        double max = Excel.calculateMaximum(numbers);
        double min = Excel.calculateMinimum(numbers);

        totalLabel.setText(String.valueOf(total));
        averageLabel.setText(String.valueOf(average));
        maxLabel.setText(String.valueOf(max));
        minLabel.setText(String.valueOf(min));
    }

    public void totalButtonClicked() {
        String inputText = inputTextField.getText();
        List<Double> numbers = Arrays.stream(inputText.split("\\s*,\\s*"))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        double total = Excel.calculateTotal(numbers);
        totalLabel.setText(String.valueOf(total));
    }

    public void averageButtonClicked() {
        String inputText = inputTextField.getText();
        List<Double> numbers = Arrays.stream(inputText.split("\\s*,\\s*"))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        double average = Excel.calculateAverage(numbers);
        averageLabel.setText(String.valueOf(average));
    }

    public void maximumButtonClicked() {
        String inputText = inputTextField.getText();
        List<Double> numbers = Arrays.stream(inputText.split("\\s*,\\s*"))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        double max = Excel.calculateMaximum(numbers);
        maxLabel.setText(String.valueOf(max));
    }

    public void minimumButtonClicked() {
        String inputText = inputTextField.getText();
        List<Double> numbers = Arrays.stream(inputText.split("\\s*,\\s*"))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        double min = Excel.calculateMinimum(numbers);
        minLabel.setText(String.valueOf(min));
    }

    public void refreshButtonClicked() {
        // Clear the input field and reset labels
        inputTextField.clear();
        totalLabel.setText("");
        averageLabel.setText("");
        maxLabel.setText("");
        minLabel.setText("");
    }
}