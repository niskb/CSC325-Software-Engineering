module bcs.csc.niski.tipcalculator {
    requires javafx.controls;
    requires javafx.fxml;

    opens bcs.csc.niski.tipcalculator to javafx.fxml;
    exports bcs.csc.niski.tipcalculator;
}
