package edu.farmingdale.dlamini_khayalamakhosi_loancalculator;
import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

public class LoanCalculatorPane extends GridPane
{
    private Label result;
    private TextField input;

    public LoanCalculatorPane()
    {
        Font font = new Font(20);

        Label inputLabel = new Label("Enter Loan Amount");
        inputLabel.setFont(font);
        GridPane.setHalignment(inputLabel, HPos.RIGHT);

        Label outputLabel = new Label("Exit amount");
        outputLabel.setFont(font);
        GridPane.setHalignment(outputLabel, HPos.RIGHT);

        Label result = new Label("---");
        result.setFont(font);
        GridPane.setHalignment(result, HPos.CENTER);

        TextField loan = new TextField();
        loan.setFont(font);
        loan.setPrefWidth(50);
        loan.setAlignment(Pos.CENTER);

        setAlignment(Pos.CENTER);
        setHgap(20);
        setVgap(10);
        setStyle("-fx-background-color: #f0f0f0");

        add(inputLabel, 0, 0);
        add(loan, 1, 0);
        add(outputLabel, 0, 1);
        add(result, 1, 1);
    }
}
