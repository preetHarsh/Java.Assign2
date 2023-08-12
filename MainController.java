package com.javafx.assignment2javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class MainController {
    @FXML
    private TextField txtNumbers;
    @FXML
    private TextField txtResults;
    @FXML
    private RadioButton rdoAutoSum;
    @FXML
    private RadioButton rdoAverage;
    @FXML
    private RadioButton rdoMaximum;
    @FXML
    private RadioButton rdoMinimum;

    @FXML
    private ToggleGroup group ;

    private String getNumbers() {
        return txtNumbers.getText();
    }

    private void showResults(String results){
        txtResults.setText(results);
    }

    private String getSelected(){
        RadioButton selectedRadioButton = (RadioButton) group.getSelectedToggle();

        if (selectedRadioButton != null)
            return selectedRadioButton.getText();
        return  null;
    }

    private void autoSum(){
        Excel excel = new Excel(getNumbers());
        Double total = excel.findTotal();
        showResults(total.toString());
    }

    private void showAverage(){
        Excel excel = new Excel(getNumbers());
        Double total = excel.findAverage();
        showResults(total.toString());
    }

    private void showMax(){
        Excel excel = new Excel(getNumbers());
        Double total = excel.findMax();
        showResults(total.toString());
    }

    private void showMin(){
        Excel excel = new Excel(getNumbers());
        Double total = excel.findMin();
        showResults(total.toString());
    }

    @FXML
    public void  calculate(){
        String action = getSelected();
        if(action != null) {
            if (action.equals("Auto Sum")) {
                autoSum();
            } else if (action.equals("Average")) {
                showAverage();
            } else if (action.equals("Maximum")) {
                showMax();
            } else if (action.equals("Minimum")) {
                showMin();
            }
        }
    }

}