module com.minorprojects.snakeandladder {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.minorprojects.snakeandladder to javafx.fxml;
    exports com.minorprojects.snakeandladder;
}