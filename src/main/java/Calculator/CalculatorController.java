package Calculator;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import javafx.event.ActionEvent;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
public class CalculatorController {
    
    @FXML private TextField displayField;
    @FXML private ListView<String> historyListView;
    @FXML private Button piButton, eButton, lnButton, sinButton, cosButton, tanButton, arcsinButton, arccosButton, arctanButton, logButton;
    @FXML private Label angleModeLabel;
    @FXML private Button equalsButton;
    
    private boolean sciMode = false;
    private boolean isDegrees = true;
    private boolean historyVisible = false;
    private int savedCursorPos = 0;
    private boolean caretBeingUsed = false;
    private static final double EPSILON = 1e-12;

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    @FXML private void initialize() {
        equalsButton.setDefaultButton(true);
        // Saves caret position after it moves in any way unless another part of the program prohibits it
        displayField.caretPositionProperty().addListener((obs, oldPos, newPos) -> {
        if (displayField.isFocused() && !caretBeingUsed) {
            savedCursorPos = newPos.intValue();
            }
        }
        );
    }

    @FXML private void onButtonClick(ActionEvent event) {
        Button clicked = (Button) event.getSource();
        String text = clicked.getText();
        
        switch (text) {
            case "|  |":
                insertAbsBrackets();
                break;
            case "-->":
                if (savedCursorPos < displayField.getText().length()){
                    caretBeingUsed = true;
                    displayField.requestFocus();
                    savedCursorPos += 1;
                    displayField.positionCaret(savedCursorPos);
                    caretBeingUsed = false;
                    break;
                }
                else {
                    caretBeingUsed = true;
                    displayField.requestFocus();
                    savedCursorPos = displayField.getText().length();
                    displayField.positionCaret(savedCursorPos);
                    caretBeingUsed = false;
                    break;
                }
            case "<--":
                if (savedCursorPos != 0 && savedCursorPos <= displayField.getText().length()){
                    caretBeingUsed = true;
                    displayField.requestFocus();
                    savedCursorPos -= 1;
                    displayField.positionCaret(savedCursorPos);
                    caretBeingUsed = false;
                    break;
                }
                else {
                    caretBeingUsed = true;
                    displayField.requestFocus();
                    displayField.positionCaret(savedCursorPos);
                    caretBeingUsed = false;
                    break;
                }
            case "C":
                displayField.clear();
                displayField.requestFocus();
                savedCursorPos = 0;
                break;
            case "DEL":
                String current = displayField.getText();
                if (current.isEmpty() || (savedCursorPos - 1 < 0 && !(current.equals("Error") || current.equals("NaN")))){
                    displayField.requestFocus();
                    displayField.deselect();
                    break;
                }
                else if (current.equals("Error") || current.equals("NaN")){
                    displayField.clear();
                    displayField.requestFocus();
                    savedCursorPos = 0;
                    break;
                }
                else if (!current.isEmpty()) {
                    String newTextDel = current.substring(0, savedCursorPos - 1) + current.substring(savedCursorPos);
    
                    caretBeingUsed = true;
                    displayField.setText(newTextDel);
                    displayField.requestFocus();
                    savedCursorPos -= 1;
                    displayField.positionCaret(savedCursorPos);
                    caretBeingUsed = false;
                    break;
                }
            case "√":
                String currentTextSqrt = displayField.getText();
                String newTextSqrt = currentTextSqrt.substring(0, savedCursorPos) + "√()" + currentTextSqrt.substring(savedCursorPos);
    
                caretBeingUsed = true;
                displayField.setText(newTextSqrt);
                displayField.requestFocus();
                savedCursorPos = savedCursorPos + 2;
                displayField.positionCaret(savedCursorPos);
                displayField.deselect();
                caretBeingUsed = false;
                break;
            case "(":
                String currentTextOpenParen = displayField.getText();
                String newTextOpenParen = currentTextOpenParen.substring(0, savedCursorPos) + "(" + currentTextOpenParen.substring(savedCursorPos);
    
                caretBeingUsed = true;
                displayField.setText(newTextOpenParen);
                displayField.requestFocus();
                savedCursorPos = savedCursorPos + 1;
                displayField.positionCaret(savedCursorPos);
                displayField.deselect();
                caretBeingUsed = false;
                break;
            case "^":
                if (!displayField.getText().isEmpty() && !(displayField.getText().substring(savedCursorPos-1 ,savedCursorPos).equals(" "))){
                    String currentTextEx = displayField.getText();
                    String newTextEx = currentTextEx.substring(0, savedCursorPos) + "^()" + currentTextEx.substring(savedCursorPos);
    
                    caretBeingUsed = true;
                    displayField.setText(newTextEx);
                    displayField.requestFocus();
                    savedCursorPos = savedCursorPos + 2;
                    displayField.positionCaret(savedCursorPos);
                    displayField.deselect();
                    caretBeingUsed = false;
                    break;
                }
                else {
                    caretBeingUsed = true;
                    displayField.requestFocus();
                    displayField.deselect();
                    displayField.positionCaret(savedCursorPos);
                    caretBeingUsed = false;
                    break;
                }
            case "[-]":
                String currentTextNeg = displayField.getText();
                String newTextNeg = currentTextNeg.substring(0, savedCursorPos) + "-" + currentTextNeg.substring(savedCursorPos);
    
                caretBeingUsed = true;
                displayField.setText(newTextNeg);
                displayField.requestFocus();
                savedCursorPos = savedCursorPos + 1;
                displayField.positionCaret(savedCursorPos);
                caretBeingUsed = false;
                break;
            case "sin", "cos", "tan", "log":
                String currentTextTrig1 = displayField.getText();
                String newTextTrig1 = currentTextTrig1.substring(0, savedCursorPos) + text + "()" + currentTextTrig1.substring(savedCursorPos);
    
                caretBeingUsed = true;
                displayField.setText(newTextTrig1);
                displayField.requestFocus();
                savedCursorPos = savedCursorPos + 4;
                displayField.positionCaret(savedCursorPos);
                caretBeingUsed = false;
                break;
            case "arcsin", "arccos", "arctan":
                String currentTextTrig2 = displayField.getText();
                String newTextTrig2 = currentTextTrig2.substring(0, savedCursorPos) + text + "()" + currentTextTrig2.substring(savedCursorPos);
    
                caretBeingUsed = true;
                displayField.setText(newTextTrig2);
                displayField.requestFocus();
                savedCursorPos = savedCursorPos + 7;
                displayField.positionCaret(savedCursorPos);
                caretBeingUsed = false;
                break;
            case "ln":
                String currentTextLn = displayField.getText();
                String newTextLn = currentTextLn.substring(0, savedCursorPos) + "ln()" + currentTextLn.substring(savedCursorPos);
    
                caretBeingUsed = true;
                displayField.setText(newTextLn);
                displayField.requestFocus();
                savedCursorPos = savedCursorPos + 3;
                displayField.positionCaret(savedCursorPos);
                caretBeingUsed = false;
                break;
            case " = ":
                calculate();
                displayField.requestFocus();
                displayField.positionCaret(displayField.getText().length());
                break;
            default:
                String currentText = displayField.getText();
                String newText = currentText.substring(0, savedCursorPos) + text + currentText.substring(savedCursorPos);
    
                caretBeingUsed = true;
                displayField.setText(newText);
                displayField.requestFocus();
                savedCursorPos = savedCursorPos + text.length();
                displayField.positionCaret(savedCursorPos);
                caretBeingUsed = false;
                break;
        }
    }

