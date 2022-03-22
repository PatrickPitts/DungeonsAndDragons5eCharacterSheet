module org.nerdcore.dungeonsanddragons5echaractersheet {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.json;
    requires java.sql;

    opens org.nerdcore.dungeonsanddragons5echaractersheet to javafx.fxml;
    exports org.nerdcore.dungeonsanddragons5echaractersheet;
}