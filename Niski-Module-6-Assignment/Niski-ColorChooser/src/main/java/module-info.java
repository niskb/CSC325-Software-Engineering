module bcs.csc.niski.colorchooser {
    requires javafx.controls;
    requires javafx.fxml;

    opens bcs.csc.niski.colorchooser to javafx.fxml;
    exports bcs.csc.niski.colorchooser;
}
