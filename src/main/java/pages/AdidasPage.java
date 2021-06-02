package pages;

import org.openqa.selenium.By;

public class AdidasPage {

    private static By btnHandleUp=By.xpath("//button[@class='gl-modal__close']");

    private static final By inputSearch = By.xpath("//input[@class='searchinput___zXLAR']");
    private static By linkProduct;

    public static By getHomeLink() {
        return homeLink;
    }

    private static By homeLink = By.xpath("//a[contains(@data-auto-id,'logo')]");
    private static By lblProductValidation = By.xpath("//div[@class='product-description___2cJO2']/child::h1//span");


    public static By getInputSearch() {
        return inputSearch;
    }

    public static By getLinkProduct() {
        return linkProduct;
    }

    public static void setLinkProduct(String ruta) {
        AdidasPage.linkProduct = By.xpath("//img[contains(@src,'"+ruta+"')]//ancestor::a");
    }

    public static By getLblProductValidation() {

        return lblProductValidation;
    }


    public static By getBtnHandleUp() {
        return btnHandleUp;
    }




}
