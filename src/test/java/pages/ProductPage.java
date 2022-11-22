package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static utilities.DriverSetup.getDriver;

public class ProductPage extends BasePage{
//  public By MainManu = By.xpath("//body/div/div/header[@id='header']/div/div[@id='main-menu']/div/ul[@id='menu-menu']/li[@id='nav-menu-item-721']/a[1]");

    public By MainManu = By.xpath("//body/div/div/header[@id='header']/div/div[@id='main-menu']/div/ul[@id='menu-menu']/li[@id='nav-menu-item-721']/a[1]");
    public By SubManu = By.xpath("//li[@id='nav-menu-item-778']");
    public By Book = By.xpath("//li[1]//div[1]//a[1]//div[1]//img[1]");
    public By Card = By.xpath("//button[@value='6233']");

    public By viewCard=By.xpath("//div[@class='dropdown-toggle cart-head cart-head4']");

    public By checkOut=By.xpath("//a[@class='button checkout wc-forward']");

    public By FirstName=By.xpath("//input[@id='billing_first_name']");
    public By LastName=By.xpath("//input[@id='billing_last_name']");
    public By Country =By.xpath("//select[@name='billing_country']");

    public By Address=By.xpath("//input[@id='billing_address_1']");
    public By Postcode=By.xpath("//input[@id='billing_postcode']");
    public By Trems=By.id("terms");
    public By Place_Order=By.xpath("//input[@id='place_order']");
    public void  MAINMANU(){
        HoverA(MainManu);
    }
    public void  SUBMANU(){
        HoverB(SubManu);
    }
    public void SelectBook(){
        click(Book);

    }
    public void addCard(){
        click(Card);
    }

    public void ViewCard(){
        click(viewCard);
    }

    public void CheckOut(){
        click(checkOut);
    }
    public void firstname(String username) {
        writeText(FirstName, username);
    }
    public void lastname(String username) {
        writeText(LastName, username);
    }
     public void dropdown(){
      Dropdown(Country, "Canada");
     }
     public void UserAddress(String address){
        writeText(Address, address);
    }
    public void postcode(String postcode){
       writeText(Postcode, postcode);
    }
    public void TERMS(){
        click(Trems);
    }
    public void ORDER(){
        click(Place_Order);
    }



}
