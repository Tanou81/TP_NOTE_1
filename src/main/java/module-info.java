module com.example.tp_note_1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.tp_note_1 to javafx.fxml;
    exports com.example.tp_note_1;
}