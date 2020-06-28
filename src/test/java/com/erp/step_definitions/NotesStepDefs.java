package com.erp.step_definitions;

import com.erp.pages.NotesPage;
import com.erp.utilities.BrowserUtils;
import com.erp.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class NotesStepDefs {

    NotesPage notesPage = new NotesPage();

    @Then("user click to create button")
    public void user_click_to_create_button() {
        //  BrowserUtils.waitFor(3);
        BrowserUtils.clickWithJS(notesPage.createButton);
    }

    @Then("user able to write {string} in writepad")
    public void user_able_to_write_in_writepad(String string) {
        //     BrowserUtils.waitFor(3);
        notesPage.writingPad.sendKeys(string);
    }

    @Then("user able to click save")
    public void user_able_to_click_save() {
        notesPage.saveButton.click();
    }

    @Given("user able to see {string} in page")
    public void user_able_to_see_in_page(String expectedMessage) {
        //  BrowserUtils.waitFor(3);
        String actualMessage=notesPage.notesPano.getText();
        Assert.assertEquals(expectedMessage,actualMessage);
    }

    @Then("user must click to {string}")
    public void userMustClickTo(String modulName) {
        BrowserUtils.waitFor(3);
        notesPage.navigateTo(modulName);
    }
    @When("user able to user click to import button")
    public void user_able_to_user_click_to_import_button() {
        notesPage.importbutton.click();
    }

    @When("user able to click to Load file")
    public void user_able_to_click_to_Load_file() {
     notesPage.loadFile.click();
       notesPage.choosePath.sendKeys("C:\\Users\\muham\\Desktop\\SDET\\Coding\\BriteERPGroup10\\src\\test\\resources\\SampleData.xlsx");

    }

    @Then("user able to upload the file")
    public void user_able_to_upload_the_file() {

        String expectedResult="Import a File - Odoo";
        Assert.assertEquals(expectedResult,Driver.get().getTitle());
    }

    @When("user able to click edit")
    public void user_able_to_click_edit() {

        notesPage.editButton.click();

    }


}
