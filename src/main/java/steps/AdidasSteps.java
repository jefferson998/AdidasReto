package steps;

import driver.SeleniumWebDriver;
import org.openqa.selenium.By;
import pages.AdidasPage;
import utils.Excel;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class AdidasSteps {
    private static ArrayList<Map<String, String>> lecturaExcel = new ArrayList<Map<String,String>>();
    public static String defaultWindows;

    public void escribirEnBuscador(By element, String text){
        boolean validarElemento=false;
        while (validarElemento==false){
            try {
                SeleniumWebDriver.driver.findElement(element).sendKeys(text);
                validarElemento=true;


            }catch (Exception e){


            }
        }

    }
    public void clickProducto(By element){
        boolean validarElemento=false;
        while(validarElemento==false){
            try {
                SeleniumWebDriver.driver.findElement(element).click();
                validarElemento=true;
            }catch (Exception e){

            }


        }

    }
    public String obtenerTextoDelProducto(By element){
        boolean validarElemento = false;
        String textElemento = "";
        while (validarElemento == false) {
            try {
                textElemento = SeleniumWebDriver.driver.findElement(element).getText();
                validarElemento = true;
            } catch (Exception e) {

            }
        }
        return textElemento;

    }
    public void validarBusquedaEnCardProduct(By element,String text){
        boolean validarTexto = false;
        if(obtenerTextoDelProducto(element).contains(text)) {
            validarTexto = true;
        }
        assertEquals(true, validarTexto);

    }
    public boolean isAlertPresent() {
        try {
            SeleniumWebDriver.driver.switchTo().alert();
            return true;
        } // try
        catch (Exception e) {
            return false;
        } // catch
    }

    public static void cambiarmeDeVentana() {
        defaultWindows = SeleniumWebDriver.driver.getWindowHandle();
        boolean validacionPantalla = false;
        while (validacionPantalla == false) {
            Set<String> lista = SeleniumWebDriver.driver.getWindowHandles();
            if(lista.size() > 1) {
                Iterator<String> I1 = lista.iterator();
                while (I1.hasNext()) {
                    String child_window = I1.next();

                    if (!defaultWindows.equals(child_window)) {
                        SeleniumWebDriver.driver.switchTo().window(child_window);
                    }
                }
                validacionPantalla = true;
            }
        }

    }

    public static void volverALaVentanaPrincipal() {
        SeleniumWebDriver.driver.switchTo().window(defaultWindows);
    }
    public void buscarProductoEnAdidasPage() {


        try {
            lecturaExcel = Excel.readExcel("C:\\Users\\Super\\Desktop\\Products.xlsx","ProductsReto");
        } catch (IOException e) {
            e.printStackTrace();
        }

//        for (int i = 0; i < 2; i++) {
            escribirEnBuscador(AdidasPage.getInputSearch(),lecturaExcel.get(0).get("Products"));
            try{
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_ENTER);
                robot.keyRelease(KeyEvent.VK_ENTER);

                AdidasPage.setLinkProduct(lecturaExcel.get(0).get("referencias"));
                clickProducto(AdidasPage.getLinkProduct());
                Thread.sleep(4000);

                cambiarmeDeVentana();
                Thread.sleep(4000);
                clickProducto(AdidasPage.getBtnHandleUp());
//                volverALaVentanaPrincipal();
//
//                validarBusquedaEnCardProduct(AdidasPage.getLblProductValidation(),lecturaExcel.get(i).get("Products"));




            }catch (Exception e){
                e.printStackTrace();
            }


//        }

//        for (int i = 0; i < lecturaExcel.size(); i++) {
//            escribirEnBuscador(AdidasPage.getInputSearch(), lecturaExcel.get(i).get("Products"));
//
//
//            Robot robot = null;
//            try {
//
//                robot = new Robot();
//                robot.keyPress(KeyEvent.VK_ENTER);
//                robot.keyRelease(KeyEvent.VK_ENTER);
//                Thread.sleep(5000);
//                AdidasPage.setLinkProduct(lecturaExcel.get(i).get("referencias"));
//                clickProducto(AdidasPage.getLinkProduct());
//                Thread.sleep(3000);
//               if (i==0){
//                   cambiarmeDeVentana();
//                   clickProducto(AdidasPage.getBtnHandleUp());
//
//               }
//                validarBusquedaEnCardProduct(AdidasPage.getLblProductValidation(),lecturaExcel.get(i).get("Products"));
//                Thread.sleep(2000);
//                clickProducto(AdidasPage.getHomeLink());
//
//            } catch (AWTException | InterruptedException e) {
//                e.printStackTrace();
//            }
//
//
//
//
//        }


    }










}
