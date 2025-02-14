module edu.farmingdale.dlamini_khayalamakhosi_loancalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.farmingdale.dlamini_khayalamakhosi_loancalculator to javafx.fxml;
    exports edu.farmingdale.dlamini_khayalamakhosi_loancalculator;
}