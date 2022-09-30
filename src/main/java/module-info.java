module grupo.demo3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens grupo.demo3 to javafx.fxml;
    exports grupo.demo3;
    exports ControllersPersons;
    opens ControllersPersons to javafx.fxml;
    exports ControllerRun;
    opens ControllerRun to javafx.fxml;

}