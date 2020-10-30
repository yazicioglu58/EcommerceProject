package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EveningDressesPage {

    public EveningDressesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
