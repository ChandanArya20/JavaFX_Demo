module in.ineuron.javafx_demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens in.ineuron.javafx_demo to javafx.fxml;
    exports in.ineuron.javafx_demo;
}