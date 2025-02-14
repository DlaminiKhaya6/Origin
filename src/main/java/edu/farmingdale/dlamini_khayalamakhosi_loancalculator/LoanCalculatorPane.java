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
    //Establishing all components in the field
    private Label annualLabel, yearsLabel, amountLabel, monthlyAmtLbl, totalAmtLbl, monthlyAmtResultLbl, totalAmtResultLbl;
    private Button calculateButton;
    private TextField annual, years, amount;

    //method where all loans are calculated
    public LoanCalculatorPane()
    {
        //creating fonts
        Font font = new Font(20);

        //creation of labels
        annualLabel = new Label("Annual Interest Rate:");
        annualLabel.setFont(font);
        GridPane.setHalignment(annualLabel, HPos.RIGHT);

        yearsLabel = new Label("Number of Years:");
        yearsLabel.setFont(font);
        GridPane.setHalignment(yearsLabel, HPos.RIGHT);

        amountLabel = new Label("Loan Amount:");
        amountLabel.setFont(font);
        GridPane.setHalignment(amountLabel, HPos.RIGHT);

        monthlyAmtLbl = new Label("Monthly Payment:");
        monthlyAmtLbl.setFont(font);
        GridPane.setHalignment(monthlyAmtLbl, HPos.RIGHT);

        totalAmtLbl = new Label("Total Payment:");
        totalAmtLbl.setFont(font);
        GridPane.setHalignment(totalAmtLbl, HPos.RIGHT);

        monthlyAmtResultLbl = new Label("---");
        monthlyAmtResultLbl.setFont(font);
        GridPane.setHalignment(monthlyAmtResultLbl, HPos.CENTER);

        totalAmtResultLbl = new Label("---");
        totalAmtResultLbl.setFont(font);
        GridPane.setHalignment(totalAmtResultLbl, HPos.CENTER);

        //creation of textfields
        annual = new TextField();
        annual.setFont(font);
        annual.setPrefWidth(150);
        annual.setAlignment(Pos.CENTER);

        years = new TextField();
        years.setFont(font);
        years.setPrefWidth(150);
        years.setAlignment(Pos.CENTER);

        amount = new TextField();
        amount.setFont(font);
        amount.setPrefWidth(150);
        amount.setAlignment(Pos.CENTER);

        //creation of buttons
        calculateButton = new Button("Calculate");
        calculateButton.setOnAction(this::processCalcButton);

        //setting all spaces between/alignments of program
        setAlignment(Pos.CENTER);
        setHgap(20);
        setVgap(10);
        setStyle("-fx-background-color: #f0f0f0");

        //adding components to program
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
        add(calculateButton, 1, 5);

    }

    //method that calculates the interest
    public void processCalcButton(ActionEvent event)
    {
        if(event.getSource() == calculateButton)
        {
            double annualInt = Double.parseDouble(annual.getText());
            int yearsInt = Integer.parseInt(years.getText());
            double amountInt = Double.parseDouble(amount.getText());
            double totalAmt = amountInt * (1 + (annualInt/100)*yearsInt);
            double monthlyAmt = totalAmt / (yearsInt * 12);
            monthlyAmtResultLbl.setText("Monthly Amount: " + monthlyAmt);
            totalAmtResultLbl.setText("Total Amount: " + totalAmt);
        }
    }
}