    @FXML private void toggleSciShift() {
        sciMode = !sciMode;
            piButton.setVisible(sciMode ? true : false);
            eButton.setVisible(sciMode ? true : false);
            lnButton.setVisible(sciMode ? true : false);
            sinButton.setVisible(sciMode ? true : false);
            cosButton.setVisible(sciMode ? true : false);
            tanButton.setVisible(sciMode ? true : false);
            arcsinButton.setVisible(sciMode ? true : false);
            arccosButton.setVisible(sciMode ? true : false);
            arctanButton.setVisible(sciMode ? true : false);
            logButton.setVisible(sciMode ? true : false);
        caretBeingUsed = true;
        displayField.requestFocus();
        displayField.positionCaret(savedCursorPos);
        caretBeingUsed = false;
    }

    @FXML private void toggleAngleMode() {
        isDegrees = !isDegrees;
        angleModeLabel.setText(isDegrees ? "DEG" : "RAD");

        caretBeingUsed = true;
        displayField.requestFocus();
        displayField.positionCaret(savedCursorPos);
        caretBeingUsed = false;
    }

    @FXML private void toggleHistory() {
        historyVisible = !historyVisible;
        historyListView.setVisible(historyVisible);
        historyListView.setPrefHeight(historyVisible ? 220 : 0);

        caretBeingUsed = true;
        displayField.requestFocus();
        displayField.positionCaret(savedCursorPos);
        caretBeingUsed = false;
    }
//-----------------------------------------------------------------------------------------------------------------------------------------------------
    private void calculate() {
    try {
        String expression = displayField.getText();
        double result = evaluate(expression);

        if (Math.abs(result) < EPSILON) {
            result = 0.0;
        }

        if (Math.abs(result - Math.round(result)) < EPSILON) {
            result = Math.round(result);
        }

        DecimalFormat df = new DecimalFormat("0.############");
        df.setRoundingMode(RoundingMode.HALF_UP);

        if (result == (long) result) {
            displayField.setText(String.valueOf((long) result));
            historyListView.getItems().add(expression + " = " + (long) result);
        } else {
            displayField.setText(String.valueOf(df.format(result)));
            historyListView.getItems().add(expression + " = " + df.format(result));
        }
    } catch (Exception e) {
        historyListView.getItems().add(displayField.getText());
        displayField.setText("Error");
    }
}
    
