

import java.awt.Label;

import com.sun.glass.ui.MenuBar;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Mortgage {
	
	@FXML
    private TextField Gross_Income;
    @FXML
    private TextField Monthly_Debt;
    @FXML
    private TextField Mortgage_Interest_Rate;
    @FXML
    private MenuBar Terms;
    @FXML
    private TextField Down_payment;
    
    @FXML
    private TextField Cost;
    
    private String house;

	public String getHouse() {
		return house;
	}

	public void setHouse(String house) {
		this.house = house;
		Gross_Income.getText();
		Monthly_Debt.getText();
		Mortgage_Interest_Rate.getText();
		Terms.getMenus();
		Down_payment.getText();
	}
    
	public double CostOFHouse(float Monthley_Debt, float Gross_Income, float Mortage_Interest_Rate){
		return house.bigger();
	}
	@FXML
	Cost = house.bigger()*house.numberOfPayment();
	
	

}
