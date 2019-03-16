package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;




public class Controller implements Initializable {


    @FXML
    private TableView<UserDetails> Tb1;
    @FXML
    private TableColumn<UserDetails,Integer>memberId;
    @FXML
    private TableColumn<UserDetails,  String>fullName;
    @FXML
    private TableColumn<UserDetails, String>emailAddress;
    @FXML
    private TableColumn<UserDetails, String>dateOfBirth;
    @FXML
    private TableColumn<UserDetails, String>mailingAddress;

    @FXML
    public AnchorPane buttons;
    @FXML
    public Button bt1;



    private dbConnection dc;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        dc = new dbConnection();
    }

    /*The loadData method controls the action of connecting to DB. "OnAction" in sample.fxml is connected to this. Method.*/
    public void loadData() {
        try{
        Connection conn = dc.Connect();
        ObservableList<UserDetails> data = FXCollections.observableArrayList();
        ResultSet rs= conn.createStatement().executeQuery("SELECT * FROM member");
        while(rs.next())
            data.add(new UserDetails(rs.getInt("memberId"), rs.getString("fullName"), rs.getString("emailAddress"), rs.getString("DateOfBirth"), rs.getString("mailingAddress")));
            Tb1.setItems(data);
        }catch(SQLException ex){
           System.err.println("Error" + ex);
        }



        memberId.setCellValueFactory(new PropertyValueFactory<UserDetails, Integer>("memberId"));
        fullName.setCellValueFactory(new PropertyValueFactory<UserDetails, String>("fullName"));
        emailAddress.setCellValueFactory(new PropertyValueFactory<UserDetails, String>("emailAddress"));
        dateOfBirth.setCellValueFactory(new PropertyValueFactory<UserDetails, String>("dateOfBirth"));
        mailingAddress.setCellValueFactory(new PropertyValueFactory<UserDetails, String>("mailingAddress"));



    }


}