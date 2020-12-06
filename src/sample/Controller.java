package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private TextField doh1;

    @FXML
    private TextField doh2;

    @FXML
    private TextField doh3;

    @FXML
    private TextField doh4;

    @FXML
    private TextField doh5;

    @FXML
    private CheckBox os1;

    @FXML
    private TextField broj_djece;

    @FXML
    private CheckBox os3;

    @FXML
    private CheckBox os2;

    @FXML
    private TextField iznos_poreza;

    @FXML
    private TextField ukupan_iznos;

    @FXML
    private Button izracunaj;

    @FXML
    private Label detalj1;

    @FXML
    private Label detalj2;

    @FXML
    private Label detalj3;

    @FXML
    private Label detalj4;

    @FXML
    private Label detalj5;

    @FXML
    private Label detalj6;

    @FXML
    private Label detalj7;

    @FXML
    private Label detalj8;

    @FXML
    private Label detalj9;

    @FXML
    private Label detalj10;

    @FXML
    private Label detalj11;

    @FXML
    private Label detalj12;

    @FXML
    private Label detalj13;

    public void izracun(ActionEvent actionEvent) {
        if (actionEvent.getSource() == izracunaj) {
            Double prviDohodak = Double.valueOf(doh1.getText());
            Double drugiDohodak = Double.valueOf(doh2.getText());
            Double treciDohodak = Double.valueOf(doh3.getText());
            Double cetvrtiDohodak = Double.valueOf(doh4.getText());
            Double petiDohodak = Double.valueOf(doh5.getText());
            Double osobniOdbitak = 45000.00;
            Double rezultatDohotka = prviDohodak + drugiDohodak + treciDohodak + cetvrtiDohodak + petiDohodak - osobniOdbitak;
            Double brojDjece = Double.valueOf(broj_djece.getText());
            Double djecaOdbitak;
            Double rezultatDjeca = null;

            // provjeravanje broja djece za textField brojDjece
            // izracunavanje ukupnog iznosa
            if (brojDjece == 0) {
                djecaOdbitak = 0.00;
                rezultatDjeca = rezultatDohotka - djecaOdbitak;
                ukupan_iznos.setText(String.valueOf(rezultatDjeca));
                detalj6.setText(String.valueOf(djecaOdbitak));
            }
            else if (brojDjece == 1) {
                djecaOdbitak = 21000.00;
                rezultatDjeca = rezultatDohotka - djecaOdbitak;
                ukupan_iznos.setText(String.valueOf(rezultatDjeca));
                detalj6.setText(String.valueOf(djecaOdbitak));
            }
            else if(brojDjece == 2){
                djecaOdbitak = 30000.00;
                rezultatDjeca = rezultatDohotka - djecaOdbitak;
                ukupan_iznos.setText(String.valueOf(rezultatDjeca));
                detalj6.setText(String.valueOf(djecaOdbitak));
            }
            else if(brojDjece == 3){
                djecaOdbitak = 42000.00;
                rezultatDjeca = rezultatDohotka - djecaOdbitak;
                ukupan_iznos.setText(String.valueOf(rezultatDjeca));
                detalj6.setText(String.valueOf(djecaOdbitak));
            }
            else if(brojDjece == 4){
                djecaOdbitak = 57000.00;
                rezultatDjeca = rezultatDohotka - djecaOdbitak;
                ukupan_iznos.setText(String.valueOf(rezultatDjeca));
                detalj6.setText(String.valueOf(djecaOdbitak));
            }
            else if(brojDjece == 5){
                djecaOdbitak = 75000.00;
                rezultatDjeca = rezultatDohotka - djecaOdbitak;
                ukupan_iznos.setText(String.valueOf(rezultatDjeca));
                detalj6.setText(String.valueOf(djecaOdbitak));
            }
            else if(brojDjece == 6){
                djecaOdbitak = 96000.00;
                rezultatDjeca = rezultatDohotka - djecaOdbitak;
                ukupan_iznos.setText(String.valueOf(rezultatDjeca));
                detalj6.setText(String.valueOf(djecaOdbitak));
            }
            else if(brojDjece == 7){
                djecaOdbitak = 120000.00;
                rezultatDjeca = rezultatDohotka - djecaOdbitak;
                ukupan_iznos.setText(String.valueOf(rezultatDjeca));
                detalj6.setText(String.valueOf(djecaOdbitak));
            }
            else if(brojDjece == 8){
                djecaOdbitak = 147000.00;
                rezultatDjeca = rezultatDohotka - djecaOdbitak;
                ukupan_iznos.setText(String.valueOf(rezultatDjeca));
                detalj6.setText(String.valueOf(djecaOdbitak));
            }
            else if(brojDjece == 9){
                djecaOdbitak = 177000.00;
                rezultatDjeca = rezultatDohotka - djecaOdbitak;
                ukupan_iznos.setText(String.valueOf(rezultatDjeca));
                detalj6.setText(String.valueOf(djecaOdbitak));
            }

            // provjeravanje oznacenosti 3 checkBox-a
            if(os1.isSelected()) {
                Double prviUzdrzavani = 21000.00;
                Double prviRezultat = rezultatDjeca - prviUzdrzavani;
                ukupan_iznos.setText(String.valueOf(prviRezultat));
                detalj7.setText(String.valueOf(prviUzdrzavani));
            }
            if(os2.isSelected()){
                Double drugiUzdrzavani = 12000.00;
                Double drugiRezultat = rezultatDjeca - drugiUzdrzavani;
                ukupan_iznos.setText(String.valueOf(drugiRezultat));
                detalj8.setText(String.valueOf(drugiUzdrzavani));
            }
            if(os3.isSelected()){
                Double treciUzdrzavani = 45000.00;
                Double treciRezultat = rezultatDjeca - treciUzdrzavani;
                ukupan_iznos.setText(String.valueOf(treciRezultat));
                detalj9.setText(String.valueOf(treciUzdrzavani));
            }
            if(os1.isSelected() && os2.isSelected()) {
                Double cetvrtiUzdrzavani = 21000.00 + 12000.00;
                Double cetvrtiRezultat = rezultatDjeca - cetvrtiUzdrzavani;
                ukupan_iznos.setText(String.valueOf(cetvrtiRezultat));
            }
            if(os1.isSelected() && os3.isSelected()) {
                Double petiUzdrzavani = 21000.00 + 45000.00;
                Double petiRezultat = rezultatDjeca - petiUzdrzavani;
                ukupan_iznos.setText(String.valueOf(petiRezultat));
            }
            if(os2.isSelected() && os3.isSelected()) {
                Double sestiUzdrzavani = 12000.00 + 45000.00;
                Double sestiRezultat = rezultatDjeca - sestiUzdrzavani;
                ukupan_iznos.setText(String.valueOf(sestiRezultat));
            }
            if(os1.isSelected() && os2.isSelected() && os3.isSelected()) {
                Double sedmiUzdrzavani = 21000.00 + 12000.00 + 45000.00;
                Double sedmiRezultat = rezultatDjeca - sedmiUzdrzavani;
                ukupan_iznos.setText(String.valueOf(sedmiRezultat));
            }

            //izracunavanje poreza na osnovu ukupnog iznosa
            Double iznosPoreza = Double.valueOf(ukupan_iznos.getText());
            detalj10.setText(String.valueOf(iznosPoreza));
            if(iznosPoreza < 360000.00){
                Double prviUkupniPorez = iznosPoreza * 0.24;
                iznos_poreza.setText(String.valueOf(prviUkupniPorez));
                detalj11.setText(String.valueOf(prviUkupniPorez));
            }
            else {
                Double drugiUkupniPorez = iznosPoreza * 0.36;
                iznos_poreza.setText(String.valueOf(drugiUkupniPorez));
                detalj11.setText(String.valueOf(drugiUkupniPorez));
            }

            //prikaz detalja određenoog izracuna
            detalj1.setText(String.valueOf(prviDohodak));
            detalj2.setText(String.valueOf(drugiDohodak));
            detalj3.setText(String.valueOf(treciDohodak));
            detalj4.setText(String.valueOf(cetvrtiDohodak));
            detalj5.setText(String.valueOf(petiDohodak));
            detalj12.setText(String.valueOf(rezultatDohotka));
            detalj13.setText(String.valueOf(osobniOdbitak));
        }
    }
}



