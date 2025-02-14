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

        Label annualLabel = new Label("Annual Interest Rate:");
        annualLabel.setFont(font);
        GridPane.setHalignment(annualLabel, HPos.RIGHT);

        Label yearsLabel = new Label("Number of Years:");
        yearsLabel.setFont(font);
        GridPane.setHalignment(yearsLabel, HPos.RIGHT);

        Label amountLabel = new Label("Loan Amount:");
        amountLabel.setFont(font);
        GridPane.setHalignment(amountLabel, HPos.RIGHT);

        Label monthlyAmtLbl = new Label("Monthly Payment:");
        monthlyAmtLbl.setFont(font);
        GridPane.setHalignment(monthlyAmtLbl, HPos.RIGHT);

        Label totalAmtLbl = new Label("Total Payment:");
        totalAmtLbl.setFont(font);
        GridPane.setHalignment(totalAmtLbl, HPos.RIGHT);

        Label monthlyAmtResultLbl = new Label("---");
        monthlyAmtResultLbl.setFont(font);
        GridPane.setHalignment(monthlyAmtResultLbl, HPos.CENTER);

        Label totalAmtResultLbl = new Label("---");
        totalAmtResultLbl.setFont(font);
        GridPane.setHalignment(totalAmtResultLbl, HPos.CENTER);

        TextField annual = new TextField();
        annual.setFont(font);
        annual.setPrefWidth(50);
        annual.setAlignment(Pos.CENTER);

        TextField years = new TextField();
        years.setFont(font);
        years.setPrefWidth(50);
        years.setAlignment(Pos.CENTER);

        TextField amount = new TextField();
        amount.setFont(font);
        amount.setPrefWidth(50);
        amount.setAlignment(Pos.CENTER);

        setAlignment(Pos.CENTER);
        setHgap(20);
        setVgap(10);
        setStyle("-fx-background-color: #f0f0f0");

        add(annualLabel, 0, 0);
        add(annual, 1, 0);
        add(yearsLabel, 0, 1);
        add(years, 1, 1);
        add(amountLabel, 0, 2);
        add(amount, 1, 2);
        add(monthlyAmtLbl, 0, 3);
        add(monthlyAmtResultLbl, 1, 3);
        add(totalAmtLbl, 0, 4);
        add(totalAmtResultLbl, 1, 4);
    }

    public void processReturn(ActionEvent event)
    {

    }
}
