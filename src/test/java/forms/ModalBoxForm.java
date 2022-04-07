package forms;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class ModalBoxForm extends Form {
    private final ILabel closeModalBox = getElementFactory().getLabel(By.xpath("//span[contains(text(),'©lose')]"),"close modal box");

    public ModalBoxForm() {
        super(By.xpath("//div[@class='modal__box']"), "modal box");
    }

    public void closeModalBox(){
        closeModalBox.click();
    }

}
