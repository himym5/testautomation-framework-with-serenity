package com.cgm.life.testWithSerenitybdd.steps;
import com.cgm.life.testWithSerenitybdd.model.Category;
import com.cgm.life.testWithSerenitybdd.ui.CategoryNavigationBar;
import com.cgm.life.testWithSerenitybdd.ui.CurrentPage;
import com.cgm.life.testWithSerenitybdd.ui.EbayHomePage;

import static org.assertj.core.api.Assertions.assertThat;

public class NavigatingUser {

    EbayHomePage ebayHomePage;
    CurrentPage currentPage;
    CategoryNavigationBar categoryNavigationBar;

    public void isOnTheHomePage(){

        ebayHomePage.open();

    }

    public void shouldSeePageTitleContaining(String expectedTitle){

        assertThat(currentPage.getTitle()).containsIgnoringCase(expectedTitle);

    }

    public void navigatesToCategory(Category category){

        categoryNavigationBar.selectCategory(category);

    }
}
