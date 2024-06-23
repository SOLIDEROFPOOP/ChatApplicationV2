module com.muratprojects.messengerserver {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.muratprojects.messengerserver to javafx.fxml;
    exports com.muratprojects.messengerserver;
}