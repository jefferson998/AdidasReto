package pages;

import org.openqa.selenium.By;

public class AdidasPage {


    public static By getInputSearch() {
        return inputSearch;
    }

    private static final By inputSearch = By.xpath("//input[@class='searchinput___zXLAR']");


    public static By getFirstProduct() {
        return firstProduct;
    }

    public static By getLinkProduct() {
        return linkProduct;
    }

    public static void setLinkProduct(String ruta) {
        AdidasPage.linkProduct = By.xpath("//img[contains(@src,'"+ruta+"')]//ancestor::a");
    }

    private static By linkProduct;


    private static By firstProduct=By.xpath("//img[contains(@src,'https://assets.adidas.com/images/w_383,h_383,f_auto,q_auto:sensitive,fl_lossy/07bfe4df4cff44c1b474ac72011ff1bd_9366/tenis-4d-fusio.jpg')]//ancestor::a");

    public By getSecondProduct() {
        return secondProduct;
    }

    private static By secondProduct=By.xpath("//img[contains(@src,'https://assets.adidas.com/images/w_383,h_383,f_auto,q_auto:sensitive,fl_lossy/f24a086fa5954f0fa8abac5300b1b92e_faec/tapabocas-adidas-pack-de-3.jpg')]//ancestor::a");

    public static By getThirdProduct() {
        return thirdProduct;
    }

    public static By getFourthProduct() {
        return fourthProduct;
    }

    public static By getFifthProduct() {
        return fifthProduct;
    }

    private static By thirdProduct=By.xpath("//img[contains(@src,'https://assets.adidas.com/images/w_383,h_383,f_auto,q_auto:sensitive,fl_lossy/801e88f5897a411a9e77a8ba0101c79a_9366/tenis-nmd_r1.jpg')]//ancestor::a");
    private static By fourthProduct=By.xpath("//img[contains(@src,'https://assets.adidas.com/images/w_383,h_383,f_auto,q_auto:sensitive,fl_lossy/7af3a3f152a740a9b972ab8a013b6ab9_9366/buzo-con-capucha-trifolio.jpg')]//ancestor::a");
    private static By fifthProduct=By.xpath("//img[contains(@src,'https://assets.adidas.com/images/w_383,h_383,f_auto,q_auto:sensitive,fl_lossy/1f03204628c14f499119ab73012f95e3_9366/camiseta-titular-seleccion-colombia.jpg')]//ancestor::a");

    public static By getHomeLink() {
        return homeLink;
    }

    private static By homeLink = By.xpath("//a[contains(@data-auto-id,'logo')]");

    public static By getLblProductValidation() {

        return lblProductValidation;
    }



    private static By lblProductValidation = By.xpath("//div[@class='product-description___2cJO2']/child::h1//span");

    public static By getBtnHandleUp() {
        return btnHandleUp;
    }

    private static By btnHandleUp=By.xpath("//button[@class='gl-modal__close']");


}
