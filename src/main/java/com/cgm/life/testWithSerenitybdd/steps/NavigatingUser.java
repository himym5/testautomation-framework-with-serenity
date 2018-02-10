package com.cgm.life.testWithSerenitybdd.steps;
import com.cgm.life.testWithSerenitybdd.model.Category;
import com.cgm.life.testWithSerenitybdd.ui.CategoryNavigationBar;
import com.cgm.life.testWithSerenitybdd.ui.CurrentPage;
import com.cgm.life.testWithSerenitybdd.ui.EbayHomePage;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;


public class NavigatingUser {

    EbayHomePage ebayHomePage;
    CurrentPage currentPage;
    CategoryNavigationBar categoryNavigationBar;

    public void isOnTheHomePage(){

        ebayHomePage.open();

    }

    public void shouldSeePageTitleContaining(String expectedTitle){

        assertThat(currentPage.getTitle(), is(expectedTitle));

    }

    public void navigatesToCategory(Category category){

        categoryNavigationBar.selectCategory(category);

    }
}
