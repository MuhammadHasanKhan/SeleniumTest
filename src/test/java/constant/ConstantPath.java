package constant;

public class ConstantPath {
    public static final int TIME_IN_SECONDS = 100;
    public static final int THREAD_SLEEP = 10;

    //---Registration_Form---//

    public static final String LOGIN_BUTTON_XPATH = "//i[contains(@class,'icon-user left')and normalize-space(text())='']";
    public static final String FIRST_NAME = "//*[@id=\"customer_firstname\"]";
    public static final String LAST_NAME = "//*[@id=\"customer_lastname\"]";
    public static final String PASSWORD = "//*[@id=\"passwd\"]";
    public static final String DAY = "//*[@id=\"days\"]/option[2]";
    public static final String MONTH = "//*[@id=\"months\"]/option[2]";
    public static final String YEAR = "//*[@id=\"years\"]/option[25]";
    public static final String STATE = "//*[@id=\"id_state\"]/option[34]";
    public static final String REGISTER_BUTTON = "//*[@id=\"submitAccount\"]/span";

    //---Place_an_order---//

    public static final String SIGNIN_EMAIL = "//*[@id=\"email\"]";
    public static final String BTN_SIGN_IN = "//*[@id=\"SubmitLogin\"]/span";
    public static final String BTN_WOMEN = "//*[@id=\"block_top_menu\"]/ul/li[1]/a";
    public static final String BTN_TOP = "//*[@id=\"subcategories\"]/ul/li[1]/div[1]/a/img";
    public static final String BTN_TSHIRT = "//*[@id=\"subcategories\"]/ul/li[1]/div[1]/a/img";
    public static final String PRODUCT = "//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img";
    public static final String BTN_ADD_TO_CART = "//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span";
    public static final String BTN_CONTINUE_SHOPPING = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span";
    public static final String BTN_HOME = "//*[@id=\"header_logo\"]/a/img";
    public static final String BTN_CART = "//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a";
    public static final String BTN_CHECKOUT = "//*[@id=\"button_order_cart\"]/span";
    public static final String BTN_PROCEED_1 = "//*[@id=\"center_column\"]/p[2]/a[1]/span";
    public static final String BTN_PROCEED_2 = "//*[@id=\"center_column\"]/form/p/button/span";
    public static final String BTN_PROCEED_3 = "//*[@id=\"form\"]/p/button/span";
    public static final String BTN_CONFIRM_ORDER = "//*[@id=\"cart_navigation\"]/button/span";
}
