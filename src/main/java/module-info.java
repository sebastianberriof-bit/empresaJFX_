module uniquindio.edu.co.empresajfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens uniquindio.edu.co.empresajfx to javafx.fxml;
    exports uniquindio.edu.co.empresajfx;
}