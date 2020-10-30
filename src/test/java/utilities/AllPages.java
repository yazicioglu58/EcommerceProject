package utilities;

import pages.*;

public class AllPages {
    private BlousesPage blousesPage;
    private CasualDressesPage casualDressesPage;
    private EveningDressesPage eveningDressesPage;
    private HomePage homePage;
    private MainPage mainPage;
    private SummerDressesPage summerDressesPage;
    private TshirtPage tshirtPage;
    private WomenPage womenPage;

    public BlousesPage blousesPage(){
        if(blousesPage == null){
            blousesPage = new BlousesPage();
        }
        return blousesPage;
    }
    public CasualDressesPage casualDressesPage(){
        if(casualDressesPage == null){
            casualDressesPage = new CasualDressesPage();
        }
        return casualDressesPage;
    }
    public EveningDressesPage eveningDressesPage(){
        if(eveningDressesPage == null){
            eveningDressesPage = new EveningDressesPage();
        }
        return eveningDressesPage;
    }
    public HomePage homePage() {
        if (homePage == null) {
            homePage = new HomePage();
        }
        return homePage;
    }
    public MainPage mainPage(){
        if(mainPage == null){
            mainPage = new MainPage();
        }
        return mainPage;
    }
    public SummerDressesPage summerDressesPage(){
        if(summerDressesPage == null){
            summerDressesPage = new SummerDressesPage();
        }
        return summerDressesPage;
    }
    public WomenPage womenPage(){
        if(womenPage == null){
            womenPage = new WomenPage();
        }
        return womenPage;
    }

}