    private double evaluate(String expr) {
    try {
        expr = expr.replace(" x ", "*");
        expr = expr.replace(" ÷ ", "/");
        expr = expr.replace(" % ", "%");
        expr = expr.replace(" + ", "+");
        expr = expr.replace(" – ", "-");
        expr = expr.replace("x", "*");
        expr = expr.replace("÷", "/");

        expr = expr.replace("π", String.valueOf(Math.PI));
        expr = expr.replace("e", String.valueOf(Math.E));

        expr = expr.replace("√(", "sqrt(");
        expr = expr.replaceFirst("\\|", "abs(");
        expr = expr.replaceFirst("\\|", ")");

        if (isDegrees){
            expr = expr.replace("arcsin(", "((180/pi)*ASIN_TEMP");
            expr = expr.replace("arccos(", "((180/pi)*ACOS_TEMP");
            expr = expr.replace("arctan(", "((180/pi)*ATAN_TEMP");

            expr = expr.replace("sin(", "sin((pi/180)*");
            expr = expr.replace("cos(", "cos((pi/180)*");
            expr = expr.replace("tan(", "tan((pi/180)*");

            expr = expr.replace("ASIN_TEMP", "asin");
            expr = expr.replace("ACOS_TEMP", "acos");
            expr = expr.replace("ATAN_TEMP", "atan");
        } 
        else {
            expr = expr.replace("arcsin(", "asin(");
            expr = expr.replace("arccos(", "acos(");
            expr = expr.replace("arctan(", "atan(");
        }

        expr = expr.replace("log(", "log10(");
        expr = expr.replace("ln(", "log(");


        Expression expression = new ExpressionBuilder(expr).build();
        return expression.evaluate();

    } catch (Exception e) {
        throw new RuntimeException("Error");
    }
}
    
    private void insertAbsBrackets() {
    String current = displayField.getText();
    String newText = current.substring(0, savedCursorPos) + "||" + current.substring(savedCursorPos);
    
    caretBeingUsed = true;
    displayField.setText(newText);
    displayField.requestFocus();
    savedCursorPos = savedCursorPos + 1;
    displayField.positionCaret(savedCursorPos);
    displayField.deselect();
    caretBeingUsed = false;
}
}