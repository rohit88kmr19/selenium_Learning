package Oops_programme_cpncepts;

public enum APICons {
    // enum contains key value pairs of constants.

    BASE_URL("https://google.com"),
    LOGIN_PAGE("https://google.com"),
    DASHBOARD_PAGE("https://google.com");


  private String name;
    APICons(String name)
            {
                this.name=name;
            }

            public String getValue()
            {
                return name;
            }
}
