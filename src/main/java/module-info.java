module com.shinso.nega {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.shinso.nega to javafx.fxml;
    exports com.shinso.nega;
}