package com.erp.step_definitions;

import com.erp.pages.DiscussPage;
import com.erp.utilities.BrowserUtils;
import com.erp.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class DiscussStepDefs {

    @Then("the page should have the title {string}")
    public void the_page_should_have_the_title(String expectedTitle) {
        DiscussPage discussPage = new DiscussPage();
        System.out.println("Driver.get().getTitle() = " + Driver.get().getTitle());
        Assert.assertEquals(expectedTitle, Driver.get().getTitle());

    }

    @When("user clicks the add channel button")
    public void user_clicks_the_add_channel_button() {
        DiscussPage discussPage = new DiscussPage();
        discussPage.addButton.click();

        discussPage.addChannel.sendKeys("Channel 10");
        discussPage.channel10.click();
        BrowserUtils.waitFor(1);

    }

    @Then("new channel should be displayed {string} under channels")
    public void new_channel_should_be_displayed_under_channels(String expectedChannel) {
        DiscussPage discussPage = new DiscussPage();
        String actualChannel = discussPage.channel10.getAttribute("title");

        Assert.assertEquals(expectedChannel,actualChannel);


    }


}
