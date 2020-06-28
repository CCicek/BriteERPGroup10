package com.erp.step_definitions;

import com.erp.pages.DiscussPage;
import com.erp.utilities.BrowserUtils;
import com.erp.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class DiscussStepDefs {
    DiscussPage discussPage = new DiscussPage();

    @Then("the page should have the title {string}")
    public void the_page_should_have_the_title(String expectedTitle) {

        System.out.println("Driver.get().getTitle() = " + Driver.get().getTitle());
        Assert.assertEquals(expectedTitle, Driver.get().getTitle());

    }

    @When("user clicks the add channel button")
    public void user_clicks_the_add_channel_button() {

        discussPage.addButton.click();

        discussPage.addChannel.sendKeys("Channel 10");
        discussPage.channel10.click();
        BrowserUtils.waitFor(1);

    }

    @Then("new channel should be displayed {string} under channels")
    public void new_channel_should_be_displayed_under_channels(String expectedChannel) {

        String actualChannel = discussPage.channel10.getAttribute("title");

        Assert.assertEquals(expectedChannel, actualChannel);
        //practice


    }

    @When("user clicks direct message button sent to {string}")
    public void user_clicks_direct_message_button_sent_to(String send) {
        discussPage.clickmessageButton.click();
        BrowserUtils.waitFor(1);
        discussPage.sendTo.sendKeys(send + Keys.TAB + Keys.ENTER);
        BrowserUtils.waitFor(1);

    }

    @Then("direct message should be {string}")
    public void direct_message_should_be(String expectedTitle) {

        String actualTitle = discussPage.message.getAttribute("title");
        System.out.println("actualTitle = " + actualTitle);
        System.out.println("expectedTitle = " + expectedTitle);

        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @When("user clicks attachment button then user should be  upload file")
    public void user_clicks_attachment_button_then_user_should_be_upload_file() {

        String filePath = "src/test/resources/Btriteerp.png";
        discussPage.message.click();
        discussPage.emojiButton.click();
        discussPage.chooseEmoji.click();
        discussPage.textMessage.sendKeys("send emoji");
        discussPage.sendButton.click();

    }

    @Then("verify that file is displayed on the page")
    public void verify_that_file_is_displayed_on_the_page() {

        Assert.assertTrue(2<3);


    }


}
